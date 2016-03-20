package com.fund.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fund.exception.ProjectException;
import com.fund.exception.UserException;
import com.fund.po.Bonusnotice;
import com.fund.po.Fundtype;
import com.fund.po.JsonResult;
import com.fund.po.Projecttype;
import com.fund.po.ScholarshipAppCustom;
import com.fund.po.StipendAppCustom;
import com.fund.po.User;
import com.fund.po.custom.ProjectCustom;
import com.fund.query.AllUsersQuery;
import com.fund.service.BonusService;
import com.fund.service.FinanceService;
import com.fund.service.ProjectAdminService;
import com.fund.service.ProjectService;
import com.fund.service.SystemAdminService;
import com.fund.utils.Page;

/**
 * @author:gjh
 * @Description:系统管理员controller
 * @date:2015年8月13日 上午9:54:16
 */
@Controller
@RequestMapping("/sysAdmin")
public class SysAdminController {
	
	@Autowired
	private SystemAdminService systemAdminService;
	@Autowired
	private ProjectService projectService;
	@Autowired
	private BonusService bonusService;
	@Autowired
	private ProjectAdminService proAdminService;
	@Autowired
	private FinanceService financeService;
	
	private Logger logger = Logger.getLogger(this.getClass());

	//系统管理员登录的首页
	@RequestMapping("/index")
	public String toIndex_1()throws Exception
	{
		return "user/sysAdmin/index";
	}
	@RequestMapping("/")
	public String toIndex_2()throws Exception
	{
		return "user/sysAdmin/index";
	}
	//修改密码页面
	@RequestMapping("/changePwd")
	public String changePwd()throws Exception
	{
		return "user/sysAdmin/changePwd";
	}
	/**
	 * @Description: 显示所有账号页面
	 * @author:gjh
	 * @Date:2015年8月25日下午1:58:29
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/allUsers")
	public ModelAndView allUsers(AllUsersQuery params)throws Exception
	{
		Page page = new Page(systemAdminService.getUserCountByLevel(params.getLevel()), params.getPageNow());
		ModelAndView modelAndView=new ModelAndView("user/sysAdmin/allUsers");
		modelAndView.addObject("userList", systemAdminService.findUsersByLevel(params.getLevel(), page));
		modelAndView.addObject("page",page);
		modelAndView.addObject("level", params.getLevel());
		return modelAndView;
	}
	/**
	 * @Description: 跳转到修改账号的页面
	 * @author:gjh
	 * @Date:2015年8月25日下午12:04:02
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toModifyUser")
	public ModelAndView toModifyUser(HttpSession session,Integer userId)throws Exception
	{
		ModelAndView mv = new ModelAndView();
		User user=systemAdminService.findUser(userId);
		if(user!=null){
			mv.addObject("oldUser", user);
			mv.setViewName("user/sysAdmin/modifyUser");
		}else{
			mv.setViewName("404");
		}
		
		return mv;
	}
	/**
	 * @Description: 修改账号页面点击提交后的操作
	 * @author:gjh
	 * @Date:2015年8月25日下午12:04:02
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/modifyUser",method = RequestMethod.POST)
	@ResponseBody
	public JsonResult modifyUser(@RequestBody User newUser)throws Exception
	{
		JsonResult jsonResult=new JsonResult();
		int resultCode = 0;
		try {
			resultCode = systemAdminService.updateUser(newUser);
			jsonResult.setResultCode(resultCode);
		} catch (UserException UserE) {
			jsonResult.setResultCode(0);
			jsonResult.setResultMessage(UserE.getMessage());
		} catch (Exception e){
			jsonResult.setResultCode(0);
			jsonResult.setResultMessage("未知错误!");
			logger.error("UnknownException ",e);
		}
		
		return jsonResult;
	}
	/**
	 * @Description: 跳转到创建账号页面
	 * @author:gjh
	 * @Date:2015年8月25日下午1:58:29
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toCreateUser")
	public String toCreateUser()throws Exception
	{
		return "user/sysAdmin/createUser";
	}
	
	/**
	 * @Description: 创建账号页面点击提交时的操作
	 * @author:gjh
	 * @Date:2015年8月25日下午1:58:29
	 */
	@RequestMapping(value = "/createUser",method = RequestMethod.POST)
	@ResponseBody
	public JsonResult createUser(@RequestBody User user)throws Exception
	{
		JsonResult jsonResult=new JsonResult();
		int resultCode = 0;
		resultCode = systemAdminService.insertUser(user);
		jsonResult.setResultCode(resultCode);
		return jsonResult;
	}
		
		
	/**
	 * @Description: 根据用户id删除用户
	 * @author:gjh
	 * @Date:2015年8月25日下午11:03:45
	 */
	@RequestMapping(value = "/deleteUser",method = RequestMethod.POST)
	public @ResponseBody JsonResult deleteUser(Integer userId)throws Exception
	{
		JsonResult jsonResult = new JsonResult();
		try {
			systemAdminService.deleteUser(userId);
			jsonResult.setResultCode(1);
		} catch (Exception e) {
			jsonResult.setResultCode(0);
			if(e instanceof UserException){
				jsonResult.setResultMessage(e.getMessage());
			}else{
				logger.error("UnknownException ",e);
				jsonResult.setResultMessage("未知错误：删除用户失败！");
			}
		}
		return jsonResult;
	}
	
