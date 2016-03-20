package com.fund.controller;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.fund.exception.ProjectException;
import com.fund.po.Bonusnotice;
import com.fund.query.ExamineBonusAppQuery;
import com.fund.po.Fundtype;
import com.fund.po.JsonResult;
import com.fund.po.Project;
import com.fund.po.ScholarshipAppCustom;
import com.fund.po.StipendAppCustom;
import com.fund.po.User;
import com.fund.po.custom.ProjectCustom;
import com.fund.service.BonusService;
import com.fund.service.ProjectAdminService;
import com.fund.service.ProjectService;
import com.fund.service.SystemAdminService;
import com.fund.utils.Const;
import com.fund.utils.Page;

@Controller
@RequestMapping("/benificiary")
public class BenificiaryController {

	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private ProjectService projectService;
	@Autowired
	private BonusService bonusService;
	@Autowired
	private ProjectAdminService proAdminService;
	@Autowired
	private SystemAdminService systemAdminService;
	
	//跳转首页
	@RequestMapping("/index")
	public ModelAndView toIndex_1(HttpSession session)throws Exception
	{
		return getProjectsByUserId(session,null);
	}

	@RequestMapping("/")
	public ModelAndView toIndex_2(HttpSession session)throws Exception
	{
		return getProjectsByUserId(session,null);
	}
	
	//转发到修改密码页面
	@RequestMapping("/changePwd")
	public String changePwd()throws Exception
	{
		return "user/benificiary/changePwd";
	}

	// 跳转到上传页面
	@RequestMapping("/toUpload")
	public String toUpload() throws Exception {
		return "user/benificiary/upload";
	}
	
	/**
	 * @Description: 立项前，首先转发到选择项目类型页面
	 * @author:JackBauer
	 * @Date:2015年8月17日下午3:50:28
	 */
	@RequestMapping("/beforeSetUp")
	public String beforeSetUp(HttpSession session)throws Exception{
		return "user/benificiary/createProject";
	}			
	
	
	//选择项目类型和基金类型后转发到立项表单页面
	@RequestMapping("/toSetUp")
	public ModelAndView toSetUp(HttpSession session,Integer fundtypeId)throws Exception{
		ModelAndView mv = new ModelAndView();
		if(isFundTypeExist(fundtypeId)){
			mv.addObject("bUnitList", projectService.findAllBUnits());//查找所有的收益单位
			session.setAttribute("fundtypeId", fundtypeId);
			mv.setViewName("user/benificiary/projectApplicationForm");
		}else{
			mv.setViewName("500");
		}
		
		return mv;
	}
	
	//转发到修改单个立项信息页面
	@RequestMapping("toEditProject")
	public ModelAndView toEditProject(HttpSession session,Integer projectId)throws Exception{
		ProjectCustom project = projectService.findProjectByPid(projectId);
		ModelAndView mv = new ModelAndView();
		if(project!=null && project.getIsPassed()==0){
			mv.addObject("p", project);
			mv.setViewName("user/benificiary/editProject");
		}else{
			mv.setViewName("404");
		}
		return mv;
	}	
	
	/**
	 * @Description: 提交或保存立项表业务
	 * @author:JackBauer
	 * @Date:2015年8月17日下午3:47:47
	 */
	@RequestMapping(value = "/setUp",method = RequestMethod.POST)
	public @ResponseBody JsonResult setUp(HttpSession session,ProjectCustom project)throws Exception{
		JsonResult jsonResult = new JsonResult();
		try {
			Integer fTypeId = (Integer) session.getAttribute("fundtypeId");
			project.setFundtypeId(fTypeId);
			project.setSetupTime(new Date());
			
			User user = (User)session.getAttribute("user");
			project.setUserId(user.getUserId());
			String filePathPrefix = Const.PATH_FILES;

			if(project.getMode()==null || project.getMode()==1){
				projectService.insertProject(project,1,filePathPrefix);
			}else{
				projectService.insertProject(project,0,filePathPrefix);
			}
			logger.info("Create project success!ProjectId="+project.getProjectId());
			jsonResult.setResultCode(1);
		} catch (Exception e) {
			logger.info("Create project failed!");
			jsonResult.setResultCode(0);
			jsonResult.setResultMessage("创建立项失败！");
		}
		return jsonResult;
	}
	
