package com.fund.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fund.exception.BonusAppException;
import com.fund.exception.ProjectException;
import com.fund.mapper.BonusnoticeMapper;
import com.fund.mapper.CountsMapper;
import com.fund.mapper.ProjectMapper;
import com.fund.mapper.ScappinfoMapper;
import com.fund.mapper.ScholarshipappMapper;
import com.fund.mapper.ScindivinfoMapper;
import com.fund.mapper.StappinfoMapper;
import com.fund.mapper.StindivinfoMapper;
import com.fund.mapper.StipendappMapper;
import com.fund.po.Bonusnotice;
import com.fund.po.BonusnoticeCustom;
import com.fund.po.BonusnoticeExample;
import com.fund.po.Project;
import com.fund.po.Scappinfo;
import com.fund.po.ScholarshipAppCustom;
import com.fund.po.Scholarshipapp;
import com.fund.po.ScholarshipappExample;
import com.fund.po.Scindivinfo;
import com.fund.po.Stappinfo;
import com.fund.po.Stindivinfo;
import com.fund.po.StipendAppCustom;
import com.fund.po.Stipendapp;
import com.fund.po.StipendappExample;
import com.fund.po.SubmittedBonusForm;
import com.fund.po.User;
import com.fund.query.ScholarshipQuery;
import com.fund.query.StipendappQuery;
import com.fund.service.BonusService;
import com.fund.utils.Page;

@Service
public class BonusServiceImpl implements BonusService{

	private Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private ScholarshipappMapper scholarshipappMapper;
	@Autowired
	private ScappinfoMapper scappinfoMapper;
	@Autowired
	private ScindivinfoMapper scindivinfoMapper;
	@Autowired
	private ProjectMapper projectMapper;
	@Autowired
	private BonusnoticeMapper bonusnoticeMapper;
	@Autowired
	private StipendappMapper stipendappMapper;
	@Autowired
	private StappinfoMapper stappinfoMapper;
	@Autowired
	private StindivinfoMapper stindivinfoMapper;
	@Autowired
	private CountsMapper countsMapper;
	
	/**
	 * @Description: 将奖学金申请表中的信息存入数据库
	 * @author:gjh
	 * @Date:2015年8月19日下午5:18:52
	 */
	@Override
	public void insertScholarshipForm(ScholarshipQuery scholarshipQuery,User user,Project project)throws Exception {
		Scindivinfo scindivinfo=scholarshipQuery.getScindivinfo();
		Scappinfo scappinfo=scholarshipQuery.getScappinfo();
		Scholarshipapp scholarshipapp=new Scholarshipapp();
		logger.info("=================执行信息提交================");
		scindivinfoMapper.insertSelective(scindivinfo);
		scappinfoMapper.insertSelective(scappinfo);
		BonusnoticeExample bonusnoticeExample=new BonusnoticeExample();
		bonusnoticeExample.createCriteria().andProjectIdEqualTo(project.getProjectId());
		List<Bonusnotice> bonusnoticesList=bonusnoticeMapper.selectByExample(bonusnoticeExample);
		if(bonusnoticesList.size()!=1){
			throw new Exception("系统异常");
		}else{
			Bonusnotice bonusnotice=bonusnoticesList.get(0);
			scholarshipapp.setBonusnoticeId(bonusnotice.getBonusnoticeId());
		}
		scholarshipapp.setScappinfoId(scappinfo.getScappinfoId());
		scholarshipapp.setScindivinfoId(scindivinfo.getScindivinfoId());
		scholarshipapp.setStuNum(user.getUsername());
		scholarshipappMapper.insertSelective(scholarshipapp);
		
	}
	