	/**
	 * @Description: 跳转到立项管理页面
	 * @author:gjh
	 * @Date:2015年8月26日下午8:38:49
	 */
	@RequestMapping("/allProjects")
	public ModelAndView allProjects(@RequestParam(value="pageNow",required=false) Integer pageNow)throws Exception
	{
		Page page = null;
		int totalCount = projectService.getAllProjectsCount();
		if (pageNow != null) {
			page = new Page(totalCount, pageNow);
		} else {
			page = new Page(totalCount, 1);
		}
		List<ProjectCustom> projectList = projectService.findAllProjects(page);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("projectList", projectList);
		mv.addObject("page", page);
		mv.setViewName("user/sysAdmin/allProjects");
		return mv;
	}
	
	/**
	 * @Description: 关联捐赠方
	 * @author:JackBauer
	 * @Date:2015年10月30日下午12:40:52
	 */
	@RequestMapping(value = "/linkDonationUser",method = RequestMethod.POST)
	@ResponseBody
	public JsonResult linkDonationUser(Integer projectId,String donationUsername)throws Exception{
		JsonResult jsonResult = new JsonResult();
		
		int resultCode = systemAdminService.linkDonationUser(donationUsername, projectId);
		String resultMessage = null;
		if(resultCode==-1){
			resultMessage = "捐赠方用户不存在！";
		}else if(resultCode==0){
			resultMessage = "关联失败！";
		}
		
		jsonResult.setResultMessage(resultMessage);
		jsonResult.setResultCode(resultCode);
		return jsonResult;
	}
	
	/**
	 * @Description: 跳转到项目操作页面
	 * @author:gjh
	 * @Date:2015年8月26日下午8:38:49
	 */
	@RequestMapping("/projectOperate")
	public ModelAndView projectOperate()throws Exception
	{
		ModelAndView modelAndView=new ModelAndView();
		List<Projecttype> projecttypesList=systemAdminService.selectAllProjectType();
		modelAndView.addObject("projecttypesList", projecttypesList);
		modelAndView.setViewName("user/sysAdmin/projectOperate");
		return modelAndView;
	}
	