	/**
	 * @Description: 更新未提交的表单，实现二次保存或提交
	 * @author:JackBauer
	 * @Date:2015年8月21日下午2:00:41
	 */
	@RequestMapping(value = "/updateProject",method = RequestMethod.POST)
	@ResponseBody
	public JsonResult updateProject(HttpSession session,ProjectCustom newProject,Integer mode)throws Exception{
		JsonResult jsonResult = new JsonResult();
		try {
			newProject.setSetupTime(new Date());
			String filePathPrefix = Const.PATH_FILES;
			ProjectCustom oldProject = projectService.findProjectByPid(newProject.getProjectId());
			
			if(mode==null || mode==1){
				projectService.updateProject(newProject,oldProject,1,filePathPrefix);
			}else{
				projectService.updateProject(newProject,oldProject,0,filePathPrefix);
			}
			jsonResult.setResultCode(1);
		} catch (Exception e) {
			jsonResult.setResultCode(0);
			jsonResult.setResultMessage("更新立项失败！");
		}
		
		return jsonResult;
	}
	
	/**
	 * @Description: 删除还未提交或者审核无效的立项
	 * @author:JackBauer
	 * @Date:2015年8月20日上午9:47:56
	 */
	@RequestMapping(value = "/deleteProject",method = RequestMethod.POST)
	@ResponseBody
	public JsonResult deleteProject(HttpSession session,Integer projectId)throws Exception{
		JsonResult jsonResult = new JsonResult();
		try {
			ProjectCustom project = projectService.findProjectByPid(projectId);

			
			if(project!=null)
			{
				projectService.deleteProjectByPid(projectId);
				jsonResult.setResultCode(1);
				logger.info("delete project:"+project.getProjectName()+" seccess!");
			}
		} catch (Exception e) {
			jsonResult.setResultCode(0);
			if(e instanceof ProjectException){
				jsonResult.setResultMessage(e.getMessage());
			}else{
				jsonResult.setResultMessage("未知原因：删除失败！");
				logger.error(e);
			}
		}
		return jsonResult;
	}
	
	/**
	 * @Description: 查询单个立项的所有信息
	 * @author:JackBauer
	 * @Date:2015年8月17日下午3:48:31
	 */
	@RequestMapping("/checkProject")
	public ModelAndView checkProject(HttpSession session,Integer projectId)throws Exception{
		ProjectCustom p = projectService.findProjectByPid(projectId);
		ModelAndView mv = new ModelAndView();
		if(p!=null && p.getIsPassed()==2){
			session.setAttribute("p", p);
			
			int fTypeId = p.getFundtypeId();//基金类型
			if(fTypeId == 1|| fTypeId == 2 || fTypeId == 7){
				mv.setViewName("user/benificiary/bonusProjectInfo");
			}else{
				mv.setViewName("user/benificiary/fundProjectInfo");
			}
			
		}else{
			mv.setViewName("404");
		}
		return mv;
	}
	
	/**
	 * 
	 * @Description: 转发到查看立项表的页面（已提交，不可修改）
	 * @author:JackBauer
	 */
	@RequestMapping("/checkProjectForm")
	public ModelAndView checkProjectForm(HttpSession session,Integer projectId)throws Exception{
		ProjectCustom p = projectService.findProjectByPid(projectId);
		ModelAndView mv = new ModelAndView();
		if(p!=null){
			User user = (User)session.getAttribute("user");
			if(p.getUserId()!=user.getUserId())//如果不是受益方自己的立项则无法查看！
			{
				mv.setViewName("404");
			}else{
				session.setAttribute("p", p);
				mv.setViewName("user/benificiary/submittedProjectForm");
			}
		}else{
			mv.setViewName("404");
		}
		return mv;
	}
		
