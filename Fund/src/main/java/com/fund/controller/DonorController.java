package com.fund.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.fund.po.Bonusnotice;
import com.fund.po.ScholarshipAppCustom;
import com.fund.po.StipendAppCustom;
import com.fund.po.User;
import com.fund.po.custom.ProjectCustom;
import com.fund.service.BonusService;
import com.fund.service.FinanceService;
import com.fund.service.ProjectAdminService;
import com.fund.service.ProjectService;
import com.fund.utils.Const;
import com.fund.utils.Page;

/**
 * @author:gjh
 * @Description:捐赠方controller
 * @date:2015年8月13日 上午9:54:16
 */
@Controller
@RequestMapping("/donor")
public class DonorController {

	@Autowired
	private ProjectService projectService;
	@Autowired
	private ProjectAdminService proAdminService;
	@Autowired
	private BonusService bonusService;
	@Autowired
	private FinanceService financeService;
	
	@RequestMapping("/index")
	public String toIndex_1()throws Exception
	{
		return "user/donor/index";
	}
	
	@RequestMapping("/")
	public String toIndex_2()throws Exception
	{
		return "user/donor/index";
	}
	
	//修改密码
	@RequestMapping("/changePwd")
	public String changepsw()throws Exception
	{
		return "user/donor/changePwd";
	}
	
	/**
	 * @Description: 查找所有立项
	 * @author:JackBauer
	 * @Date:2015年10月30日下午4:37:27
	 */
	@RequestMapping("/allProjects")
	public ModelAndView allProjects(HttpSession session,@RequestParam(value="pageNow",required=false) Integer pageNow)throws Exception
	{
		User user = (User)session.getAttribute(Const.SESSION_USER);
		Page page = null;
		int totalCount = projectService.getDonorProjectsByDId(user.getUserId());
		if (pageNow != null) {
			page = new Page(totalCount, pageNow);
		} else {
			page = new Page(totalCount, 1);
		}
		List<ProjectCustom> projectList = projectService.findDonorProjectsByDId(user.getUserId(), page);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("projectList", projectList);
		mv.addObject("page", page);
		mv.setViewName("user/donor/allProjects");
		return mv;
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
				mv.setViewName("user/donor/bonusProjectInfo");
			}else{
				mv.setViewName("user/donor/fundProjectInfo");
			}
			
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
	public ModelAndView projectApplicationForm(HttpSession session,Integer projectId)throws Exception
	{
		ProjectCustom p = projectService.findProjectByPid(projectId);
		ModelAndView mv = new ModelAndView();
		if(p!=null){
			session.setAttribute("p", p);
			mv.setViewName("user/donor/projectApplicationForm");
		}else{
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
			mv.setViewName("user/donor/fundInDetails");
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
			mv.setViewName("user/donor/fundOutDetails");
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
			mv.setViewName("user/donor/newsLink");
		}else{
			mv.setViewName("404");
		}
		return mv;
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
		if(p!=null && p.getBonusNotice()!=null){
			int totalCount = 0;
			
			if(p.getFundtypeId()==1){
				totalCount = projectService.getScAppsCountByBNId(p.getBonusNotice().getBonusnoticeId());
			}else if(p.getFundtypeId()==2){
				totalCount = projectService.getStAppsCountByBNId(p.getBonusNotice().getBonusnoticeId());
			}else if(p.getFundtypeId()==7){
				
			}
			
			Page page = null;
			if (pageNow != null) {
				page = new Page(totalCount, pageNow);
			} else {
				page = new Page(totalCount, 1);
			}

			addBonusAppsToModel(mv, p, page);
			mv.addObject("page", page);
			mv.setViewName("user/donor/bonusApps");
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
			addBonusAppToModel(mv, p, appId);
		}else{
			mv.setViewName("404");
		}
		
		return mv;
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
	public void addBonusAppToModel(ModelAndView mv,ProjectCustom p,Integer appId)throws Exception{
		boolean flag = false;//用于判断申请表是否找到，未找到将视图设置为404
		
		if(p.getFundtypeId()==1)//奖学金
		{
			ScholarshipAppCustom app = bonusService.findScAppByAppId(appId);
			if(app!=null){
				flag = true;
				mv.addObject("app", app);
				mv.setViewName("user/donor/scApp");
			}
		}
		else if(p.getFundtypeId()==2)//助学金
		{
			StipendAppCustom app = bonusService.findStAppByAppId(appId);
			if(app!=null){
				flag = true;
				mv.addObject("app", app);
				mv.setViewName("user/donor/stApp");
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
