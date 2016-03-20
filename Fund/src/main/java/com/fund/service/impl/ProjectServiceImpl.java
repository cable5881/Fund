package com.fund.service.impl;

import java.io.File;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fund.exception.ProjectException;
import com.fund.mapper.BenificiaryUnitMapper;
import com.fund.mapper.BenificiarycontactMapper;
import com.fund.mapper.BonusnoticeMapper;
import com.fund.mapper.CountsMapper;
import com.fund.mapper.DonationcontactMapper;
import com.fund.mapper.DonationmodeMapper;
import com.fund.mapper.DonationunitMapper;
import com.fund.mapper.DonorMapper;
import com.fund.mapper.FilesMapper;
import com.fund.mapper.FundtypeMapper;
import com.fund.mapper.InbillMapper;
import com.fund.mapper.MoneycheckMapper;
import com.fund.mapper.NewstypeMapper;
import com.fund.mapper.NewsurlMapper;
import com.fund.mapper.OutbillMapper;
import com.fund.mapper.ProjectMapper;
import com.fund.mapper.ProjecttypeMapper;
import com.fund.mapper.ProtocolMapper;
import com.fund.mapper.ScholarshipappMapper;
import com.fund.mapper.StipendappMapper;
import com.fund.po.BenificiaryUnit;
import com.fund.po.Benificiarycontact;
import com.fund.po.Bonusnotice;
import com.fund.po.BonusnoticeCustom;
import com.fund.po.BonusnoticeExample;
import com.fund.po.DonationModeCustom;
import com.fund.po.Donationcontact;
import com.fund.po.Donationunit;
import com.fund.po.Donor;
import com.fund.po.Files;
import com.fund.po.Fundtype;
import com.fund.po.FundtypeExample;
import com.fund.po.Inbill;
import com.fund.po.InbillExample;
import com.fund.po.MoneyCheckCustom;
import com.fund.po.NewsUrlCustom;
import com.fund.po.Newstype;
import com.fund.po.NewsurlExample;
import com.fund.po.Outbill;
import com.fund.po.OutbillExample;
import com.fund.po.ProjectExample;
import com.fund.po.Projecttype;
import com.fund.po.Protocol;
import com.fund.po.ScholarshipAppCustom;
import com.fund.po.StipendAppCustom;
import com.fund.po.custom.ProjectCustom;
import com.fund.service.ProjectService;
import com.fund.utils.DateUtil;
import com.fund.utils.NumberUtil;
import com.fund.utils.Page;
import com.fund.utils.UrlUtil;
import com.fund.utils.UuidUtil;
import com.fund.utils.WordUtil;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private ProjectMapper projectMapper;
	@Autowired
	private DonationmodeMapper dModeMapper;
	@Autowired
	private DonationunitMapper dUnitMapper;
	@Autowired
	private DonationcontactMapper dContactMapper;
	@Autowired
	private BenificiarycontactMapper bContactMapper;
	@Autowired
	private DonorMapper donorMapper;
	@Autowired
	private ProjecttypeMapper pTypeMapper;
	@Autowired
	private FundtypeMapper fTypeMapper;
	@Autowired
	private MoneycheckMapper mCheckMapper;
	@Autowired
	private FilesMapper filesMapper;
	@Autowired
	private ProtocolMapper protocolMapper;
	@Autowired
	private InbillMapper inBillMapper;
	@Autowired
	private OutbillMapper outBillMapper;
	@Autowired
	private NewsurlMapper newsUrlMapper;
	@Autowired
	private NewstypeMapper newsTypeMapper;
	@Autowired
	private BonusnoticeMapper bonusNoticeMapper;
	@Autowired
	private CountsMapper countsMapper;
	@Autowired
	private ScholarshipappMapper scAppMapper;
	@Autowired
	private StipendappMapper stAppMapper;
	@Autowired
	private BenificiaryUnitMapper bUnitMapper;
	
	/**
	 * @Description: 将立项表中数据插入到数据库中
	 * @author:JackBauer
	 * @Date:2015年8月17日下午2:55:18
	 */
	@Override
	public void insertProject(ProjectCustom project,Integer mode,String filePathPrefix) throws Exception {
		try {
			DonationModeCustom dMode = project.getDonationMode();
			Donationunit dUnit = project.getDonationUnit();
			Donationcontact dContact = project.getDonationContact();
			Benificiarycontact bContact = project.getBenificiaryContact();
			Donor donor = project.getDonor();
			MoneyCheckCustom mCheck = new MoneyCheckCustom();
			Fundtype fundType = null;
			Projecttype projectType = null;
			BenificiaryUnit bUnit = null;
			
			dModeMapper.insertSelective(dMode);
			bContactMapper.insertSelective(bContact);
			dContactMapper.insertSelective(dContact);
			fundType = fTypeMapper.selectByPrimaryKey(project.getFundtypeId());
			projectType = pTypeMapper.selectByPrimaryKey(fundType.getProjecttypeId());
			bUnit = bUnitMapper.selectByPrimaryKey(project.getBenificiaryunitId());
			
			mCheck.setState((byte)1);
			mCheckMapper.insertSelective(mCheck);
			onloadMoneyCheck(mCheck);
			
			if(project.getIsUnit()==1){
				dUnitMapper.insertSelective(dUnit);
				project.setDonationunitId(dUnit.getDonationunitId());
			}else{
				donorMapper.insertSelective(donor);
				project.setDonorId(donor.getDonorId());
			}
			
			project.setDonationmodeId(dMode.getDonationmodeId());
			project.setDonationcontactId(dContact.getDonationcontactId());
			project.setBenificiarycontactId(bContact.getBenificiarycontactId());
			project.setMoneycheckId(mCheck.getMoneycheckId());
			project.setProjectNum(UuidUtil.get32UUID());
			project.setBenificiaryUnit(bUnit);
			
			if(mode==0){
				project.setIsPassed((byte)0);//第一次保存提交设状态为保存
			}
			
			generateProjectApp(project, filePathPrefix);//生成立项申请表doc
			project.setProjectNum(generateProjectNum());//生成合同编号
			projectMapper.insertSelective(project);
			project.setDonationMode(dMode);
			project.setDonationUnit(dUnit);
			project.setDonationContact(dContact);
			project.setBenificiaryContact(bContact);
			project.setDonor(donor);
			project.setMoneyCheck(mCheck);
			project.setFundType(fundType);
			project.setProjectType(projectType);
		} catch (Exception e) {
			logger.error("insert project failed!",e);
			throw new ProjectException("创建立项失败！");
		}
	}
	
	/**
	 * @Description: 更新未提交的立项表
	 * @author:JackBauer
	 * @Date:2015年8月21日下午1:47:39
	 * @param newproject(要更新的新的立项表,另一个就是旧的,获取id用)，mode(保存或者提交),filePathPrefix(生成捐赠协议等文件的路径前缀,不包括文件名)
	 */
	@Override
	public void updateProject(ProjectCustom newproject,ProjectCustom oldProject,Integer mode,String filePathPrefix) throws Exception {
		try {
			DonationModeCustom dMode = newproject.getDonationMode();
			Donationunit dUnit = newproject.getDonationUnit();
			Donationcontact dContact = newproject.getDonationContact();
			Benificiarycontact bContact = newproject.getBenificiaryContact();
			Donor donor = newproject.getDonor();
			
			dMode.setDonationmodeId(oldProject.getDonationmodeId());
			dContact.setDonationcontactId(oldProject.getDonationcontactId());
			bContact.setBenificiarycontactId(oldProject.getBenificiarycontactId());
			
			dModeMapper.updateByPrimaryKeySelective(dMode);
			bContactMapper.updateByPrimaryKeySelective(bContact);
			dContactMapper.updateByPrimaryKeySelective(dContact);
			
			if(newproject.getIsUnit()==1){
				Integer donationUnitId = oldProject.getDonationunitId();
				if(donationUnitId!=null){
					dUnit.setDonationunitId(donationUnitId);
					dUnitMapper.updateByPrimaryKeySelective(dUnit);
				}else{
					dUnitMapper.insertSelective(dUnit);
					newproject.setDonationunitId(dUnit.getDonationunitId());
				}
			}else{
				Integer donorId = newproject.getDonorId();
				if(donorId!=null){
					donor.setDonorId(oldProject.getDonorId());				
					donorMapper.updateByPrimaryKeySelective(donor);
				}else{
					donorMapper.insertSelective(donor);
					newproject.setDonorId(donor.getDonorId());
				}
			}
			
			if(mode==1){
				newproject.setIsPassed((byte) 1);
			}
			
			generateProjectApp(newproject, filePathPrefix);//生成立项申请表doc
			projectMapper.updateByPrimaryKeySelective(newproject);
		} catch (Exception e) {
			logger.error("updateProject failed!", e);
			throw new ProjectException("更新立项失败！");
		}
		
	}
	
	/**
	 * @Description: 返回一个包含所有项目类型
	 * @author:JackBauer
	 * @Date:2015年8月17日下午2:54:39
	 */
	@Override
	public List<Projecttype> findProjectTypes() throws Exception {
		try {
			return pTypeMapper.selectByExample(null);
		} catch (Exception e) {
			logger.error("findProjectTypes failed！", e);
			throw new ProjectException("查找项目类型失败！");
		}
	}
	
	/**
	 * @Description: 返回一个包含所有的基金类型的集合
	 * @author:JackBauer
	 * @Date:2015年8月17日下午2:53:49
	 */
	@Override
	public List<Fundtype> findAllFundTypes() throws Exception {
		try {
			FundtypeExample fTypeExample = new FundtypeExample();
			FundtypeExample.Criteria criteria = fTypeExample.createCriteria();
			criteria.andStateEqualTo((byte)1);
			return fTypeMapper.selectByExample(fTypeExample);
		} catch (Exception e) {
			logger.error("findAllFundTypes failed!", e);
			throw new ProjectException("查找基金类型失败！");
		}
	}

	/**
	 * @Description: 根据受益方选择的不同的工程项目返回对应的基金类型集合
	 * @author:JackBauer
	 * @Date:2015年8月17日下午2:52:28
	 */
	@Override
	public List<Fundtype> findFundTypesByPid(Integer pTypeId) throws Exception {
		try {
			FundtypeExample fTypeExample = new FundtypeExample();
			FundtypeExample.Criteria criteria = fTypeExample.createCriteria();
			criteria.andProjecttypeIdEqualTo(pTypeId);
			criteria.andStateEqualTo((byte)1);
			return fTypeMapper.selectByExample(fTypeExample);
		} catch (Exception e) {
			logger.error("findFundTypesByPid failed!", e);
			throw new ProjectException("根据项目类型查找基金类型失败！");
		}
	}
	
	/**
	 * @Description: 根据核款表找出所有相关的账单并装载到MoneyCheck中
	 * @author:JackBauer
	 * @Date:2015年8月24日下午8:47:14
	 */
	public void onloadMoneyCheck(MoneyCheckCustom moneyCheck)throws Exception{
		List<Inbill> inBillList = findInBillsByMid(moneyCheck.getMoneycheckId());
		List<Outbill> outBillList = findOutBillsByMid(moneyCheck.getMoneycheckId());
		moneyCheck.setInBillList(inBillList);
		moneyCheck.setOutBillList(outBillList);
	}
	
	/**
	 * @Description: 根据具体的基金类型id找到该基金类型并返回
	 * @author:JackBauer
	 * @Date:2015年8月18日上午11:57:08
	 * @param fTypeId
	 */
	@Override
	public Fundtype findFundTypeByFid(Integer fTypeId) throws Exception {
		FundtypeExample fundtypeExample = new FundtypeExample();
		FundtypeExample.Criteria criteria = fundtypeExample.createCriteria();
		criteria.andFundtypeIdEqualTo(fTypeId);
		criteria.andStateEqualTo((byte)1);
		List<Fundtype> fundTypeList = fTypeMapper.selectByExample(fundtypeExample);
		if(fundTypeList.size()==1){
			return fundTypeList.get(0);
		}else{
			return null;
		}
	}
	

	/**
	 * @Description: 根据项目id删除立项，一删全删（满门抄斩）-还没做完全
	 * @author:JackBauer
	 * @Date:2015年8月20日下午4:08:44
	 */
	public void deleteProjectByPid2(ProjectCustom p)throws Exception{
		ProjectCustom project = new ProjectCustom();
		Donationcontact dContact = new Donationcontact();
		Benificiarycontact bContact = new Benificiarycontact();
		MoneyCheckCustom moneycheck = new MoneyCheckCustom();
		DonationModeCustom dMode = new DonationModeCustom();
		Protocol protocol = new Protocol();
		Donationunit dUnit = null;
		Donor donor = null;
		
		project.setProjectId(p.getProjectId());
		project.setState((byte)0);
		dContact.setDonationcontactId(p.getDonationcontactId());
		dContact.setState((byte)0);
		bContact.setBenificiarycontactId(p.getBenificiarycontactId());
		bContact.setState((byte)0);
		moneycheck.setMoneycheckId(p.getMoneycheckId());
		moneycheck.setState((byte)0);
		dMode.setDonationmodeId(p.getDonationmodeId());
		dMode.setState((byte)0);
		protocol.setProtocolId(p.getProtocolId());
		protocol.setState((byte)0);
		
		projectMapper.updateByPrimaryKeySelective(project);
		dContactMapper.updateByPrimaryKeySelective(dContact);
		bContactMapper.updateByPrimaryKeySelective(bContact);
		mCheckMapper.updateByPrimaryKeySelective(moneycheck);
		dModeMapper.updateByPrimaryKeySelective(dMode);
		protocolMapper.updateByPrimaryKeySelective(protocol);
		
		if(p.getIsUnit()==1){
			dUnit = new Donationunit();
			dUnit.setDonationcontactId(p.getDonationunitId());
			dUnit.setState((byte)0);
			dUnitMapper.updateByPrimaryKeySelective(dUnit);
		}else if(p.getIsUnit()==0){
			donor = new Donor();
			donor.setDonorId(p.getDonorId());
			donor.setState((byte)0);
			donorMapper.updateByPrimaryKeySelective(donor);
		}
	}
	
	/**
	 * @Description: 根据项目id删除立项(简单删除，未用到触发器)
	 * @author:JackBauer
	 * @Date:2015年8月20日下午4:08:44
	 */
	public void deleteProjectByPid(Integer projectId)throws Exception{
		try {
			ProjectCustom p = new ProjectCustom();
			p.setProjectId(projectId);
			p.setState((byte)0);
			projectMapper.updateByPrimaryKeySelective(p);
		} catch (Exception e) {
			logger.error("delete project failed!", e);
			throw new ProjectException("删除失败");
		}
	}
	
	

	/**
	 * @Description: 查找所有的立项（有效的）
	 * @author:JackBauer
	 * @Date:2015年9月17日下午2:58:52
	 */
	@Override
	public List<ProjectCustom> findAllProjects(Page page)throws Exception {
		
		try{
			HashMap<String, Object> map = new HashMap<>();
			map.put("page", page);
			map.put("order", "setUp_time desc");//按时间降序排列
		
			return projectMapper.selectAllProjects(map);
		} catch (Exception e) {
			logger.error("find projects failed!",e);
			throw new ProjectException("查找所有立项失败!");
		}
	}
	
	/*
	 * 找出所有核款表对应的入账单
	 */
	public List<Inbill> findInBillsByMid(Integer MoneyCheckId)throws Exception{
		InbillExample example = new InbillExample();
		InbillExample.Criteria criteria = example.createCriteria();
		criteria.andMoneycheckIdEqualTo(MoneyCheckId);
		criteria.andStateEqualTo((byte) 1);
		return inBillMapper.selectByExample(example);
	}
	
	/*
	 * 找出所有核款表对应的出账单
	 */
	public List<Outbill> findOutBillsByMid(Integer MoneyCheckId)throws Exception{
		OutbillExample example = new OutbillExample();
		OutbillExample.Criteria criteria = example.createCriteria();
		criteria.andMoneycheckIdEqualTo(MoneyCheckId);
		criteria.andStateEqualTo((byte) 1);
		return outBillMapper.selectByExample(example);
	}
	
	/**
	 * @Description: 根据立项id找出所有相关联的新闻链接
	 * @author:JackBauer
	 * @Date:2015年8月27日下午1:55:16
	 */
	@Override
	public List<NewsUrlCustom> findNewsUrlByPid(Integer projectId) throws Exception {
		NewsurlExample example = new NewsurlExample();
		NewsurlExample.Criteria criteria = example.createCriteria();
		criteria.andProjectIdEqualTo(projectId);
		criteria.andStateEqualTo((byte) 1);//未删除的
		criteria.andIsPassedNotEqualTo((byte) 2);//审核未通过的不要
		return onloadNewsUrl(newsUrlMapper.selectByExample(example));
	}
	
	/*
	 * 装载newsUrl，为其newsType（新闻类型）赋值
	 */
	public List<NewsUrlCustom> onloadNewsUrl(List<NewsUrlCustom> newsUrlList)throws Exception{
		if(newsUrlList!=null){
			for(int i=0;i<newsUrlList.size();i++){
				NewsUrlCustom newsUrl = newsUrlList.get(i);
				Newstype newsType = newsTypeMapper.selectByPrimaryKey(newsUrl.getNewstypeId());
				newsUrl.setNewsType(newsType);
				newsUrlList.set(i,newsUrl);
			}
		}
		return newsUrlList;
	}

	/**
	 * 
	 * @Description: 根据项目id找出奖金报名通知
	 * @author:JackBauer
	 * @Date:2015年8月30日上午9:39:18
	 */
	@Override
	public Bonusnotice findBonusNoticeByPid(Integer projectId) throws Exception {
		BonusnoticeExample example = new BonusnoticeExample();
		BonusnoticeExample.Criteria criteria = example.createCriteria();
		criteria.andProjectIdEqualTo(projectId);
		criteria.andStateEqualTo((byte) 1);
		List<Bonusnotice> bonusNoticeList = bonusNoticeMapper.selectByExample(example);
		if(bonusNoticeList.size()==1)
			return bonusNoticeList.get(0);
		else return null;
	}

	/**
	 * 
	 * @Description: 删除新闻链接
	 * @author:JackBauer
	 * @Date:2015年8月30日上午9:31:55
	 */
	@Override
	public void deleteNewsUrl(Integer newsUrlId) throws Exception {
		NewsUrlCustom newsUrl = new NewsUrlCustom();
		newsUrl.setNewsurlId(newsUrlId);
		newsUrl.setState((byte) 0);
		newsUrlMapper.updateByPrimaryKeySelective(newsUrl);
	}

	/**
	 * 
	 * @Description: 根据用户id查询其立项总数
	 * @author:JackBauer
	 * @Date:2015年9月17日下午3:32:43
	 */
	@Override
	public Integer getProjectsCountByUserId(Integer userId) throws Exception {
		try {
			ProjectExample example = new ProjectExample();
			ProjectExample.Criteria criteria = example.createCriteria();
			criteria.andUserIdEqualTo(userId);
			criteria.andStateEqualTo((byte) 1);
			return projectMapper.countByExample(example);
		} catch (Exception e) {
			logger.error("getProjectsCountByUserId failed!", e);
			return 0;
		}
	}
	
	/**
	 * @Description: 查询所有立项的总数
	 * @author:JackBauer
	 * @Date:2015年9月17日下午3:33:10
	 */
	@Override
	public Integer getAllProjectsCount() throws Exception {
		try {
			ProjectExample example = new ProjectExample();
			ProjectExample.Criteria criteria = example.createCriteria();
			criteria.andStateEqualTo((byte) 1);
			return projectMapper.countByExample(example);
		} catch (Exception e) {
			logger.error("getAllProjectsCount failed!",e);
			return 0;
		}
	}
	
	/**
	 * @Description: 查询所有捐赠方捐赠的立项的总数
	 * @author:JackBauer
	 * @Date:2015年9月17日下午3:33:10
	 */
	@Override
	public int getDonorProjectsByDId(int donationuserId)throws Exception{
		try {
			ProjectExample example = new ProjectExample();
			ProjectExample.Criteria criteria = example.createCriteria();
			criteria.andStateEqualTo((byte) 1);
			criteria.andDonationuserIdEqualTo(donationuserId);
			return projectMapper.countByExample(example);
		} catch (Exception e) {
			logger.error("etDonorProjectsByDId failed!",e);
			return 0;
		}
	}
	
	/**
	 * @Description: 查找已经通过的立项总数
	 * @author:JackBauer
	 * @Date:2015年10月27日下午7:26:31
	 */
	@Override
	public int getPassedProjectsCount()throws Exception{
		try {
			ProjectExample example = new ProjectExample();
			ProjectExample.Criteria criteria = example.createCriteria();
			criteria.andStateEqualTo((byte) 1);
			criteria.andIsPassedEqualTo((byte) 2);
			return projectMapper.countByExample(example);
		} catch (Exception e) {
			logger.error("getPassedProjectsCount",e);
			return 0;
		}
	}
	
	/**
	 * @Description: 通过受益方userId找到其对应的所有立项
	 * @author:JackBauer
	 * @Date:2015年9月17日下午2:57:07
	 */
	@Override
	public List<ProjectCustom> findProjectsByUserId(Integer userId,Page page)throws Exception{
		try {
			HashMap<String, Object> map = new HashMap<>();
			map.put("userId", userId);
			map.put("page", page);
			map.put("order", "setUp_time desc");//按时间降序排列
			
			return projectMapper.selectProjectsByUid(map);
		} catch (Exception e) {
			logger.error("find projects failed!",e);
			return null;
		}
	}
	
	/**
	 * @Description: 根据捐赠方的用户id查找捐赠方捐赠的立项
	 * @author:JackBauer
	 * @Date:2015年10月30日下午4:31:54
	 */
	@Override
	public List<ProjectCustom> findDonorProjectsByDId(Integer donationuserId,Page page)throws Exception{
		try {
			HashMap<String, Object> map = new HashMap<>();
			map.put("donationuserId", donationuserId);
			map.put("page", page);
			map.put("order", "setUp_time desc");//按时间降序排列
			
			return projectMapper.selectProjectsByDid(map);
		} catch (Exception e) {
			logger.error("findDonorProjectsByDId failed!",e);
			return null;
		}
	}

	/**
	 * @Description: 根据立项id查找该立项
	 * @author:JackBauer
	 * @Date:2015年9月17日下午3:39:32
	 */
	@Override
	public ProjectCustom findProjectByPid(Integer projectId) throws Exception {
		try {
			ProjectExample example = new ProjectExample();
			ProjectExample.Criteria criteria = example.createCriteria();
			criteria.andProjectIdEqualTo(projectId);
			criteria.andStateEqualTo((byte) 1);
			List<ProjectCustom> projectList = projectMapper.selectByExampleCustom(example);
			if(projectList.size()==1)
				return onloadProject(projectList.get(0));
			else return null;
		} catch (Exception e) {
			logger.error("findProjectByPid failed!!", e);
			throw new ProjectException("查找立项失败！");
		}
	}

	/**
	 * 
	 * @Description: 查找所有捐赠协议未审核的立项
	 * @author:JackBauer
	 * @Date:2015年9月18日上午9:35:32
	 */
	@Override
	public List<ProjectCustom> findUnverifiedProtocolProjects(Page page) throws Exception {
		HashMap<String, Object> map = new HashMap<>();
		map.put("page", page);
	
		return projectMapper.selectUnverifiedProtocolProjects(map);
	}

	/**
	 * @Description: 查找所有捐赠协议已经审核的立项
	 * @author:JackBauer
	 * @Date:2015年9月18日上午9:35:32
	 */
	@Override
	public List<ProjectCustom> findVerifiedProtocolProjects(Page page) throws Exception {
		HashMap<String, Object> map = new HashMap<>();
		map.put("page", page);
	
		return projectMapper.selectVerifiedProtocolProjects(map);
	}
	
	/**
	 * @Description: 装载ProjectCustom
	 * @author:JackBauer
	 * @Date:2015年10月11日下午4:48:15
	 */
	public ProjectCustom onloadProject(ProjectCustom p)throws Exception{
		Integer bcId = p.getBenificiarycontactId();//受益方联系人
		Integer buId = p.getBenificiaryunitId();//受益单位id
		Integer dcId = p.getDonationcontactId();//捐赠方联系人
		Integer duId = p.getDonationunitId();//捐赠单位
		Integer dId = p.getDonorId();//捐赠人
		Integer dmId = p.getDonationmodeId();//捐赠形式
		Integer mcId = p.getMoneycheckId();//资金核款信息
		Integer fTypeId = p.getFundtypeId();//基金类型
		Integer protocolId = p.getProtocolId();//捐赠协议
		Integer projectId = p.getProjectId();//项目
		
		//如果基金项目是奖助学金或者奖教金的话加载评审信息
		if(fTypeId==1||fTypeId==2||fTypeId==7){
			BonusnoticeExample bonusnoticeExample=new BonusnoticeExample();
			BonusnoticeExample.Criteria criteria = bonusnoticeExample.createCriteria();
			criteria.andProjectIdEqualTo(p.getProjectId());
			criteria.andStateEqualTo((byte) 1);
			
			List<Bonusnotice> bonusnoticesList=bonusNoticeMapper.selectByExample(bonusnoticeExample);
			if(bonusnoticesList.size()>=1){
				p.setBonusNotice(getLatestBNoticeFromList(bonusnoticesList));
			}
			
		}
		p.setBenificiaryUnit(bUnitMapper.selectByPrimaryKey(buId));
		p.setBenificiaryContact(bContactMapper.selectByPrimaryKey(bcId));
		p.setDonationContact(dContactMapper.selectByPrimaryKey(dcId));
		p.setDonationMode(dModeMapper.selectByPrimaryKey(dmId));
		p.setFundType(fTypeMapper.selectByPrimaryKey(fTypeId));
		p.setProjectType(pTypeMapper.selectByPrimaryKey(p.getFundType().getProjecttypeId()));
		p.setNewsList(findNewsUrlByPid(projectId));
		
		//核款表要单独处理，装载所有的账单
		MoneyCheckCustom moneyCheck = mCheckMapper.selectByPrimaryKey(mcId);
		onloadMoneyCheck(moneyCheck);
		p.setMoneyCheck(moneyCheck);
		
		if(p.getIsUnit()==1){
			p.setDonationUnit(dUnitMapper.selectByPrimaryKey(duId));
		}else{
			p.setDonor(donorMapper.selectByPrimaryKey(dId));
		}
		if(protocolId!=null){//当受益方保存立项表后是没有生成捐赠协议的，此处可能为空
			p.setProtocol(protocolMapper.selectByPrimaryKey(protocolId));
		}
		
		return p;
	}

	/**
	 * @Description: 计算某立项对应的奖学金申请表
	 * @author:JackBauer
	 * @Date:2015年10月12日上午8:51:57
	 */
	@Override
	public int getScAppsCountByBNId(Integer bNoticeId) throws Exception {
		try {
			return countsMapper.selectScAppsCountByBNId(bNoticeId);
		} catch (Exception e) {
			logger.error("getScAppsCountByBNId failed", e);
			return 0;
		}
	}
	
	/**
	 * @Description: 计算某立项对应的助学金申请表
	 * @author:JackBauer
	 * @Date:2015年10月12日上午8:51:57
	 */
	@Override
	public int getStAppsCountByBNId(Integer bNoticeId) throws Exception {
		try {
			return countsMapper.selectScAppsCountByBNId(bNoticeId);
		} catch (Exception e) {
			logger.error("getStAppsCountByBNId failed!", e);
			return 0;
		}
	}

	/**
	 * @Description: 根据评审通知查找对应的奖学金申请表
	 * @author:JackBauer
	 * @Date:2015年10月12日上午9:33:18
	 */
	@Override
	public List<ScholarshipAppCustom> findScAppsByBNoticeId(Integer bNoticeId, Page page) throws Exception {
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("bNoticeId", bNoticeId);
			map.put("page", page);
			map.put("order", "Institute ASC,Sc_StuId ASC");
			return scAppMapper.selectScAppsByBNId(map);
		} catch (Exception e) {
			logger.error("findScAppsByBNoticeId failed!", e);
		}
		return null;
	}

	/**
	 * @Description: 根据评审通知查找对应的助学金申请表
	 * @author:JackBauer
	 * @Date:2015年10月12日上午9:33:18
	 */
	@Override
	public List<StipendAppCustom> findStAppsByBNoticeId(Integer bNoticeId, Page page) throws Exception {
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("bNoticeId", bNoticeId);
			map.put("page", page);
			map.put("order", "Institute ASC,St_StuId ASC");
			return stAppMapper.selectStAppsByBNId(map);
		} catch (Exception e) {

			logger.error("findStAppsByBNoticeId failed!", e);
		}
		return null;
	}
	
	/**
	 * @Description: 从奖金评审通知集合中选出最新的通知并返回
	 * @author:JackBauer
	 * @Date:2015年10月16日上午9:35:48
	 */
	public BonusnoticeCustom getLatestBNoticeFromList(List<Bonusnotice> list){
		list.sort(new Comparator<Bonusnotice>() {

			@Override
			public int compare(Bonusnotice o1, Bonusnotice o2) {
				return o2.getStartDate().compareTo(o1.getStartDate());
			}
		});
		BonusnoticeCustom bNotice = new BonusnoticeCustom();
		try {
			BeanUtils.copyProperties(bNotice, list.get(0));
			return bNotice;
		} catch (Exception e) {
			return null;
		} 
	}

	/**
	 * @Description: 根据用户id查找对应的所有奖金立项
	 * @author:JackBauer
	 * @Date:2015年10月16日下午4:11:34
	 */
	@Override
	public List<ProjectCustom> findBonusProjectsByUserId(Integer userId, Page page) throws Exception {
		try {
			HashMap<String, Object> map = new HashMap<>();
			map.put("userId", userId);
			map.put("page", page);
			
			return projectMapper.selectBonusProjectsByUid(map);
		} catch (Exception e) {
			logger.error("find Bonus projects failed!",e);
			throw new ProjectException("查找所有奖金立项失败!");
		}
	}

	/**
	 * @Description: 根据用户id查找对应的所有奖金立项总数
	 * @author:JackBauer
	 * @Date:2015年10月16日下午4:11:34
	 */
	@Override
	public int getBonusProjectsCountByUserId(Integer userId) throws Exception {
		try {
			return countsMapper.selectBonusProjectsCountByUserId(userId);
		} catch (Exception e) {
			logger.error("getBonusProjectsCountByUserId failed!",e);
			return 0;
		}
	}

	/**
	 * @Description: 根据id判断立项是否存在
	 * @author:JackBauer
	 * @Date:2015年10月23日上午8:29:33
	 */
	@Override
	public boolean isProjectExist(Integer projectId) throws Exception {
		try {
			ProjectExample example = new ProjectExample();
			ProjectExample.Criteria criteria = example.createCriteria();
			criteria.andProjectIdEqualTo(projectId);
			criteria.andIsPassedEqualTo((byte) 2);
			criteria.andStateEqualTo((byte) 1);
			int flag = projectMapper.countByExample(example);
			return flag==1?true:false;
		} catch (Exception e) {
			logger.error("isProjectExist", e);
			return false;
		}
	}
	
	
	
	/**
	 * @Description: 生成立项申请表
	 * @author:JackBauer
	 * @Date:2015年10月24日上午9:20:04
	 */
	public void generateProjectApp(ProjectCustom p,String filePathPrefix)throws Exception{
		
		try {
			File doc = WordUtil.createDoc(UrlUtil.getFileDir(filePathPrefix),UrlUtil.getNewFileName(),getProjectAppParams(p),"ProjectApp");
			
			Files file = null;
			if(doc!=null){
				file = new Files();
				file.setSource(doc.getAbsolutePath());
//				file.setFileTitle(doc.getName());
				file.setProjectId(p.getProjectId());
				file.setFiletypeId(1);
				file.setNotes("立项表");
				filesMapper.insertSelective(file);
				p.setAppformId(file.getFileId());
			}
		} catch (Exception e) {
			logger.error("generateProjectApp failed!", e);
			
		}
	}
	
	/**
	 * @Description: 生成立项申请表要填充到word模板的参数，存在map中
	 * @author:JackBauer
	 * @Date:2015年10月24日上午10:59:32
	 */
	public Map<String, Object> getProjectAppParams(ProjectCustom p)throws Exception{
		Map<String, Object> dataMap = new HashMap<String, Object>();
		
		DonationModeCustom donationMode = p.getDonationMode();
		Donationcontact dContact = p.getDonationContact();
		Benificiarycontact bContact = p.getBenificiaryContact();
		Donationunit dUnit = p.getDonationUnit();
		Donor donor = p.getDonor();
		
		dataMap.put("du_name", dUnit.getDuName());
		dataMap.put("du_address", dUnit.getAddress());
		dataMap.put("du_zipCode", dUnit.getZipCode());
		dataMap.put("du_officePhone", dUnit.getOfficephone());
		dataMap.put("du_mobilePhone", dUnit.getMobilephone());
		dataMap.put("du_fax", dUnit.getFax());
		dataMap.put("du_email", dUnit.getDuEmail());
		
		dataMap.put("d_name", donor.getdName());
		dataMap.put("d_sex", donor.getdSex()==null?"":donor.getdSex());
		dataMap.put("d_birthday", DateUtil.dateToStr(donor.getdBirthday(),"yyyy-MM-dd"));
		dataMap.put("d_hobbits", donor.getHobbits());
		dataMap.put("d_degreeInfo", donor.getDegreeinfo());
		dataMap.put("d_unit", donor.getdUnit());
		dataMap.put("d_job", donor.getdJob());
		
		if(donor.getIsAlumni()!=null){
			if(donor.getIsAlumni()==1){
				dataMap.put("isAlumni_1", "■");
				dataMap.put("isAlumni_0", "□");
			}else{
				dataMap.put("isAlumni_1", "□");
				dataMap.put("isAlumni_0", "■");
			}
		}else{
			dataMap.put("isAlumni_1", "□");
			dataMap.put("isAlumni_0", "□");
		}
		
		if(donationMode.getRealEstate()==1)//动产和不动产
		{
			dataMap.put("realEstate_1", "■");
			dataMap.put("realEstate_0", "□");
		}else{
			dataMap.put("realEstate_1", "□");
			dataMap.put("realEstate_0", "■");
		}
		
		if(donationMode.getForm()==1)//现金/支票/汇票
		{
			dataMap.put("form_1", "■");
			dataMap.put("form_2", "□");
			dataMap.put("form_3", "□");
		}else if(donationMode.getForm()==2){
			dataMap.put("form_2", "■");
			dataMap.put("form_1", "□");
			dataMap.put("form_3", "□");
		}else{
			dataMap.put("form_3", "■");
			dataMap.put("form_1", "□");
			dataMap.put("form_2", "□");
		}
		
		if(p.getPublicationState()==1)//公开信息状态
		{
			dataMap.put("pState_1", "■");
			dataMap.put("pState_2", "□");
			dataMap.put("pState_3", "□");
			dataMap.put("pState_4", "□");
		}else if(p.getPublicationState()==2){
			dataMap.put("pState_1", "□");
			dataMap.put("pState_2", "■");
			dataMap.put("pState_3", "□");
			dataMap.put("pState_4", "□");
		}else if(p.getPublicationState()==3){
			dataMap.put("pState_1", "□");
			dataMap.put("pState_2", "□");
			dataMap.put("pState_3", "■");
			dataMap.put("pState_4", "□");
		}else{
			dataMap.put("pState_1", "□");
			dataMap.put("pState_2", "□");
			dataMap.put("pState_3", "□");
			dataMap.put("pState_4", "■");
		}
		
		dataMap.put("projectName", p.getProjectName());
		dataMap.put("leader", p.getLeader());
		
		if(donationMode.getIsOnetime()==1){
			dataMap.put("oneTimeAmount", NumberUtil.MoneyConvert(donationMode.getOneTimeAmount()));
			dataMap.put("yearAmount", "");
			dataMap.put("executeTime", DateUtil.dateToStr(donationMode.getExecuteTime(),"yyyy-MM-d"));
			dataMap.put("span", "");
		}else{
			dataMap.put("oneTimeAmount", "");
			dataMap.put("yearAmount", NumberUtil.MoneyConvert(donationMode.getYearAmount()));
			dataMap.put("executeTime", "");
			dataMap.put("span", donationMode.getSpan()+"");
		}
		
		dataMap.put("purpose", p.getPurpose());
		dataMap.put("benificiaryUnit", p.getBenificiaryUnit().getBunitName());
		
		dataMap.put("bc_Name", bContact.getBcName());
		dataMap.put("bc_officePhone", bContact.getOfficephone());
		dataMap.put("bc_fax", bContact.getFax());
		dataMap.put("bc_mobilePhone", bContact.getMobilephone());
		dataMap.put("bc_email", bContact.getBcEmail());
		
		dataMap.put("dc_name", dContact.getDcName());
		dataMap.put("dc_job", dContact.getJob());
		dataMap.put("dc_officePhone", dContact.getOfficephone());
		dataMap.put("dc_mobilePhone", dContact.getMobilephone());
		dataMap.put("dc_fax", dContact.getFax());
		dataMap.put("dc_email", dContact.getDcEmail());
		
		return dataMap;
	}
	
	/**
	 * @Description: 生成合同编号
	 * @author:JackBauer
	 * @Date:2015年10月30日下午4:58:29
	 */
	public String generateProjectNum(){
		int originalNum = 0;
		String num = null;
		String year = null;
		String projectNum = null;
		try {
			originalNum = projectMapper.countByExample(new ProjectExample())+1;
			if(originalNum>=1 && originalNum<10){
				num = "00" + originalNum;
			}else if(originalNum>=10 && originalNum<=99){
				num = "0" + originalNum;
			}
			year = DateUtil.getNowYear();
			projectNum = year+num; 
			return projectNum;
		} catch (Exception e) {
			logger.error("generateProjectNum failed!", e);
			try {
				return UuidUtil.get32UUID();
			} catch (Exception e1) {
				logger.error("generate uuid failed!", e1);
				return null;
			}
		}
	}

	/**
	 * @Description: 查找所有的受益单位
	 * @author:JackBauer
	 * @Date:2015年11月22日下午4:21:09
	 */
	@Override
	public List<BenificiaryUnit> findAllBUnits() throws Exception {
		return bUnitMapper.selectByExample(null);
	}
}
