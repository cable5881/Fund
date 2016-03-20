package com.fund.controller;

import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.fund.controller.base.BaseController;
import com.fund.exception.ProjectException;
import com.fund.po.JsonResult;
import com.fund.po.User;
import com.fund.po.custom.ProjectCustom;
import com.fund.query.ExamineProjectQuery;
import com.fund.query.base.BaseQuery;
import com.fund.service.ProjectExpandService;
import com.fund.service.ProjectService;
import com.fund.utils.Const;
import com.fund.utils.Page;

/**
 * @Description:项目拓展老师业务
 * @author:JackBauer
 * @date:2015年8月28日 上午10:06:52
 */
@Controller
@RequestMapping("/proExpand")
public class ProExpandController extends BaseController{
	
	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private ProjectExpandService proExpandService;
	@Autowired
	private ProjectService projectService;
	
	//项目拓展老师
	@RequestMapping("/index")
	public String toIndex_1()throws Exception
	{
		return "user/proExpand/index";
	}
	@RequestMapping("/")
	public ModelAndView toIndex_2(HttpSession session)throws Exception
	{
		return allProjects(session,null);
	}
	//修改密码
	@RequestMapping("/changePwd")
	public String changePwd()throws Exception
	{
		return "user/proAdmin/changePwd";
	}
	
	/**
	 * @Description: 查找所有立项，审核的或者未审核的
	 * @author:JackBauer
	 * @Date:2015年10月19日下午7:20:48
	 */
	@RequestMapping("/allProjects")
	public ModelAndView allProjects(HttpSession session,BaseQuery params)throws Exception
	{
		int totalCount = 0;
		if(params.getVerified()==0){
			totalCount = proExpandService.getUnverifiedProjectsCount();
		}else{
			totalCount = proExpandService.getVerifiedProjectsCount();
		}
		
		Page page = new Page(totalCount, params.getPageNow());
		
		ModelAndView mv = new ModelAndView();
		if(params.getVerified()==0){
			mv.addObject("projectList", proExpandService.findUnverifiedProjects(page));
		}else{
			mv.addObject("projectList", proExpandService.findVerifiedProjects(page));
		}
		
		mv.addObject("page", page);
		mv.addObject("verified", params.getVerified());
		mv.setViewName("user/proExpand/allProjects");
		session.setAttribute("baseQuery", params);
		return mv;
	}
	
	//转发到立项申请表页面
	@RequestMapping("/toExamineProject")
	public ModelAndView toExamineProject(HttpSession session,Integer projectId)throws Exception{
		ModelAndView mv =  new ModelAndView();
		ProjectCustom project = projectService.findProjectByPid(projectId);
		if(project!=null){
			session.setAttribute("p", project);
			mv.setViewName("user/proExpand/projectApplicationForm");
		}else{
			mv.setViewName("404");
		}
		return mv;
	}
	
	/*
	 * 审核申请表,审核后转发到所有立项的页面
	 */
	@RequestMapping(value="/examineProject",method=RequestMethod.POST)
	@ResponseBody
	public JsonResult examineProject(HttpSession session,ExamineProjectQuery params)throws Exception{
		JsonResult jsonResult = new JsonResult();
		byte flag = params.getIsPassed();
		try {
			ProjectCustom p = (ProjectCustom) session.getAttribute("p");
			p.setIsPassed(flag);
			p.setProjectNum(params.getProjectNum());
			
			proExpandService.examineProject(p,Const.PATH_FILES);
			User user = (User)session.getAttribute(Const.SESSION_USER);
			if(flag==2){
				sendProjectMessage(p, Const.TEMPLATE_MSG_EXAMINEPROJECT_SUCCESS,user.getRealName());
			}else{
				sendProjectMessage(p, Const.TEMPLATE_MSG_EXAMINEPROJECT_FAIL,user.getRealName());
			}
			
			jsonResult.setResultCode(1);
			jsonResult.setData((BaseQuery)session.getAttribute("baseQuery"));
		} catch (Exception e) {
			jsonResult.setResultCode(0);
			if(!(e instanceof ProjectException)){
				logger.error("examineProject failed!", e);
			}
		}
		return jsonResult;
	}
	
	/*
	 * 转发到修改项目编号的页面
	 */
	@RequestMapping("/toModifyProjectNum")
	public ModelAndView toModifyProjectNum(Integer projectId)throws Exception{
		ModelAndView mv = new ModelAndView();
		ProjectCustom project = projectService.findProjectByPid(projectId);
		if(project!=null){
			mv.addObject("p", project);
			mv.setViewName("user/proExpand/modifyProjectNum");
		}else{
			mv.setViewName("404");
		}
		
		return mv;
	}
	
	/*
	 * 修改项目编号业务
	 */
	@RequestMapping(value = "/modifyProjectNum",method = RequestMethod.POST)
	@ResponseBody
	public JsonResult modifyProjectNum(HttpSession session,String projectNum,Integer projectId)throws Exception{
		JsonResult jsonResult = new JsonResult();
		try {
			ProjectCustom projectToUpdate = new ProjectCustom();
			projectToUpdate.setProjectId(projectId);
			projectToUpdate.setProjectNum(projectNum);
			proExpandService.updateProject(projectToUpdate);
			jsonResult.setResultCode(1);
			jsonResult.setData((BaseQuery)session.getAttribute("baseQuery"));
		} catch (Exception e) {
			jsonResult.setResultCode(0);
		}
			
		return jsonResult;
	}
	
}
