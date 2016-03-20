package com.fund.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fund.po.BonusnoticeCustom;
import com.fund.po.Project;
import com.fund.po.SubmittedBonusForm;
import com.fund.po.User;
import com.fund.query.ScholarshipQuery;
import com.fund.query.StipendappQuery;
import com.fund.service.BonusService;

/**
 * @author:gjh
 * @Description:学生controller
 * @date:2015年8月13日 上午9:54:16
 */
@Controller
@RequestMapping("/student")
public class StudentController {

	private Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private BonusService bonusService;
	
	//学生登录首页
	@RequestMapping("/index")
	public String toIndex_1()throws Exception
	{
		return "user/student/index";
	}
	@RequestMapping("/")
	public String toIndex_2()throws Exception
	{
		return "user/student/index";
	}
	//跳转到修改密码界面
	@RequestMapping("/changePwd")
	public String changePwd() throws Exception {
		return "user/sysAdmin/changePwd";
	}
	/**
	 * @Description: 跳转到申请功能的页面
	 * @author:gjh
	 * @Date:2015年8月20日上午11:22:16
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/applyFunction")
	public ModelAndView applyScholarshipFunction(HttpSession session)throws Exception
	{
		List<BonusnoticeCustom> bonusnoticeCustomsscholarshipList=bonusService.selectScholarshipCustom();
		List<BonusnoticeCustom> bonusnoticeCustomsstipendList=bonusService.selectStipendCustom();
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("scholarship", bonusnoticeCustomsscholarshipList);
		modelAndView.addObject("stipend", bonusnoticeCustomsstipendList);
		modelAndView.setViewName("user/student/applyFunction");
		return modelAndView;
	}
	
	/**
	 * @Description: 根据用户是否已经申请过该奖金跳转到相应页面
	 * @author:gjh
	 * @Date:2015年8月20日上午11:20:35
	 * @param projectId  项目编号
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/ApplicationForm")
	public ModelAndView scholarshipApplicationForm(Integer projectId,HttpSession session)throws Exception
	{
		Project project=bonusService.selectProject(projectId);
		User user=(User)session.getAttribute("user");
		ModelAndView modelAndView=new ModelAndView();
		if(project.getFundtypeId()==1){
			boolean bool=bonusService.judgeScholarship(projectId,user);
			if(bool){
				ScholarshipQuery scholarshipQuery=bonusService.selectScholarshipForm(project, user);
				modelAndView.setViewName("user/student/submittedScholarshipForm");
				modelAndView.addObject("scholarshipQuery", scholarshipQuery);
				return modelAndView;
			}else {
				modelAndView.addObject("project",project);
				modelAndView.setViewName("user/student/scholarshipApplicationForm");
				return modelAndView;
			}
		}else {
			boolean bool=bonusService.judgeStipend(projectId, user);
			if(bool){
				StipendappQuery stipendappQuery=bonusService.selectStipendForm(project, user);
				modelAndView.addObject("stipendappQuery", stipendappQuery);
				modelAndView.setViewName("user/student/submittedStipendForm");
				return modelAndView;
			}else {
				modelAndView.addObject("project", project);
				modelAndView.setViewName("user/student/stipendApplicationForm");
				return modelAndView;
			}
		}
		
	}

	/**
	 * @Description: 提交奖学金申请表信息，提交成功跳转到查看页面，提交失败跳转到申请页面
	 * @author:gjh
	 * @Date:2015年8月20日上午9:38:31
	 * @param scholarshipQuery  传入填写的申请表信息
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitScholarshipApplicationForm")
	public ModelAndView submitScholarshipApplicationForm(Integer projectId, ScholarshipQuery scholarshipQuery,HttpSession session)throws Exception
	{
		ModelAndView modelAndView=new ModelAndView();
		User user=(User)session.getAttribute("user");
		Project project=bonusService.selectProject(projectId);
		try{
			bonusService.insertScholarshipForm(scholarshipQuery,user,project);
		}catch(Exception e){
			logger.info("=================信息提交失败！================");
			logger.info(e.toString());
			List<BonusnoticeCustom> bonusnoticeCustomsList=bonusService.selectScholarshipCustom();
			modelAndView.addObject("bonusnoticeCustomsList", bonusnoticeCustomsList);
			modelAndView.setViewName("user/student/applyFunction");
			return modelAndView;
		}
		List<SubmittedBonusForm> submittedBonusFormsList=bonusService.selectScholarshipappCustom(user);
		modelAndView.addObject("submittedScholarshipFormsList", submittedBonusFormsList);
		modelAndView.setViewName("user/student/checkFunction");
		return modelAndView;
	}
	/**
	 * @Description: 跳转到查看奖助学金申请表的页面
	 * @author:gjh
	 * @Date:2015年8月20日上午11:21:46
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/checkFunction")
	public ModelAndView checkScholarshipFunction(HttpSession session)throws Exception
	{
		User user=(User)session.getAttribute("user");
		List<SubmittedBonusForm> submittedScholarshipFormsList=bonusService.selectScholarshipappCustom(user);
		List<SubmittedBonusForm> submittedStipendFormsList=bonusService.selectStipendappCustom(user);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("submittedScholarshipFormsList", submittedScholarshipFormsList);
		modelAndView.addObject("submittedStipendFormsList", submittedStipendFormsList);
		modelAndView.setViewName("user/student/checkFunction");
		return modelAndView;
	}
	/**
	 * @Description: 跳转到查看奖金申请表填写详情的页面
	 * @author:gjh
	 * @Date:2015年8月20日上午11:22:44
	 * @param projectId 项目编号
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/checkApplicationForm")
	public ModelAndView checkScholarshipApplicationForm(Integer projectId,HttpSession session)throws Exception
	{
		ModelAndView modelAndView=new ModelAndView();
		Project project=bonusService.selectProject(projectId);
		User user=(User)session.getAttribute("user");
		if(project.getFundtypeId()==1){
			ScholarshipQuery scholarshipQuery=bonusService.selectScholarshipForm(project, user);
			modelAndView.setViewName("user/student/submittedScholarshipForm");
			modelAndView.addObject("scholarshipQuery", scholarshipQuery);
			return modelAndView;
		}else {
			StipendappQuery stipendappQuery=bonusService.selectStipendForm(project, user);
			modelAndView.setViewName("user/student/submittedStipendForm");
			modelAndView.addObject("stipendappQuery", stipendappQuery);
			return modelAndView;
		}
		
	}
	/**
	 * @Description: 提交助学金申请表信息，提交成功跳转到查看页面，提交失败跳转到申请页面
	 * @author:gjh
	 * @Date:2015年8月21日下午9:36:33
	 * @param stipendappQuery
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitStipendApplicationForm")
	public ModelAndView submitStipendApplicationForm(Integer projectId, StipendappQuery stipendappQuery, HttpSession session)throws Exception
	{
		ModelAndView modelAndView=new ModelAndView();
		User user=(User)session.getAttribute("user");
		Project project=bonusService.selectProject(projectId);
		try{
			bonusService.insertStipendappForm(stipendappQuery, user, project);
		}catch(Exception e){
			logger.info("=================信息提交失败！================");
			logger.info(e.toString());
			List<BonusnoticeCustom> bonusnoticeCustomsList=bonusService.selectStipendCustom();
			modelAndView.addObject("bonusnoticeCustomsList", bonusnoticeCustomsList);
			modelAndView.setViewName("user/student/applyFunction");
			return modelAndView;
		}
		List<SubmittedBonusForm> submittedBonusFormsList=bonusService.selectStipendappCustom(user);
		modelAndView.addObject("submittedBonusFormsList", submittedBonusFormsList);
		modelAndView.setViewName("user/student/checkFunction");
		return modelAndView;
	}
}