	/**
	 * @Description: 根据受益方用户id查询对应的所有立项
	 * @author:JackBauer
	 * @Date:2015年9月17日下午2:44:49
	 */
	@RequestMapping("/getProjects")
	public ModelAndView getProjectsByUserId(HttpSession session,@RequestParam(value="pageNow",required=false) Integer pageNow)throws Exception{
		User user = (User)session.getAttribute("user");
		Page page = null;

		int totalCount = projectService.getProjectsCountByUserId(user.getUserId());
		if (pageNow != null) {
			page = new Page(totalCount, pageNow);
		} else {
			page = new Page(totalCount, 1);
		}
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("page", page);
		mv.addObject("projectList", projectService.findProjectsByUserId(user.getUserId(), page));
		mv.setViewName("user/benificiary/allProjects");
		return mv;
	}
	
	/**
	 * 
	 * @Description: 根据受益方选择的项目分类返回对应的基金项目
	 * @author:JackBauer
	 * @Date:2015年8月17日下午3:49:47
	 */
	@RequestMapping("/getFundTypes")
	public @ResponseBody List<Fundtype> getFundTypesByPTypeId(Integer projectTypeId)throws Exception{
		return projectService.findFundTypesByPid(projectTypeId);
	}
	
	/**
	 * @Description: 查看某个立项的所有申请表
	 * @author:JackBauer
	 * @Date:2015年8月29日下午5:14:25
	 */
	@RequestMapping("/allBonusApps")
	public ModelAndView allBonusApps(HttpSession session,@RequestParam(value="pageNow",required=false)Integer pageNow)throws Exception{
		ProjectCustom p = (ProjectCustom) session.getAttribute("p");
		ModelAndView mv = new ModelAndView();
		if(p!=null){
			int totalCount = 0;
			
			if(p.getBonusNotice()!=null){
				if(p.getFundtypeId()==1){
					totalCount = projectService.getScAppsCountByBNId(p.getBonusNotice().getBonusnoticeId());
				}else if(p.getFundtypeId()==2){
					totalCount = projectService.getStAppsCountByBNId(p.getBonusNotice().getBonusnoticeId());
				}else if(p.getFundtypeId()==7){
					
				}
			}
			
			Page page = null;
			if (pageNow != null) {
				page = new Page(totalCount, pageNow);
			} else {
				page = new Page(totalCount, 1);
			}

			addBonusAppsToModel(mv, p, page);
			mv.addObject("page", page);
			mv.setViewName("user/benificiary/bonusApps");
		}else{
			mv.setViewName("404");
		}
		return mv;
	}
	
	/**
	 * 
	 * @Description: 跳转到新闻链接页面
	 * @author:JackBauer
	 * @Date:2015年8月30日上午9:25:14
	 */
	@RequestMapping("/newsLink")
	public ModelAndView newsLink(HttpSession session,@RequestParam(value="pageNow",required = false) Integer pageNow)throws Exception
	{
		ProjectCustom p = (ProjectCustom) session.getAttribute("p");
		ModelAndView mv = new ModelAndView();
		if(p!=null){
			int totalCount = proAdminService.getVerifiedNewsUrlsCountByPid(p.getProjectId());
			Page page = new Page(totalCount, pageNow != null?pageNow:1);
			
			mv.addObject("newsUrlList", proAdminService.findVerifiedNewsUrlsByPid(page, p.getProjectId()));
			mv.addObject("page", page);
			mv.setViewName("user/benificiary/newsLink");
		}else{
			mv.setViewName("404");
		}
		return mv;
	}
	