	/**
	 * @Description: 跳转到项目分类页面
	 * @author:gjh
	 * @Date:2015年8月26日下午8:38:49
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/projectType")
	public String projectType()throws Exception
	{
		return "user/sysAdmin/projectSort";
	}
	/**
	 * @Description: 点击创建项目类型后的操作
	 * @author:gjh
	 * @Date:2015年8月26日下午9:31:19
	 * @param projecttype
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/createProjectType",method = RequestMethod.POST)
	@ResponseBody
	public JsonResult createProjectType(@RequestBody Projecttype projecttype)throws Exception
	{
		JsonResult jsonResult=new JsonResult();
		try {
			systemAdminService.insertProjectType(projecttype);
			jsonResult.setResultCode(1);
		} catch (Exception e){
			jsonResult.setResultCode(0);
			jsonResult.setData(projecttype);//错误信息回显
			if(e instanceof ProjectException){
				jsonResult.setResultMessage(e.getMessage());
			}else{
				jsonResult.setResultMessage("创建项目类型失败！原因：未知错误!");
				logger.error("UnknownException ",e);
			}
		}
		return jsonResult;
	}
	@RequestMapping(value = "/createFundType",method = RequestMethod.POST)
	@ResponseBody
	public JsonResult createFundType(@RequestBody Fundtype fundtype)throws Exception
	{
		JsonResult jsonResult=new JsonResult();
		try {
			systemAdminService.insertFundType(fundtype);
			jsonResult.setResultCode(1);
		} catch (Exception e){
			jsonResult.setResultCode(0);
			jsonResult.setData(fundtype);//错误信息回显
			if(e instanceof ProjectException){
				jsonResult.setResultMessage(e.getMessage());
			}else{
				jsonResult.setResultMessage("创建基金类型失败！原因：未知错误!");
				logger.error("UnknownException ",e);
			}
		}
		return jsonResult;
	}
	
	/**
	 * 
	 * @Description: 删除基金类型
	 * @author:JackBauer
	 * @Date:2015年10月11日上午10:23:29
	 */
	@RequestMapping(value = "/deleteFundType",method = RequestMethod.POST)
	@ResponseBody
	public JsonResult deleteFundType(@RequestBody Fundtype fundtype)throws Exception
	{
		
		JsonResult jsonResult=new JsonResult();
		try {
			systemAdminService.deleteFundType(fundtype);
			jsonResult.setResultCode(1);
		} catch (Exception e){
			jsonResult.setResultCode(0);
			if(e instanceof ProjectException){
				jsonResult.setResultMessage(e.getMessage());
			}else{
				jsonResult.setResultMessage("删除基金类型失败！原因：未知错误!");
				logger.error("UnknownException ",e);
			}
		}
		return jsonResult;
	}
	
	/**
	 * @Description: 通过项目类型的id查找所有的基金类型
	 * @author:gjh
	 * @Date:2015年8月28日下午4:54:37
	 */
	@RequestMapping(value="/getFundTypes",method = RequestMethod.POST)
	public @ResponseBody List<Fundtype> getFundTypesByPTypeId(Integer projectTypeId)throws Exception
	{
		return projectService.findFundTypesByPid(projectTypeId);
	}
	
	/**
	 * @Description: 跳转到基金项目信息的页面
	 * @author:gjh
	 * @Date:2015年8月27日下午9:41:53
	 */
	@RequestMapping("/fundProjectInfo")
	public ModelAndView fundProjectInfo(HttpSession session,Integer projectId)throws Exception
	{
		ProjectCustom p = projectService.findProjectByPid(projectId);
		ModelAndView mv = new ModelAndView();
		if(p!=null && p.getIsPassed()==2)//只有审核通过的项目才能查看
		{
			session.setAttribute("p", p);
			mv.setViewName("user/sysAdmin/fundProjectInfo");
		}else{
			mv.setViewName("404");
		}
		return mv;
	}
	
	/**
	 * @Description: 跳转到奖助学金项目信息的页面
	 * @author:gjh
	 * @Date:2015年8月27日下午9:41:53
	 */
	@RequestMapping("/bonusProjectInfo")
	public ModelAndView bonusProjectInfo(HttpSession session,Integer projectId)throws Exception
	{
		ProjectCustom p = projectService.findProjectByPid(projectId);
		ModelAndView mv = new ModelAndView();
		if(p!=null && p.getIsPassed()==2)//只有审核通过的项目才能查看
		{
			session.setAttribute("p", p);
			mv.setViewName("user/sysAdmin/bonusProjectInfo");
		}else{
			mv.setViewName("404");
		}
		return mv;
	}
	
	/**
	 * @Description: 跳转到立项申请表的页面
	 * @author:gjh
	 * @Date:2015年8月27日下午9:43:13
	 */
	@RequestMapping("/projectApplicationForm")
	public ModelAndView projectApplicationForm(Integer projectId)throws Exception
	{
		ProjectCustom p = projectService.findProjectByPid(projectId);
		ModelAndView mv = new ModelAndView();
		if(p!=null){
			mv.setViewName("user/sysAdmin/projectApplicationForm");
		}else{
			mv.setViewName("404");
		}
		return mv;
	}
	
	/**
	 * @Description: 跳转到修改立项申请表的页面
	 * @author:gjh
	 * @Date:2015年8月29日上午9:18:27
	 */
	@RequestMapping(value = "/editProjectApplicationForm",method = RequestMethod.POST)
	public ModelAndView editProjectApplicationForm(HttpSession session)throws Exception
	{
		ProjectCustom project = (ProjectCustom) session.getAttribute("p");
		ModelAndView mv = new ModelAndView();
		if(project!=null){
			mv.setViewName("user/sysAdmin/editProject");
		}else{
			mv.setViewName("404");
		}
		return mv;
	}
	
