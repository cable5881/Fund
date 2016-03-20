package com.fund.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fund.exception.ProjectException;
import com.fund.exception.UserException;
import com.fund.mapper.BenificiarycontactMapper;
import com.fund.mapper.BonusnoticeMapper;
import com.fund.mapper.CountsMapper;
import com.fund.mapper.DonationcontactMapper;
import com.fund.mapper.DonationmodeMapper;
import com.fund.mapper.DonationunitMapper;
import com.fund.mapper.DonorMapper;
import com.fund.mapper.FundtypeMapper;
import com.fund.mapper.InbillMapper;
import com.fund.mapper.MoneycheckMapper;
import com.fund.mapper.NewsurlMapper;
import com.fund.mapper.OutbillMapper;
import com.fund.mapper.ProjectMapper;
import com.fund.mapper.ProjecttypeMapper;
import com.fund.mapper.ProtocolMapper;
import com.fund.mapper.ScappinfoMapper;
import com.fund.mapper.ScindivinfoMapper;
import com.fund.mapper.StappinfoMapper;
import com.fund.mapper.StindivinfoMapper;
import com.fund.mapper.UserMapper;
import com.fund.po.Bonusnotice;
import com.fund.po.BonusnoticeCustom;
import com.fund.po.BonusnoticeExample;
import com.fund.po.Fundtype;
import com.fund.po.FundtypeExample;
import com.fund.po.Inbill;
import com.fund.po.InbillExample;
import com.fund.po.MoneyCheckCustom;
import com.fund.po.NewsUrlCustom;
import com.fund.po.Outbill;
import com.fund.po.OutbillExample;
import com.fund.po.Projecttype;
import com.fund.po.ProjecttypeExample;
import com.fund.po.Scappinfo;
import com.fund.po.ScholarshipAppCustom;
import com.fund.po.Scindivinfo;
import com.fund.po.Stappinfo;
import com.fund.po.Stindivinfo;
import com.fund.po.StipendAppCustom;
import com.fund.po.User;
import com.fund.po.UserCustom;
import com.fund.po.UserExample;
import com.fund.po.custom.ProjectCustom;
import com.fund.service.SystemAdminService;
import com.fund.utils.Const;
import com.fund.utils.MD5Util;
import com.fund.utils.Page;

@Service
public class SystemAdminServiceImpl implements SystemAdminService{

	private Logger logger = Logger.getLogger(this.getClass());
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
	private ProtocolMapper protocolMapper;
	@Autowired
	private NewsurlMapper newsUrlMapper;
	@Autowired
	private BonusnoticeMapper bonusnoticeMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private OutbillMapper outBillMapper;
	@Autowired
	private InbillMapper inBillMapper;
	@Autowired
	private StappinfoMapper stappinfoMapper;
	@Autowired
	private StindivinfoMapper stindivinfoMapper;
	@Autowired
	private ScindivinfoMapper scindivinfoMapper;
	@Autowired
	private ScappinfoMapper scappinfoMapper;
	@Autowired
	private CountsMapper countsMapper;

	/**
	 * 
	 * @Description: 删除用户
	 * @author:JackBauer
	 * @Date:2015年9月22日下午10:20:43
	 */
	@Override
	public void deleteUser(Integer userId) throws Exception {
		try {
			User user = new User();
			user.setUserId(userId);
			user.setState((byte) 0);
			logger.info("delete user if userId = "+userId);
			userMapper.updateByPrimaryKeySelective(user);
		} catch (Exception e) {
			logger.error("delete failed!!!！",e);
			throw new UserException("删除用户失败！");
		}
	}

	/**
	 * @Description: 根据id查找用户信息
	 * @author:gjh
	 * @Date:2015年8月28日下午1:43:29
	 */
	@Override
	public User findUser(Integer userId) throws Exception {
		User user=userMapper.selectByPrimaryKey(userId);
		return user;
	}
	
	/**
	 * @Description: 更新账号信息
	 * @author:JackBauer
	 * @Date:2015年9月22日下午11:35:41
	 */
	@Override
	public int updateUser(User newUser) throws Exception {
		String password=MD5Util.GetMD5Code(newUser.getPassword());
		newUser.setPassword(password);
		logger.info("Update user "+newUser.getUsername());
		try {
			return userMapper.updateByPrimaryKeySelective(newUser);
		} catch (Exception e) {
			logger.error("Update user "+newUser.getUsername()+" failed", e);
			throw new UserException("修改用户失败！");
		}
		
	}
	
	/**
	 * 
	 * @Description: 创建账号
	 * @author:JackBauer
	 * @Date:2015年9月22日下午11:35:56
	 */
	@Override
	public int insertUser(User newUser) throws Exception {
		if(IsUserNameExist(newUser.getUsername())){
			logger.info("Username "+newUser.getUsername()+" is been used");
			return -1;
		}
		
		String password=MD5Util.GetMD5Code(newUser.getPassword());
		newUser.setPassword(password);
		logger.info("Insert user "+newUser.getUsername());
		try {
			return userMapper.insertSelective(newUser);
		} catch (Exception e) {
			logger.error("Insert user "+newUser.getUsername()+" failed", e);
			return 0;
		}
		
	}
	