	/**
	 * @Description: 筛选出奖学金的信息显示在申请功能的页面
	 * @author:gjh
	 * @Date:2015年8月20日下午9:56:50
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<BonusnoticeCustom> selectScholarshipCustom() throws Exception {
		BonusnoticeExample bonusnoticeExample=new BonusnoticeExample();
		BonusnoticeExample.Criteria criteria=bonusnoticeExample.createCriteria();
		criteria.andStateEqualTo((byte)1);
		List<BonusnoticeCustom> bonusnoticeCustomsList=new ArrayList<BonusnoticeCustom>();
		List<Bonusnotice> bonusnoticeList=bonusnoticeMapper.selectByExample(bonusnoticeExample);
		for (Bonusnotice bonusnotice : bonusnoticeList) {
			Project project=projectMapper.selectByPrimaryKey(bonusnotice.getProjectId());
			if(project.getFundtypeId()==1){
				BonusnoticeCustom bonusnoticeCustom=new BonusnoticeCustom();
				bonusnoticeCustom.setProject(project);
				bonusnoticeCustom.setStartDate(bonusnotice.getStartDate());
				bonusnoticeCustom.setJudgeState(bonusnotice.getJudgeState());
				bonusnoticeCustomsList.add(bonusnoticeCustom);
			}
		}
		return bonusnoticeCustomsList;
	}
	/**
	 * @Description: 根据项目id判断用户是否已经申请该奖金
	 * @author:gjh
	 * @Date:2015年8月21日上午9:51:44
	 * @param projectId  项目id
	 * @param session 获取登录用户的信息
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean judgeScholarship(Integer projectId,User user) throws Exception {
		boolean bool=false;
		ScholarshipappExample scholarshipappExample=new ScholarshipappExample();
		ScholarshipappExample.Criteria criteria=scholarshipappExample.createCriteria();
		criteria.andStuNumEqualTo(user.getUsername());
		List<Scholarshipapp> scholarshipappsList=scholarshipappMapper.selectByExample(scholarshipappExample);
		for (Scholarshipapp scholarshipapp : scholarshipappsList) {
			Bonusnotice bonusnotice=bonusnoticeMapper.selectByPrimaryKey(scholarshipapp.getBonusnoticeId());
			if(bonusnotice.getProjectId()==projectId){
				bool=true;
				break;
			}
		}
		return bool;
	}
	
	/**
	 * @Description: 根据项目id查找项目信息
	 * @author:gjh
	 * @Date:2015年8月21日上午9:50:55
	 */
	@Override
	public Project selectProject(Integer projectId) throws Exception {
		Project project=projectMapper.selectByPrimaryKey(projectId);
		return project;
	}
	