	/**
	 * @Description: 更新提交的修改
	 * @author:gjh
	 * @Date:2015年8月29日上午9:21:07
	 */
	@RequestMapping(value = "/updateProject",method = RequestMethod.POST)
	public ModelAndView updateProject(HttpSession session,ProjectCustom newProject)throws Exception{
		//更新project需要从老立项获取信息
		ProjectCustom oldProject = (ProjectCustom) session.getAttribute("p");
		ModelAndView mv = new ModelAndView();
		if(oldProject!=null){
			newProject.setSetupTime(new Date());
			newProject.setIsPassed(oldProject.getIsPassed());
			String filePathPrefix = session.getServletContext().getRealPath("/");
			projectService.updateProject(newProject,oldProject,1,filePathPrefix);
			session.setAttribute("p",newProject);
			mv.setViewName("user/sysAdmin/projectApplicationForm");
		}else {
			mv.setViewName("404");
		}
		
		return mv;
	}
	
	/**
	 * @Description: 查看所有到账单
	 * @author:JackBauer
	 * @Date:2015年10月27日下午7:45:31
	 */
	@RequestMapping("/checkInBill")
	public ModelAndView checkInBill(Integer mCheckId,@RequestParam(value="pageNow",required=false)Integer pageNow)throws Exception{
		ModelAndView mv = new ModelAndView();
		Page page = null;
		try {
			int totalCount = financeService.getInbillsCountByMCheckId(mCheckId);
			if (pageNow != null) {
				page = new Page(totalCount, pageNow, 20);
			} else {
				page = new Page(totalCount, 1, 20);
			}
			mv.addObject("inbillList", financeService.findInbillsByMCheckId(mCheckId, page));
			mv.addObject("page", page);
			mv.addObject("mCheckId", mCheckId);
			mv.setViewName("user/sysAdmin/fundInDetails");
		} catch (Exception e) {
			mv.setViewName("404");
		}
		return mv;
	}
	
	/**
	 * @Description: 查看所有发放单
	 * @author:JackBauer
	 * @Date:2015年10月27日下午7:45:31
	 */
	@RequestMapping("/checkOutBill")
	public ModelAndView checkOutBill(Integer mCheckId,@RequestParam(value="pageNow",required=false)Integer pageNow) throws Exception{
		ModelAndView mv = new ModelAndView();
		Page page = null;
		try {
			int totalCount = financeService.getOutbillsCountByMCheckId(mCheckId);
			if (pageNow != null) {
				page = new Page(totalCount, pageNow, 20);
			} else {
				page = new Page(totalCount, 1, 20);
			}
			mv.addObject("outbillList", financeService.findOutbillsByMCheckId(mCheckId, page));
			mv.addObject("page", page);
			mv.addObject("mCheckId", mCheckId);
			mv.setViewName("user/sysAdmin/fundOutDetails");
		} catch (Exception e) {
			mv.setViewName("404");
		}
		return mv;
	}
	
	/**
	 * @Description: 跳转到相关新闻链接的页面
	 * @author:gjh
	 * @Date:2015年8月27日下午9:44:21
	 */
	@RequestMapping("/newsLink")
	public ModelAndView newsLink(HttpSession session,@RequestParam(value="pageNow",required = false) Integer pageNow)throws Exception
	{
		ProjectCustom p = (ProjectCustom) session.getAttribute("p");
		ModelAndView mv = new ModelAndView();
		if(p!=null){
			int totalCount = proAdminService.getVerifiedNewsUrlsCountByPid(p.getProjectId());
			
			Page page = null;
			if (pageNow != null) {
				page = new Page(totalCount, pageNow);
			} else {
				page = new Page(totalCount, 1);
			}

			mv.addObject("newsUrlList", proAdminService.findVerifiedNewsUrlsByPid(page, p.getProjectId()));
			mv.addObject("page", page);
			mv.setViewName("user/sysAdmin/newsLink");
		}else{
			mv.setViewName("404");
		}
		return mv;
	}
	
