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
import com.fund.po.DonationModeCustom;
import com.fund.po.Inbill;
import com.fund.po.JsonResult;
import com.fund.po.MoneyCheckCustom;
import com.fund.po.Outbill;
import com.fund.po.User;
import com.fund.po.custom.ProjectCustom;
import com.fund.query.BillQuery;
import com.fund.query.DeleteInbillQuery;
import com.fund.query.DeleteOutbillQuery;
import com.fund.service.FinanceService;
import com.fund.service.ProjectService;
import com.fund.service.SearchService;
import com.fund.utils.Const;
import com.fund.utils.Page;

/**
 * @author:gjh
 * @Description:财务管理controller
 * @date:2015年8月13日 上午9:54:16
 */
@Controller
@RequestMapping("/fundAdmin")
public class FundAdminController extends BaseController{

	@Autowired
	private ProjectService projectService;
	@Autowired
	private FinanceService financeService;
	@Autowired
	private SearchService searchService;
	
	//财务管理老师
	@RequestMapping("/index")
	public String toIndex_1()throws Exception
	{
		return "user/fundAdmin/index";
	}
	@RequestMapping("/")
	public String toIndex_2()throws Exception
	{
		return "user/fundAdmin/index";
	}
	//修改密码
	@RequestMapping("/changePwd")
	public String changePwd()throws Exception
	{
		return "user/fundAdmin/changePwd";
	}
	//修改密码
	@RequestMapping("/toFundMana")
	public ModelAndView toFundMana(@RequestParam(value="pageNow",required=false)Integer pageNow,HttpSession session)throws Exception
	{
		ModelAndView mv = new ModelAndView();
		Page page = null;
		int totalCount = projectService.getPassedProjectsCount();
		if (pageNow != null) {
			page = new Page(totalCount, pageNow);
		} else {
			page = new Page(totalCount, 1);
		}
		
		session.setAttribute("projectList", financeService.findMoneyProjects(page));
		mv.addObject("page", page);
		mv.setViewName("user/fundAdmin/financeMana");
		return mv;
	}
	
	/**
	 * @Description: 查看资金详情
	 * @author:JackBauer
	 * @Date:2015年8月25日下午4:52:56
	 */
	@RequestMapping("/checkFundDetails")
	public ModelAndView checkFundDetails(Integer projectId,HttpSession session)throws Exception{
		ProjectCustom p = getProjectFromSession(session, projectId);
		ModelAndView mv = new ModelAndView();
		if(p!=null){
			mv.addObject("p", p);
			mv.setViewName("user/fundAdmin/financeDetails");
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
			mv.setViewName("user/fundAdmin/fundInDetails");
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
			mv.setViewName("user/fundAdmin/fundOutDetails");
		} catch (Exception e) {
			mv.setViewName("404");
		}
		return mv;
	}
	
	/**
	 * @Description: 增加账单（到款和发放）
	 * @author:JackBauer
	 * @Date:2015年8月25日下午4:54:38
	 */
	@RequestMapping(value = "/addBill",method = RequestMethod.POST)
	@ResponseBody
	public JsonResult addBill(BillQuery query,HttpSession session)throws Exception{
		JsonResult jsonResult = new JsonResult();
		ProjectCustom p = getProjectFromSession(session, query.getProjectId());
		MoneyCheckCustom mCheck = p.getMoneyCheck();
		DonationModeCustom dMode = p.getDonationMode();
		User user = (User)session.getAttribute(Const.SESSION_USER);
		
		int resultCode = updateMCheck(mCheck, query, dMode);
		
		if(resultCode==1){
			if (query.getMode()==1) {
				resultCode = addInBill(query, mCheck.getMoneycheckId());
				sendProjectMessage(p, Const.TEMPLATE_MSG_FINANCE_IN, user.getRealName());
			}else{
				resultCode = addOutBill(query, mCheck.getMoneycheckId());
				sendProjectMessage(p, Const.TEMPLATE_MSG_FINANCE_OUT, user.getRealName());
			}
		}else if(resultCode==2){
			jsonResult.setResultMessage("到款金额不足，无法发放！");
		}
		jsonResult.setResultCode(resultCode);
		return jsonResult;
	}
	
	/**
	 * @Description: 删除到款记录
	 * @author:JackBauer
	 * @Date:2015年11月1日上午8:34:48
	 */
	@RequestMapping("/deleteInbill")
	@ResponseBody
	public JsonResult deleteInbill(DeleteInbillQuery query)throws Exception{
		JsonResult jsonResult = new JsonResult();
		int resultCode = financeService.deleteInbill(query.getInbillId(),query.getmCheckId(),query.getMoneyIn());
		jsonResult.setResultCode(resultCode);
		if(resultCode==1){
			return jsonResult;
		}else if(resultCode==-1){
			jsonResult.setResultMessage("到款记录金额过大，请您先删除发放记录！");
		}else{
			jsonResult.setResultMessage("删除到款记录失败！");
		}
		
		return jsonResult;
	}
	