	/**
	 * @Description: 筛选出奖学金的信息显示在查看功能的页面
	 * @author:gjh
	 * @Date:2015年8月21日上午11:59:37
	 */
	@Override
	public List<SubmittedBonusForm> selectScholarshipappCustom(User user) throws Exception {
		ScholarshipappExample scholarshipappExample=new ScholarshipappExample();
		scholarshipappExample.createCriteria().andStuNumEqualTo(user.getUsername());
		scholarshipappExample.createCriteria().andStateNotEqualTo((byte)0);
		StipendappExample stipendappExample=new StipendappExample();
		stipendappExample.createCriteria().andStuNumEqualTo(user.getUsername());
		stipendappExample.createCriteria().andStateNotEqualTo((byte)0);
		List<Scholarshipapp> scholarshipappsList=scholarshipappMapper.selectByExample(scholarshipappExample);
		List<SubmittedBonusForm> SubmittedBonusFormsList=new ArrayList<SubmittedBonusForm>();
		//获取已申请的奖学金信息
		onloadScBonusNoticeList(scholarshipappsList, SubmittedBonusFormsList);
		return SubmittedBonusFormsList;
	}
	/**
	 * @Description: 根据用户id判断用户是否已申请该助学金
	 * @author:gjh
	 * @Date:2015年8月21日下午1:26:14
	 * @param projectId 项目id
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean judgeStipend(Integer projectId, User user) throws Exception {
		boolean bool=false;
		StipendappExample stipendappExample=new StipendappExample();
		stipendappExample.createCriteria().andStuNumEqualTo(user.getUsername());
		List<Stipendapp> stipendappsList=stipendappMapper.selectByExample(stipendappExample);
		for (Stipendapp stipendapp : stipendappsList) {
			Bonusnotice bonusnotice=bonusnoticeMapper.selectByPrimaryKey(stipendapp.getBonusnoticeId());
			if(bonusnotice.getProjectId()==projectId){
				bool=true;
				break;
			}
		}
		return bool;
	}
	/**
	 * @Description: 将助学金申请表的信息提交到数据库
	 * @author:gjh
	 * @Date:2015年8月21日下午9:38:24
	 * @param stipendappQuery
	 * @param user
	 * @param project
	 * @throws Exception
	 */
	@Override
	public void insertStipendappForm(StipendappQuery stipendappQuery, User user, Project project) throws Exception {
		Stindivinfo stindivinfo=stipendappQuery.getStindivinfo();
		Stappinfo stappinfo=stipendappQuery.getStappinfo();
		Stipendapp stipendapp=new Stipendapp();
		logger.info("=================执行信息提交================");
		stindivinfoMapper.insertSelective(stindivinfo);
		stappinfoMapper.insertSelective(stappinfo);
		BonusnoticeExample bonusnoticeExample=new BonusnoticeExample();
		bonusnoticeExample.createCriteria().andProjectIdEqualTo(project.getProjectId());
		List<Bonusnotice> bonusnoticesList=bonusnoticeMapper.selectByExample(bonusnoticeExample);
		if(bonusnoticesList.size()!=1){
			throw new Exception("系统异常");
		}else {
			Bonusnotice bonusnotice=bonusnoticesList.get(0);
			stipendapp.setBonusnoticeId(bonusnotice.getBonusnoticeId());
			stipendapp.setStuNum(user.getUsername());
			stipendapp.setStappinfoId(stappinfo.getStappinfoId());
			stipendapp.setStindivinfoId(stindivinfo.getStindivinfoId());
		}
		stipendappMapper.insertSelective(stipendapp);
	}
	/**
	 * @Description: 根据用户信息查找选择已填写的奖学金表
	 * @author:gjh
	 * @Date:2015年8月22日上午12:18:52
	 * @param project
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@Override
	public ScholarshipQuery selectScholarshipForm(Project project, User user) throws Exception {
		ScholarshipQuery scholarshipQuery=new ScholarshipQuery();
		BonusnoticeExample bonusnoticeExample=new BonusnoticeExample();
		bonusnoticeExample.createCriteria().andProjectIdEqualTo(project.getProjectId());
		List<Bonusnotice> bonusnoticesList=bonusnoticeMapper.selectByExample(bonusnoticeExample);
		if(bonusnoticesList.size()!=1){
			throw new Exception("系统异常");
		}else {
			Bonusnotice bonusnotice=bonusnoticesList.get(0);
			ScholarshipappExample scholarshipappExample=new ScholarshipappExample();
			scholarshipappExample.createCriteria().andBonusnoticeIdEqualTo(bonusnotice.getBonusnoticeId());
			scholarshipappExample.createCriteria().andStuNumEqualTo(user.getUsername());
			List<Scholarshipapp> scholarshipappsList=scholarshipappMapper.selectByExample(scholarshipappExample);
			if(scholarshipappsList.size()!=1){
				throw new Exception("系统异常");
			}else {
				Scholarshipapp scholarshipapp=scholarshipappsList.get(0);
				Scindivinfo scindivinfo=scindivinfoMapper.selectByPrimaryKey(scholarshipapp.getScindivinfoId());
				Scappinfo scappinfo=scappinfoMapper.selectByPrimaryKey(scholarshipapp.getScappinfoId());
				scholarshipQuery.setProject(project);
				scholarshipQuery.setScappinfo(scappinfo);
				scholarshipQuery.setScindivinfo(scindivinfo);
			}
		}
		return scholarshipQuery;
	}
	/**
	 * @Description: 根据用户信息查找选择已填写的助学金表
	 * @author:gjh
	 * @Date:2015年8月22日上午12:32:25
	 * @param project
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@Override
	public StipendappQuery selectStipendForm(Project project, User user) throws Exception {
		StipendappQuery stipendappQuery=new StipendappQuery();
		BonusnoticeExample bonusnoticeExample=new BonusnoticeExample();
		bonusnoticeExample.createCriteria().andProjectIdEqualTo(project.getProjectId());
		List<Bonusnotice> bonusnoticesList=bonusnoticeMapper.selectByExample(bonusnoticeExample);
		if(bonusnoticesList.size()!=1){
			throw new Exception("系统异常");
		}else {
			Bonusnotice bonusnotice=bonusnoticesList.get(0);
			StipendappExample stipendappExample=new StipendappExample();
			stipendappExample.createCriteria().andBonusnoticeIdEqualTo(bonusnotice.getBonusnoticeId());
			stipendappExample.createCriteria().andStuNumEqualTo(user.getUsername());
			List<Stipendapp> stipendappsList=stipendappMapper.selectByExample(stipendappExample);
			if(stipendappsList.size()!=1){
				throw new Exception("系统异常");
			}else {
				Stipendapp stipendapp=stipendappsList.get(0);
				Stappinfo stappinfo=stappinfoMapper.selectByPrimaryKey(stipendapp.getStappinfoId());
				Stindivinfo stindivinfo=stindivinfoMapper.selectByPrimaryKey(stipendapp.getStindivinfoId());
				stipendappQuery.setStappinfo(stappinfo);
				stipendappQuery.setStindivinfo(stindivinfo);
				stipendappQuery.setProject(project);
			}
		}
		return stipendappQuery;
	}
	/**
	 * @Description: 筛选出助学金的信息显示在申请页面
	 * @author:gjh
	 * @Date:2015年8月22日下午10:54:01
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<BonusnoticeCustom> selectStipendCustom() throws Exception {
		BonusnoticeExample bonusnoticeExample=new BonusnoticeExample();
		BonusnoticeExample.Criteria criteria=bonusnoticeExample.createCriteria();
		criteria.andStateEqualTo((byte)1);
		List<BonusnoticeCustom> bonusnoticeCustomsList=new ArrayList<BonusnoticeCustom>();
		List<Bonusnotice> bonusnoticeList=bonusnoticeMapper.selectByExample(bonusnoticeExample);
		for (Bonusnotice bonusnotice : bonusnoticeList) {
			Project project=projectMapper.selectByPrimaryKey(bonusnotice.getProjectId());
			if(project.getFundtypeId()==2){
				BonusnoticeCustom bonusnoticeCustom=new BonusnoticeCustom();
				bonusnoticeCustom.setProject(project);
				bonusnoticeCustom.setStartDate(bonusnotice.getStartDate());
				bonusnoticeCustom.setJudgeState(bonusnotice.getJudgeState());
				bonusnoticeCustomsList.add(bonusnoticeCustom);
			}
		}
		return bonusnoticeCustomsList;
	}
	/**
	 * @Description: 筛选出助学金的信息显示在查看页面
	 * @author:gjh
	 * @Date:2015年8月22日下午11:24:38
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<SubmittedBonusForm> selectStipendappCustom(User user) throws Exception {
		ScholarshipappExample scholarshipappExample=new ScholarshipappExample();
		scholarshipappExample.createCriteria().andStuNumEqualTo(user.getUsername());
		scholarshipappExample.createCriteria().andStateNotEqualTo((byte)0);
		StipendappExample stipendappExample=new StipendappExample();
		stipendappExample.createCriteria().andStuNumEqualTo(user.getUsername());
		stipendappExample.createCriteria().andStateNotEqualTo((byte)0);
		List<Stipendapp> stipendappsList=stipendappMapper.selectByExample(stipendappExample);
		List<SubmittedBonusForm> SubmittedBonusFormsList=new ArrayList<SubmittedBonusForm>();
		//获取已申请的助学金信息
		onloadStBonusNoticeList(stipendappsList, SubmittedBonusFormsList);
		return SubmittedBonusFormsList;
	}

	/**
	 * @Description: 根据奖金评审通知id查找对应的所有助学金申请表
	 * @author:JackBauer
	 * @Date:2015年10月15日下午3:36:49
	 */
	@Override
	public List<ScholarshipAppCustom> findAllScAppsByBid(Integer bonusNoticeId) throws Exception {
		
		ScholarshipappExample scholarshipappExample = new ScholarshipappExample();
		ScholarshipappExample.Criteria criteria = scholarshipappExample.createCriteria();
		criteria.andStateNotEqualTo((byte)0);
		criteria.andBonusnoticeIdEqualTo(bonusNoticeId);
		List<Scholarshipapp> scholarshipappsList=scholarshipappMapper.selectByExample(scholarshipappExample);
		
		return onloadScAppList(scholarshipappsList);
	}
	