	/**
	 * 
	 * @Description: 先判断所创建项目类型是否存在，若不存在则创建之
	 * @author:JackBauer
	 * @Date:2015年9月22日下午11:36:12
	 */
	@Override
	public void insertProjectType(Projecttype projecttype) throws Exception {
		if(IsProjectTypeNameExist(projecttype.getProjecttypeName())){
			logger.info("ProjectTypeName "+projecttype.getProjecttypeName()+" is used");
			throw new UserException("用户名已被使用！");
		}
		
		logger.info("Insert ProjectType "+projecttype.getProjecttypeName());
		try {
			pTypeMapper.insertSelective(projecttype);
		} catch (Exception e) {
			logger.error("Insert ProjectType failed", e);
			throw new UserException("创建用户失败！");
		}
	}
	
	/**
	 * @Description: 查找所有状态不为0的项目类型
	 * @author:gjh
	 * @Date:2015年8月28日下午1:57:06
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Projecttype> selectAllProjectType() throws Exception {
		ProjecttypeExample projecttypeExample=new ProjecttypeExample();
		projecttypeExample.createCriteria().andStateNotEqualTo((byte)0);
		List<Projecttype> projecttypesList=pTypeMapper.selectByExample(projecttypeExample);
		return projecttypesList;
	}
	/**
	 * @Description: 先判断所创建的项目名称是否存在，若不存在则创建之
	 * @author:gjh
	 * @Date:2015年8月28日下午4:25:36
	 * @param fundtype
	 * @return
	 * @throws Exception
	 */
	@Override
	public void insertFundType(Fundtype fundtype) throws Exception {
		if(IsFundTypeNameExist(fundtype)){
			logger.info("FundTypeName "+fundtype.getFundName()+" is used");
			throw new ProjectException("基金类型名已被使用！");
		}
		
		logger.info("Insert FundType "+fundtype.getFundName());
		try {
			fTypeMapper.insertSelective(fundtype);
		} catch (Exception e) {
			logger.error("Insert FundType failed", e);
			throw new ProjectException("创建基金类型失败！");
		}
	}
	
	/**
	 * 
	 * @Description: 删除基金类型
	 * @author:JackBauer
	 * @Date:2015年10月11日上午10:25:08
	 */
	@Override
	public void deleteFundType(Fundtype fundtype) throws Exception {
		try{
			fundtype.setState((byte)0);
			logger.info("Delete FundType "+fundtype.getFundName());
			fTypeMapper.updateByPrimaryKeySelective(fundtype);
		}catch(Exception e){
			logger.error("Delete FundType failed", e);
			throw new ProjectException("删除基金类型失败！");
		}
	}
	
	public void onloadMoneyCheck(MoneyCheckCustom moneyCheck)throws Exception{
		List<Inbill> inBillList = findInBillsByMid(moneyCheck.getMoneycheckId());
		List<Outbill> outBillList = findOutBillsByMid(moneyCheck.getMoneycheckId());
		moneyCheck.setInBillList(inBillList);
		moneyCheck.setOutBillList(outBillList);
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
	 * @Description: 删除链接
	 * @author:gjh
	 * @Date:2015年8月28日下午11:58:35
	 * @param newsurlId
	 * @throws Exception
	 */
	@Override
	public void deleteNewsLink(Integer newsurlId) throws Exception {
		NewsUrlCustom newsurl=(NewsUrlCustom)newsUrlMapper.selectByPrimaryKey(newsurlId);
		newsurl.setState((byte)0);
		newsUrlMapper.updateByPrimaryKeySelective(newsurl);
		
	}

	/**
	 * 
	 * @Description: 不同等级的用户总数
	 * @author:JackBauer
	 * @Date:2015年9月21日下午5:26:07
	 */
	@Override
	public int getUserCountByLevel(Integer level) throws Exception {
		return countsMapper.selectUsersCountByLevel(level);
	}

	/**
	 * 
	 * @Description: 查找对应等级的所有用户
	 * @author:JackBauer
	 * @Date:2015年9月21日下午5:54:56
	 */
	@Override
	public List<UserCustom> findUsersByLevel(Integer level, Page page) throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("level", level);
		map.put("page", page);
		map.put("order", "username");
		return userMapper.selectUsersByLevel(map);
	}
	