	/**
	 * @Description: 删除发放记录
	 * @author:JackBauer
	 * @Date:2015年11月1日上午8:34:48
	 */
	@RequestMapping("/deleteOutbill")
	@ResponseBody
	public JsonResult deleteOutbill(DeleteOutbillQuery query)throws Exception{
		JsonResult jsonResult = new JsonResult();
		int resultCode = financeService.deleteOutbill(query.getOutbillId(),query.getmCheckId(),query.getMoneyOut());
		if(resultCode==0){
			jsonResult.setResultMessage("删除发放记录失败！");
		}
		jsonResult.setResultCode(resultCode);
		return jsonResult;
	}
	
	/**
	 * @Description: 根据付款单位或财务项目编号查找到款单
	 * @author:JackBauer
	 * @Date:2015年10月30日下午1:23:37
	 */
	@RequestMapping("/searchInbill")
	public ModelAndView searchInbill(String key,@RequestParam(value="pageNow",required=false)Integer pageNow)throws Exception{
		ModelAndView mv = new ModelAndView();
		Page page = null;
		try {
			int totalCount = searchService.getInbillsCountBySerachKey(key);
			if (pageNow != null) {
				page = new Page(totalCount, pageNow, 20);
			} else {
				page = new Page(totalCount, 1, 20);
			}
			mv.addObject("inbillList", searchService.findInbillByPayerOrMoneyNum(key,page));
			mv.addObject("key", key);
			mv.addObject("page", page);
			mv.setViewName("user/fundAdmin/searchFinanceBill");
		} catch (Exception e) {
			mv.setViewName("404");
		}
		return mv;
	}
	
	public ProjectCustom getProjectFromSession(HttpSession session,int projectId)throws Exception{
		@SuppressWarnings("unchecked")
		List<ProjectCustom> list = (List<ProjectCustom>) session.getAttribute("projectList");
		for(ProjectCustom p:list){
			if(p.getProjectId()==projectId){
				return p;
			}
		}
		return null;
	}
	
	/**
	 * @Description: 更新账单
	 * @author:JackBauer
	 * @Date:2015年10月28日下午8:12:31
	 */
	public int updateMCheck(MoneyCheckCustom mCheck,BillQuery query,DonationModeCustom dMode)throws Exception{
		int flag = 0;
		double totalMoney = 0;
		if(dMode.getIsOnetime()==1){
			totalMoney = dMode.getAmount();
		}else{
			totalMoney = dMode.getAmount() * dMode.getSpan();
		}
		
		if(query.getMode()==1){
			mCheck.setMoneyInCount(query.getAmount() + mCheck.getMoneyInCount());
			if(mCheck.getMoneyInCount()<totalMoney){
				mCheck.setMoneystate((byte) 1);
			}else if(mCheck.getMoneyInCount()==totalMoney){
				mCheck.setMoneystate((byte) 2);
			}else if(mCheck.getMoneyInCount()>totalMoney){
				mCheck.setMoneystate((byte) 3);
			}else{
				mCheck.setMoneystate((byte) 4);
			}
			flag = 1;//满足条件，到款单成功更新
		}else{
			double outMoneySum = query.getAmount() + mCheck.getMoneyOutCount();
			if(outMoneySum>mCheck.getMoneyInCount()){
				return 2;//发放金额超过了到款金额，无法更新
			}
			mCheck.setMoneyOutCount(outMoneySum);
			flag = 1;//满足条件，到款单成功更新
		}
		try {
			financeService.updateMoneyCheck(mCheck);
		} catch (Exception e) {
			flag = 0;
		}
		return flag;
	}
	
	/**
	 * @Description: 向数据库中添加到款单
	 * @author:JackBauer
	 * @Date:2015年10月28日下午9:54:35
	 */
	public int addInBill(BillQuery query,Integer mCheckId)throws Exception{
		int flag = 0;
		try {
			Inbill inbill = new Inbill();
			inbill.setMoneycheckId(mCheckId);
			inbill.setMoneyIn(query.getAmount());
			inbill.setMoneyNum(query.getMoneyNum());
			inbill.setPayer(query.getPayer());
			inbill.setTimeIn(query.getDate());
			
			financeService.insertInBill(inbill);
			flag = 1;
		} catch (Exception e) {
			
		}
		return flag;
	}
	
	/**
	 * @Description: 向数据库中添加发放单
	 * @author:JackBauer
	 * @Date:2015年10月28日下午9:54:35
	 */
	public int addOutBill(BillQuery query,Integer mCheckId)throws Exception{
		int flag = 0;
		try {
			Outbill outbill = new Outbill();
			outbill.setMoneycheckId(mCheckId);
			outbill.setMoneyOut(query.getAmount());
			outbill.setTimeOut(query.getDate());
			financeService.insertOutBill(outbill);
			flag = 1;
		} catch (Exception e) {
		}
		return flag;
	}
}