	/**
	 * @Description: 根据奖金评审通知id查找对应的所有奖学金申请表
	 * @author:JackBauer
	 * @Date:2015年10月15日下午3:36:49
	 */
	@Override
	public List<StipendAppCustom> findAllStAppsByBid(Integer bonusNoticeId) throws Exception {
		StipendappExample example = new StipendappExample();
		StipendappExample.Criteria criteria = example.createCriteria();
		criteria.andStateNotEqualTo((byte) 0);
		criteria.andBonusnoticeIdEqualTo(bonusNoticeId);
		List<Stipendapp> stipendappsList = stipendappMapper.selectByExample(example);
	
		return onloadStAppList(stipendappsList);
	}
	
	/*
	 * 更新奖学金
	 */
	@Override
	public void updateScApp(Scholarshipapp scApp) throws Exception {
		try {
			scholarshipappMapper.updateByPrimaryKeySelective(scApp);
		} catch (Exception e) {
			logger.error("updateScApp failed!", e);
			throw new BonusAppException("更新奖学金申请表失败！");
		}
	}
	
	/*
	 * 更新助学金
	 */
	@Override
	public void updateStApp(Stipendapp scApp) throws Exception {
		try {
			stipendappMapper.updateByPrimaryKeySelective(scApp);
		} catch (Exception e) {
			logger.error("updateStApp failed!", e);
			throw new BonusAppException("更新助学金申请表失败！");
		}
	}
	