	@RequestMapping(value="/deleteNewsLink",method = RequestMethod.POST)
	@ResponseBody
	public JsonResult deleteNewsLink(Integer newsurlId)throws Exception
	{
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
	 * @Description: 跳转到该项目所有申请表的页面
	 * @author:gjh
	 * @Date:2015年8月28日下午11:48:24
	 */
	@RequestMapping("/allBonusAppForms")
	public ModelAndView allBonusAppForms(HttpSession session,Integer pageNow)throws Exception
	{
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
			mv.setViewName("user/sysAdmin/bonusApps");
		}else{
			mv.setViewName("404");
		}
		return mv;
	}
	
	/**
	 * @Description: 查看具体某张申请表
	 * @author:gjh
	 * @Date:2015年8月29日下午9:23:51
	 */
	@RequestMapping("/checkBonusAppForm")
	public ModelAndView checkBonusApp(HttpSession session,Integer appId)throws Exception{
		ProjectCustom p = (ProjectCustom)session.getAttribute("p");
		ModelAndView mv = new ModelAndView();
		if(p!=null){
			addBonusAppToModel(mv, p, appId,false);
		}else{
			mv.setViewName("404");
		}
		
		return mv;
	}
	
	
	/**
	 * @Description: 跳转到修改奖金申请表的页面
	 * @author:gjh
	 * @Date:2015年8月29日下午11:38:56
	 */
	@RequestMapping("/toModifyAppForm")
	public ModelAndView toModifyAppForm(HttpSession session,Integer appId)throws Exception
	{
		ProjectCustom p = (ProjectCustom)session.getAttribute("p");
		ModelAndView mv = new ModelAndView();
		if(p!=null){
			addBonusAppToModel(mv, p, appId, true);
		}else{
			mv.setViewName("404");
		}
		return mv;
	}
	
	/**
	 * 
	 * @Description: 提交修改后的助学金申请表
	 * @author:JackBauer
	 * @Date:2015年10月12日上午11:22:32
	 */
	@RequestMapping(value = "/updateStApp",method = RequestMethod.POST)
	public ModelAndView updateStApp(HttpSession session,StipendAppCustom stApp,Integer appId)throws Exception
	{
		ModelAndView modelAndView=new ModelAndView();
		stApp.setStipendappId(appId);
		systemAdminService.updateStApp(stApp);
		modelAndView.addObject("app", stApp);
		modelAndView.setViewName("user/sysAdmin/stApp");
		return modelAndView;
	}
	
	/**
	 * 
	 * @Description: 提交修改后的奖学金申请表
	 * @author:JackBauer
	 * @Date:2015年10月12日上午11:22:39
	 */
	@RequestMapping(value = "/updateScApp",method = RequestMethod.POST)
	public ModelAndView updateScApp(HttpSession session,ScholarshipAppCustom scApp)throws Exception
	{
		ModelAndView modelAndView = new ModelAndView();
		systemAdminService.updateScApp(scApp);
		modelAndView.addObject("app", scApp);
		modelAndView.setViewName("user/sysAdmin/scApp");
		return modelAndView;
	}
	
	/*
	 * 根据基金类型的不同向model中添加不同的奖金申请表集合
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
	 * 根据基金类型的不同向model中添加不同的奖金申请表
	 */
	public void addBonusAppToModel(ModelAndView mv,ProjectCustom p,Integer appId,boolean isToEdit)throws Exception{
		boolean flag = false;//用于判断申请表是否找到，未找到将视图设置为404
		
		if(p.getFundtypeId()==1)//奖学金
		{
			ScholarshipAppCustom app = bonusService.findScAppByAppId(appId);
			if(app!=null){
				flag = true;
				mv.addObject("app", app);
				if(!isToEdit)
					mv.setViewName("user/sysAdmin/scApp");
				else
					mv.setViewName("user/sysAdmin/modifyScApp");
			}
		}
		else if(p.getFundtypeId()==2)//助学金
		{
			StipendAppCustom app = bonusService.findStAppByAppId(appId);
			if(app!=null){
				flag = true;
				mv.addObject("app", app);
				if(!isToEdit)
					mv.setViewName("user/sysAdmin/stApp");
				else
					mv.setViewName("user/sysAdmin/modifyStApp");
			}
		}
		else if(p.getFundtypeId()==7)//奖教金
		{
			
		}
		
		if(!flag){
			mv.setViewName("404");
		}
	}
}
