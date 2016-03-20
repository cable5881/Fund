package com.fund.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.fund.controller.base.BaseController;
import com.fund.exception.ProtocolException;
import com.fund.mapper.CountsMapper;
import com.fund.po.JsonResult;
import com.fund.po.Message;
import com.fund.po.NewsUrlCustom;
import com.fund.po.Newsurl;
import com.fund.po.Protocol;
import com.fund.po.User;
import com.fund.po.custom.ProjectCustom;
import com.fund.query.ExamineNewsUrlQuery;
import com.fund.query.ExamineProtocolQuery;
import com.fund.query.base.BaseQuery;
import com.fund.service.MessageService;
import com.fund.service.ProjectAdminService;
import com.fund.service.ProjectService;
import com.fund.utils.Const;
import com.fund.utils.Page;

/**
 * @Description:项目管理老师
 * @author:JackBauer
 * @date:2015年10月26日 下午8:20:35
 */
@Controller
@RequestMapping("/proAdmin")
public class ProAdminController extends BaseController{
	
	@Autowired
	private ProjectService projectService;
	@Autowired
	private ProjectAdminService projectAdminService;
	@Autowired
	private CountsMapper countsMapper;
	@Autowired
	private ProjectAdminService proAdminService;
	@Autowired
	private MessageService messageService;
	
	@RequestMapping("/index")
	public ModelAndView toIndex_1(HttpSession session)throws Exception
	{
		return toExamineProtocol(session,new BaseQuery());
	}
	@RequestMapping("/")
	public ModelAndView toIndex_2(HttpSession session)throws Exception
	{
		return toExamineProtocol(session,new BaseQuery());
	}
	//修改密码
	@RequestMapping("/changePwd")
	public String changePwd()throws Exception
	{
		return "user/proAdmin/changePwd";
	}
	
	//跳转到审核捐赠协议界面
	@RequestMapping("/toExamineProtocol")
	public ModelAndView toExamineProtocol(HttpSession session,BaseQuery queryParams)throws Exception
	{
		int totalCount;
		if(queryParams.getVerified() == 0){
			totalCount =  countsMapper.selectUnverifiedProtocolCount();
		}else{
			totalCount =  countsMapper.selectVerifiedProtocolCount();
		}
		
		Page page = new Page(totalCount, queryParams.getPageNow());
		
		ModelAndView mv = new ModelAndView("user/proAdmin/protocol");
		
		List<ProjectCustom> projectList = null;
		if(queryParams.getVerified() == 0){
			mv.addObject("verified", 0);
			projectList = projectService.findUnverifiedProtocolProjects(page);
		}else{
			mv.addObject("verified", 1);
			projectList = projectService.findVerifiedProtocolProjects(page);
		}
	
		session.setAttribute("projectList", projectList);
		mv.addObject("page", page);
		return mv;
	}
	
	//审核捐赠协议
	@RequestMapping(value = "/examineProtocol" ,method = RequestMethod.POST)
	@ResponseBody
	public JsonResult examineProtocol(HttpSession session,ExamineProtocolQuery queryParams)throws Exception{
		//必须是等待审核中的捐赠协议才能审核，已经审核的不能再次审核.这里没有做处理
		JsonResult jsonResult = new JsonResult();
		byte flag = queryParams.getIsPassed();
		try {
			Protocol protocol = new Protocol();
			protocol.setIsPassed(flag);
			protocol.setProtocolId(queryParams.getProtocolId());
			projectAdminService.updateProtocal(protocol);
			
			ProjectCustom p = getProjectFromSession(session, queryParams.getProjectId());
			User user = (User)session.getAttribute(Const.SESSION_USER);
			if(flag==1){
				sendProjectMessage(p, Const.TEMPLATE_MSG_EXAMINEPROTOCOL_SUCCESS,user.getRealName());
			}else{
				sendProjectMessage(p, Const.TEMPLATE_MSG_EXAMINEPROTOCOL_FAIL,user.getRealName());
			}
			jsonResult.setResultCode(1);
		} catch (Exception e) {
			jsonResult.setResultCode(0);
			if(e instanceof ProtocolException){
				
			}
		}
		return jsonResult;
	}
	