	/**
	 * @Description: 插入评审通知，表示奖学金开始报名啦
	 * @author:JackBauer
	 * @Date:2015年8月29日下午8:33:27
	 */
	@Override
	public void insertBonusNotice(Bonusnotice bonusNotice) throws Exception {
		try {
			bonusnoticeMapper.insertSelective(bonusNotice);
		} catch (Exception e) {
			logger.error("insert bonusNotice failed", e);
			throw new ProjectException("开始报名失败！");
		}
	}
	
	/**
	 * @Description: 更新评审通知，主要用于奖学金报名结束
	 * @author:JackBauer
	 * @Date:2015年8月29日下午8:37:44
	 */
	@Override
	public void updateBonusNotice(Bonusnotice bonusNotice) throws Exception {
		try {
			bonusnoticeMapper.updateByPrimaryKeySelective(bonusNotice);
		} catch (Exception e) {
			logger.error("update bonusNotice failed", e);
			throw new ProjectException("结束报名失败！");
		}
	}
	
	/*
	 * 将查询出来的奖学金申请表装载到BonusNoticeList集合中
	 */
	public List<ScholarshipAppCustom> onloadScAppList(List<Scholarshipapp>source)throws Exception{
		List<ScholarshipAppCustom> dest = new ArrayList<>();
		for(Scholarshipapp scApp : source){
			ScholarshipAppCustom scAppCustom = new ScholarshipAppCustom();
			BeanUtils.copyProperties(scAppCustom, scApp);
			scAppCustom.setScAppInfo(scappinfoMapper.selectByPrimaryKey(scApp.getScappinfoId()));
			scAppCustom.setScIndivInfo(scindivinfoMapper.selectByPrimaryKey(scApp.getScindivinfoId()));
			
			dest.add(scAppCustom);
		}
		
		return dest;
	}
	