	@RequestMapping(value="/deleteNewsLink",method = RequestMethod.POST)
	@ResponseBody
	public JsonResult deleteNewsLink(Integer newsurlId)throws Exception{
		JsonResult jsonResult = new JsonResult();
		try{
			systemAdminService.deleteNewsLink(newsurlId);
			jsonResult.setResultCode(1);
		}catch(Exception ex){
			jsonResult.setResultCode(0);
			if(ex instanceof ProjectException){
				jsonResult.setResultMessage(ex.getMessage());
			}else{
				logger.error(ex.getMessage());
				jsonResult.setResultMessage("删除失败，未知错误！");
			}
		}
		return jsonResult;
	}
	
	/**
	 * @Description: 奖学金开始报名或者结束报名
	 * @author:JackBauer
	 * @Date:2015年8月29日下午11:31:00
	 */
	@RequestMapping(value = "/adminEnrollment",method = RequestMethod.POST)
	@ResponseBody
	public JsonResult adminEnrollment(HttpSession session,Byte judgeState)throws Exception{
		JsonResult jsonResult = new JsonResult();
		ProjectCustom project = (ProjectCustom) session.getAttribute("p");
		if(project!=null && isBonusProject(project)){
			Bonusnotice bNotice = project.getBonusNotice();
			if(bNotice==null || judgeState==1)//开始报名
			{
				try {
					bNotice = new Bonusnotice();
					bNotice.setProjectId(project.getProjectId());
					bNotice.setStartDate(new Date());
					bNotice.setJudgeState(judgeState);
					bonusService.insertBonusNotice(bNotice);
					
					project.setBonusNotice(bNotice);
					session.setAttribute("p", project);
					jsonResult.setResultCode(1);
				} catch (Exception e) {
					jsonResult.setResultCode(0);
					if(e instanceof ProjectException){
						jsonResult.setResultMessage(e.getMessage());
					}else{
						logger.error("unknownException", e);
						jsonResult.setResultMessage("未知错误：开始报名失败！");
					}
				}
			}
			else if(bNotice!=null)//结束报名
			{
				try {
					bNotice.setEndDate(new Date());
					bNotice.setJudgeState(judgeState);
					bonusService.updateBonusNotice(bNotice);
					
					project.setBonusNotice(bNotice);
					session.setAttribute("p", project);
					jsonResult.setResultCode(2);
				} catch (Exception e) {
					jsonResult.setResultCode(0);
					if(e instanceof ProjectException){
						jsonResult.setResultMessage(e.getMessage());
					}else{
						logger.error("unknownException", e);
						jsonResult.setResultMessage("未知错误：结束报名失败！");
					}
				}
			}
		}
		return jsonResult;
	}
	
	/**
	 * @Description: 查找所有奖金立项（报名开始或结束的）
	 * @author:JackBauer
	 * @Date:2015年10月17日下午3:34:37
	 */
	@RequestMapping("/bonusProjects")
	public ModelAndView bonusProjects(HttpSession session,@RequestParam(value="pageNow",required=false) Integer pageNow)throws Exception{
		User user = (User)session.getAttribute("user");
		Page page = null;

		int totalCount = projectService.getBonusProjectsCountByUserId(user.getUserId());
		if (pageNow != null) {
			page = new Page(totalCount, pageNow);
		} else {
			page = new Page(totalCount, 1);
		}
		ModelAndView mv = new ModelAndView("user/benificiary/bonusProjects");
		mv.addObject("projectList", projectService.findBonusProjectsByUserId(user.getUserId(), page));
		mv.addObject("page", page);
		return mv;
	}
	