	/**
	 * 
	 * @Description: 判断是否用户重名
	 * @author:JackBauer
	 * @Date:2015年9月22日下午11:20:05
	 */
	@Override
	public boolean IsUserNameExist(String username)throws Exception{
		UserExample userExample=new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		
		List<User> userList=userMapper.selectByExample(userExample);
		if(userList.size()>0){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 
	 * @Description: 判断是否项目类型重名
	 * @author:JackBauer
	 * @Date:2015年9月22日下午11:20:05
	 */
	@Override
	public boolean IsProjectTypeNameExist(String PTypeName) throws Exception {
		ProjecttypeExample projecttypeExample=new ProjecttypeExample();
		ProjecttypeExample.Criteria criteria = projecttypeExample.createCriteria();
		criteria.andProjecttypeNameEqualTo(PTypeName);
		criteria.andStateNotEqualTo((byte)0);
		List<Projecttype> projecttypeList = pTypeMapper.selectByExample(projecttypeExample);
		if(projecttypeList.size()>0){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 
	 * @Description: 判断是否基金类型重名
	 * @author:JackBauer
	 * @Date:2015年9月23日下午12:43:15
	 */
	@Override
	public boolean IsFundTypeNameExist(Fundtype fundType)throws Exception{
		FundtypeExample example=new FundtypeExample();
		FundtypeExample.Criteria criteria = example.createCriteria();
		criteria.andFundNameEqualTo(fundType.getFundName());
		criteria.andProjecttypeIdEqualTo(fundType.getProjecttypeId());
		List<Fundtype> fundtypesList = fTypeMapper.selectByExample(example);
		
		if(fundtypesList.size()>0){
			return true;
		}else return false;
	}

	/**
	 * 
	 * @Description: 装载projectCustom
	 * @author:JackBauer
	 * @Date:2015年10月11日下午4:44:08
	 */
	public void onloadProject(ProjectCustom p)throws Exception{
		Integer bcId = p.getBenificiarycontactId();
		Integer dcId = p.getDonationcontactId();
		Integer duId = p.getDonationunitId();
		Integer dId = p.getDonorId();
		Integer dmId = p.getDonationmodeId();
		Integer mcId = p.getMoneycheckId();
		Integer fTypeId = p.getFundtypeId();
		Integer protocolId = p.getProtocolId();
		
		//如果基金项目是奖助学金或者奖教金的话加载评审信息
		if(fTypeId==1||fTypeId==2||fTypeId==7){
			BonusnoticeExample bonusnoticeExample=new BonusnoticeExample();
			bonusnoticeExample.createCriteria().andProjectIdEqualTo(p.getProjectId());
			List<Bonusnotice> bonusnoticesList=bonusnoticeMapper.selectByExample(bonusnoticeExample);
			if(bonusnoticesList.size()!=1){
				throw new Exception();
			}
			BonusnoticeCustom bNotice = new BonusnoticeCustom();
			BeanUtils.copyProperties(bNotice, bonusnoticesList.get(0));
			p.setBonusNotice(bNotice);
		}
		p.setBenificiaryContact(bContactMapper.selectByPrimaryKey(bcId));
		p.setDonationContact(dContactMapper.selectByPrimaryKey(dcId));
		p.setDonationMode(dModeMapper.selectByPrimaryKey(dmId));
		p.setFundType(fTypeMapper.selectByPrimaryKey(fTypeId));
		p.setProjectType(pTypeMapper.selectByPrimaryKey(p.getFundType().getProjecttypeId()));
		
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
	}

	/**
	 * @Description: 更新奖学金申请表
	 * @author:JackBauer
	 * @Date:2015年10月12日下午1:05:19
	 */
	@Override
	public void updateScApp(ScholarshipAppCustom scApp) throws Exception {
		Scappinfo scAppInfo = scApp.getScAppInfo();
		Scindivinfo scIndivInfo = scApp.getScIndivInfo();
		
		scappinfoMapper.updateByPrimaryKeySelective(scAppInfo);
		scindivinfoMapper.updateByPrimaryKeySelective(scIndivInfo);
	}

	/**
	 * @Description: 更新助学金申请表
	 * @author:JackBauer
	 * @Date:2015年10月12日下午1:05:19
	 */
	@Override
	public void updateStApp(StipendAppCustom stApp) throws Exception {
		Stappinfo stAppInfo = stApp.getStAppInfo();
		Stindivinfo stIndivInfo = stApp.getStIndivInfo();
		
		stappinfoMapper.updateByPrimaryKeySelective(stAppInfo);
		stindivinfoMapper.updateByPrimaryKeySelective(stIndivInfo);
	}

	/**
	 * @Description: 关联捐赠方
	 * @author:JackBauer
	 * @Date:2015年10月30日上午10:41:20
	 */
	@Override
	public int linkDonationUser(String donationUsername, Integer projectId) throws Exception {
		try {
			UserExample userExample = new UserExample();
			UserExample.Criteria criteria = userExample.createCriteria();
			criteria.andUsernameEqualTo(donationUsername);
			criteria.andStateEqualTo((byte) 1);
			criteria.andPositionIdEqualTo(Const.POSITION_ID_DONOR);
			List<User> userList = userMapper.selectByExample(userExample);
			if(userList.size()==1){
				User user = userList.get(0);
				
				ProjectCustom p = new ProjectCustom();
				p.setProjectId(projectId);
				p.setDonationuserId(user.getUserId());
				return projectMapper.updateByPrimaryKeySelective(p);
			}else{
				return -1;
			}
		} catch (Exception e) {
			logger.error("linkDonationUser failed!", e);
			return 0;
		}
	}
}