	/*
	 * 将查询出来的助学金申请表装载到BonusNoticeList集合中
	 */
	public List<StipendAppCustom> onloadStAppList(List<Stipendapp>source)throws Exception{
		List<StipendAppCustom> dest = new ArrayList<>();
		for(Stipendapp stApp : source){
			StipendAppCustom stAppCustom = new StipendAppCustom();
			BeanUtils.copyProperties(stAppCustom, stApp);
			stAppCustom.setStAppInfo(stappinfoMapper.selectByPrimaryKey(stApp.getStappinfoId()));
			stAppCustom.setStIndivInfo(stindivinfoMapper.selectByPrimaryKey(stApp.getStindivinfoId()));
			
			dest.add(stAppCustom);
		}
		
		return dest;
	}
	
	
	
	public void onloadScBonusNoticeList(List<Scholarshipapp> scholarshipAppList,List<SubmittedBonusForm> submittedBonusFormsList)throws Exception{
		for (Scholarshipapp scholarshipapp : scholarshipAppList) {
			Bonusnotice bonusnotice=bonusnoticeMapper.selectByPrimaryKey(scholarshipapp.getBonusnoticeId());
			Project project=projectMapper.selectByPrimaryKey(bonusnotice.getProjectId()); 
			SubmittedBonusForm submittedBonusForm=new SubmittedBonusForm();
			submittedBonusForm.setStartDate(bonusnotice.getStartDate());
			submittedBonusForm.setIsPassed(scholarshipapp.getIsPassed());
			submittedBonusForm.setProjectName(project.getProjectName());
			submittedBonusForm.setProjectId(project.getProjectId());
			submittedBonusForm.setFundType(project.getFundtypeId());
			
			submittedBonusFormsList.add(submittedBonusForm);
		}
	}
	
	/*
	 * 将查询出来的助学金申请表装载到BonusNoticeList集合中
	 */
	public void onloadStBonusNoticeList(List<Stipendapp> stipendAppList,List<SubmittedBonusForm> submittedBonusFormsList)throws Exception{
		for (Stipendapp stipendApp : stipendAppList) {
			Bonusnotice bonusnotice=bonusnoticeMapper.selectByPrimaryKey(stipendApp.getBonusnoticeId());
			Project project=projectMapper.selectByPrimaryKey(bonusnotice.getProjectId()); 
			SubmittedBonusForm submittedBonusForm=new SubmittedBonusForm();
			submittedBonusForm.setStartDate(bonusnotice.getStartDate());
			submittedBonusForm.setIsPassed(stipendApp.getIsPassed());
			submittedBonusForm.setProjectName(project.getProjectName());
			submittedBonusForm.setProjectId(project.getProjectId());
			submittedBonusForm.setFundType(project.getFundtypeId());
			
			submittedBonusFormsList.add(submittedBonusForm);
		}
	}