	/**
	 * @Description: 审核某个立项的所有申请表
	 * @author:JackBauer
	 * @Date:2015年8月29日下午5:14:25
	 */
	@RequestMapping("/examineBonusApps")
	public ModelAndView examineBonusApps(ExamineBonusAppQuery params,HttpSession session)throws Exception{
		ModelAndView mv = new ModelAndView();
		ProjectCustom p = projectService.findProjectByPid(params.getProjectId());
		Bonusnotice bNotice = p.getBonusNotice();
		
		if(p!=null && bNotice!=null){
			int totalCount = getBonusAppsCountByIsVerified(p.getFundtypeId(), params.getVerified(), bNotice.getBonusnoticeId());
			Page page = new Page(totalCount, params.getPageNow());

			addBonusAppsToModelByIsVerified(mv, p, params.getVerified(), bNotice, page);
			mv.addObject("page", page);
			mv.addObject("verified", params.getVerified());
			mv.setViewName("user/benificiary/examineBonusApps");
			session.setAttribute("p", p);
			session.setAttribute("examineBonusAppQuery", params);
		}else{
			mv.setViewName("404");
		}
		return mv;
	}
	
	/**
	 * @Description: 查看某个申请表，转发到审核页面
	 * @author:JackBauer
	 * @Date:2015年8月29日上午10:20:32
	 */
	@RequestMapping("/toExamineBonusApp")
	public ModelAndView toExamineBonusApp(HttpSession session,Integer appId)throws Exception{
		ProjectCustom p = (ProjectCustom)session.getAttribute("p");
		ModelAndView mv = new ModelAndView();
		if(p!=null){
			addBonusAppToModel(mv, p, appId,true);
		}else{
			mv.setViewName("404");
		}
		
		return mv;
	}
	
	/**
	 * @Description: 审核申请表
	 * @author:JackBauer
	 * @Date:2015年8月29日上午10:22:30
	 */
	@RequestMapping(value="/examineBonusApp",method=RequestMethod.POST)
	@ResponseBody
	public JsonResult examineBonusApp(HttpSession session,Byte isPassed,Integer appId)throws Exception{
		ProjectCustom p = (ProjectCustom)session.getAttribute("p");
		ExamineBonusAppQuery params = (ExamineBonusAppQuery)session.getAttribute("examineBonusAppQuery");
		
		JsonResult jsonResult = new JsonResult();
		jsonResult.setResultCode(exmineBonusAppToDb(p.getFundtypeId(), appId, isPassed));
		jsonResult.setData(params);
		return jsonResult;
	}
	
	
	/**
	 * @Description: 确认基金类型是否有效
	 * @author:JackBauer
	 * @Date:2015年8月18日下午4:01:24
	 */
	public boolean isFundTypeExist(Integer fundtypeId)throws Exception{
		if(fundtypeId<=0 || fundtypeId==null){
			return false;
		}else if(projectService.findFundTypeByFid(fundtypeId) != null){
			return true;
		}else
			return false;
	}
	
	/*
	 * 根据基金类型的不同向model中添加不同的奖金申请表
	 */
	public void addBonusAppsToModel(ModelAndView mv,ProjectCustom p,Page page)throws Exception{
		Bonusnotice  bNotice = p.getBonusNotice();
		if(bNotice!=null){
			if(p.getFundtypeId()==1)//奖学金
			{
				mv.addObject("bonusAppList", projectService.findScAppsByBNoticeId(bNotice.getBonusnoticeId(), page));
			}
			else if(p.getFundtypeId()==2)//助学金
			{
				mv.addObject("bonusAppList", projectService.findStAppsByBNoticeId(bNotice.getBonusnoticeId(), page));
			}
			else if(p.getFundtypeId()==7)//奖教金
			{
				
			}
		}
	}

	/*
	 * 根据基金类型和是否审核向model中添加不同的奖金申请表
	 */
	public void addBonusAppsToModelByIsVerified(ModelAndView mv,ProjectCustom p,byte verified,Bonusnotice bNotice,Page page)throws Exception{
		Integer bNoticeId = bNotice.getBonusnoticeId();
		if(p.getFundtypeId()==1)//奖学金
		{
			if(verified==0){
				mv.addObject("bonusAppList", bonusService.findUnverifiedScAppsByBNoticeId(bNoticeId, page));
			}else{
				mv.addObject("bonusAppList", bonusService.findVerifiedScAppsByBNoticeId(bNoticeId, page));
			}
			
		}
		else if(p.getFundtypeId()==2)//助学金
		{
			if(verified==0){
				mv.addObject("bonusAppList", bonusService.findUnverifiedStAppsByBNoticeId(bNoticeId, page));
			}else{
				mv.addObject("bonusAppList", bonusService.findVerifiedStAppsByBNoticeId(bNoticeId, page));
			}
		}
		else if(p.getFundtypeId()==7)//奖教金
		{
			
		}
	}
	