	@RequestMapping("/allProjectsUrl")
	public ModelAndView allProjectsUrl(@RequestParam(value="pageNow",required=false)Integer pageNow,HttpSession session)throws Exception{	
		Page page = null;
		int totalCount = projectService.getAllProjectsCount();
		if (pageNow != null) {
			page = new Page(totalCount, pageNow);
		} else {
			page = new Page(totalCount, 1);
		}
		
		session.setAttribute("projectList", projectService.findAllProjects(page));
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("page", page);
		mv.setViewName("user/proAdmin/allProjectsUrl");
		return mv;
	}
	
	/**
	 * @Description: 跳转到一个立项对应的所有新闻链接页面
	 * @author:JackBauer
	 * @Date:2015年8月27日下午3:18:57
	 */
	@RequestMapping("/toExamineUrl")
	public ModelAndView toExamineUrl(ExamineNewsUrlQuery params)throws Exception{
		int totalCount;
		if(params.getVerified() == 0){
			totalCount = proAdminService.getUnverifiedNewsUrlsCountByPid(params.getProjectId());
		}else{
			totalCount = proAdminService.getVerifiedNewsUrlsCountByPid(params.getProjectId());
		}
		
		Page page = new Page(totalCount, params.getPageNow());
		
		ModelAndView mv = new ModelAndView("user/proAdmin/projectUrl");
		if(params.getVerified() == 0){
			mv.addObject("newsUrlList", proAdminService.findUnverifiedNewsUrlsByPid(page, params.getProjectId()));
		}else{
			mv.addObject("newsUrlList", proAdminService.findVerifiedNewsUrlsByPid(page, params.getProjectId()));
		}
		mv.addObject("page", page);
		mv.addObject("projectId", params.getProjectId());
		mv.addObject("verified",params.getVerified());
		return mv;
	}
	
	/**
	 * @Description: 审核新闻链接
	 * @author:JackBauer
	 * @Date:2015年9月18日下午11:00:15
	 */
	@RequestMapping(value = "/examineNewsUrl",method = RequestMethod.POST)
	@ResponseBody
	public JsonResult exmineNewsUrl(Integer newsUrlId,Byte isPassed,HttpSession session)throws Exception{
		JsonResult jsonResult = new JsonResult();
		try {
			Newsurl newsUrl = new Newsurl();
			newsUrl.setNewsurlId(newsUrlId);
			newsUrl.setIsPassed(isPassed);
			projectAdminService.updateNewsUrl(newsUrl);
			
			NewsUrlCustom newsurl = proAdminService.findNewsUrlByNid(newsUrlId);
			ProjectCustom p = getProjectFromSession(session, newsurl.getProjectId());
			User user = (User)session.getAttribute(Const.SESSION_USER);
			
			Message msg = null;
			if(isPassed==1){
				msg = msgUtil.getNewsUrlMessage(p.getUserId(),Const.TEMPLATE_MSG_EXAMINENEWSURL_SUCCESS,newsurl, user.getRealName());
			}else{
				msg = msgUtil.getNewsUrlMessage(p.getUserId(),Const.TEMPLATE_MSG_EXAMINENEWSURL_FAIL,newsurl, user.getRealName());
			}
			messageService.insertMessage(msg);
			jsonResult.setResultCode(1);
		} catch (Exception e) {
			jsonResult.setResultCode(0);
		}
		
		return jsonResult;
	}
	
	public ProjectCustom getProjectFromSession(HttpSession session,Integer projectId){
		@SuppressWarnings("unchecked")
		List<ProjectCustom> projectList = (List<ProjectCustom>) session.getAttribute("projectList");
		for(ProjectCustom p : projectList){
			if(p.getProjectId()==projectId){
				return p;
			}
		}
		return null;
	}
	
}