	@Override
	public ScholarshipAppCustom findScAppByAppId(Integer appId) throws Exception {
		try {
			return scholarshipappMapper.selectScAppByAppId(appId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @Description: 根据申请表id查找对应的助学金申请表
	 * @author:JackBauer
	 * @Date:2015年10月17日下午4:43:35
	 */
	@Override
	public StipendAppCustom findStAppByAppId(Integer appId) throws Exception {
		try {
			return stipendappMapper.selectStAppByAppId(appId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @Description: 根据评审通知id查找评审通知
	 * @author:JackBauer
	 * @Date:2015年10月17日下午4:44:04
	 */
	@Override
	public Bonusnotice findBonusNoticeByBNoticeId(Integer bonusNoticeId) throws Exception {
		try {
			return bonusnoticeMapper.selectByPrimaryKey(bonusNoticeId);
		} catch (Exception e) {
			logger.error("findBonusNoticeByBNoticeId failed!", e);
			return null;
		}
	}

	/*
	 * 评审通知对应的未审核奖学金申请表总数
	 */
	@Override
	public int getUnverifiedScAppsCountByBNId(Integer bNoticeId) throws Exception {
		try {
			return countsMapper.selectUnverifiedScAppsCountByBNId(bNoticeId);
		} catch (Exception e) {
			logger.error("getUnverifiedScAppsCountByBNId failed!",e);
			return 0;
		}
	}

	/*
	 * 评审通知对应的未审核助学金申请表总数
	 */
	@Override
	public int getUnverifiedStAppsCountByBNId(Integer bNoticeId) throws Exception {
		try {
			return countsMapper.selectUnverifiedStAppsCountByBNId(bNoticeId);
		} catch (Exception e) {
			logger.error("getUnverifiedStAppsCountByBNId failed!",e);
			return 0;
		}
	}

	/*
	 * 评审通知对应的已审核奖学金申请表总数
	 */
	@Override
	public int getVerifiedScAppsCountByBNId(Integer bNoticeId) throws Exception {
		try {
			return countsMapper.selectVerifiedScAppsCountByBNId(bNoticeId);
		} catch (Exception e) {
			logger.error("getVerifiedScAppsCountByBNId failed!",e);
			return 0;
		}
	}

	/*
	 * 评审通知对应的已审核助学金申请表总数
	 */
	@Override
	public int getVerifiedStAppsCountByBNId(Integer bNoticeId) throws Exception {
		try {
			return countsMapper.selectVerifiedStAppsCountByBNId(bNoticeId);
		} catch (Exception e) {
			logger.error("getVerifiedStAppsCountByBNId failed!",e);
			return 0;
		}
	}

	/**
	 * @Description: 根据评审通知查找所有未审核的奖学金申请表
	 * @author:JackBauer
	 * @Date:2015年10月18日上午10:20:12
	 */
	@Override
	public List<ScholarshipAppCustom> findUnverifiedScAppsByBNoticeId(Integer bNoticeId,Page page) throws Exception {
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("bNoticeId", bNoticeId);
			map.put("page", page);
			map.put("order", "Institute ASC,Sc_StuId ASC");
			return scholarshipappMapper.selectUnverifiedScAppsByBNoticeId(map);
		} catch (Exception e) {
			logger.error("findUnverifiedScAppsByBNoticeId failed!", e);
			return null;
		}
	}

	/**
	 * @Description: 根据评审通知查找所有未审核的助学金申请表
	 * @author:JackBauer
	 * @Date:2015年10月18日上午10:20:12
	 */
	@Override
	public List<StipendAppCustom> findUnverifiedStAppsByBNoticeId(Integer bNoticeId,Page page) throws Exception {
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("bNoticeId", bNoticeId);
			map.put("page", page);
			map.put("order", "Institute ASC,St_StuId ASC");
			return stipendappMapper.selectUnverifiedStAppsByBNId(map);
		} catch (Exception e) {
			logger.error("findUnverifiedStAppsByBNoticeId failed!", e);
			return null;
		}
	}

	/**
	 * @Description: 根据评审通知查找所有已审核的奖学金申请表
	 * @author:JackBauer
	 * @Date:2015年10月18日上午10:20:12
	 */
	@Override
	public List<ScholarshipAppCustom> findVerifiedScAppsByBNoticeId(Integer bNoticeId,Page page) throws Exception {
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("bNoticeId", bNoticeId);
			map.put("page", page);
			map.put("order", "Institute ASC,Sc_StuId ASC");
			return scholarshipappMapper.selectVerifiedScAppsByBNoticeId(map);
		} catch (Exception e) {
			logger.error("findVerifiedScAppsByBNoticeId failed!", e);
			return null;
		}
	}

	/**
	 * @Description: 根据评审通知查找所有已审核的助学金申请表
	 * @author:JackBauer
	 * @Date:2015年10月18日上午10:20:12
	 */
	@Override
	public List<StipendAppCustom> findVerifiedStAppsByBNoticeId(Integer bNoticeId,Page page) throws Exception {
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("bNoticeId", bNoticeId);
			map.put("page", page);
			map.put("order", "Institute ASC,St_StuId ASC");
			return stipendappMapper.selectVerifiedStAppsByBNId(map);
		} catch (Exception e) {
			logger.error("findVerifiedStAppsByBNoticeId failed!", e);
			return null;
		}
	}

}