	/*
	 * 根据基金类型的不同向model中添加不同的奖金申请表
	 */
	public void addBonusAppToModel(ModelAndView mv,ProjectCustom p,Integer appId,boolean isToExamine)throws Exception{
		boolean flag = false;//用于判断申请表是否找到，未找到将视图设置为404
		
		if(p.getFundtypeId()==1)//奖学金
		{
			ScholarshipAppCustom app = bonusService.findScAppByAppId(appId);
			if(app!=null){
				flag = true;
				mv.addObject("app", app);
				if(!isToExamine)
					mv.setViewName("user/benificiary/checkScApp");
				else
					mv.setViewName("user/benificiary/examineScApp");
			}
		}
		else if(p.getFundtypeId()==2)//助学金
		{
			StipendAppCustom app = bonusService.findStAppByAppId(appId);
			if(app!=null){
				flag = true;
				mv.addObject("app", app);
				if(!isToExamine)
					mv.setViewName("user/benificiary/checkStApp");
				else
					mv.setViewName("user/benificiary/examineStApp");
			}
		}
		else if(p.getFundtypeId()==7)//奖教金
		{
			
		}
		
		//安全性检验
		if(p.getProjectId()!=p.getBonusNotice().getProjectId()){
			flag=false;
		}
		
		if(!flag){
			mv.setViewName("404");
		}
	}
	
	/*
	 * 检查项目是否为有设置奖金申请
	 */
	public boolean isBonusProject(Project project){
			if(project.getFundtypeId()==1 || project.getFundtypeId()==2 || project.getFundtypeId()==7){
				return true;
			}else return false;
	}

	/*
	 * 根据基金类型和是否已审核来得到奖金申请表的总数
	 */
	public int getBonusAppsCountByIsVerified(int fundTypeId,byte verified,int bNoticeId) throws Exception{
		int totalCount = 0;
		
		if(fundTypeId==1){
			if(verified==1){
				totalCount = bonusService.getVerifiedScAppsCountByBNId(bNoticeId);
			}else{
				totalCount = bonusService.getUnverifiedScAppsCountByBNId(bNoticeId);
			}
		}else if(fundTypeId==2){
			if(verified==1){
				totalCount = bonusService.getVerifiedStAppsCountByBNId(bNoticeId);
			}else{
				totalCount = bonusService.getUnverifiedStAppsCountByBNId(bNoticeId);
			}
		}else if(fundTypeId==7){
			if(verified==1){
				
			}else{
				
			}
		}
		
		return totalCount;
	}
	
	/*
	 * 根据不同的基金类型审核奖金申请表，更新到数据库
	 */
	public int exmineBonusAppToDb(int fundTypeId,int appId,byte isPassed){
		
		int resultCode = 0;
		
		if(fundTypeId==1){
			try {
				ScholarshipAppCustom scApp = new ScholarshipAppCustom();
				scApp.setScholarshipappId(appId);
				scApp.setIsPassed(isPassed);
				
				bonusService.updateScApp(scApp);
				resultCode = isPassed;
			} catch (Exception e) {
				
			}
		}else if(fundTypeId==2){
			try {
				StipendAppCustom stApp = new StipendAppCustom();
				stApp.setStipendappId(appId);
				stApp.setIsPassed(isPassed);
				bonusService.updateStApp(stApp);
				resultCode = isPassed;
			} catch (Exception e) {
				
			}
		}else if(fundTypeId==7){
			
		}
		
		return resultCode;
	}

}


