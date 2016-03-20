package com.fund.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fund.exception.UserException;
import com.fund.po.JsonResult;
import com.fund.po.PasswordInfo;
import com.fund.po.User;
import com.fund.po.UserCustom;
import com.fund.po.UserPass;
import com.fund.service.MessageService;
import com.fund.service.UserService;
import com.fund.service.ValidCodeService;
import com.fund.utils.MD5Util;

/**
 * @author:gjh
 * @Description:用户登录controller
 * @date:2015年8月13日 上午9:54:16
 */
@Controller
public class UserController{
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	@Autowired
	private ValidCodeService validCodeService;
	@Autowired
	private MessageService messageService;
	
	@RequestMapping("/login")
	public String toindex_2(HttpSession session)throws Exception{
		return userExist(session);
	}
	
	@RequestMapping("/index")
	public String toindex_3(HttpSession session)throws Exception
	{
		return userExist(session);
	}
	
	/**
	 * @Description: 登录检验
	 * @author:gjh
	 * @Date:2015年8月18日下午4:20:38
	 * @param userPass 传入的用户信息
	 */
	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	@ResponseBody
	public JsonResult loginCheck( @RequestBody UserPass userPass, HttpSession session)throws Exception{
		logger.info("sys admin login info:" + userPass.toString());
		boolean flag = false;
		String errorMessage = "用户登录失败";
		JsonResult jsonResult = new JsonResult();
		UserCustom user = null;//null？还是new一个user？
		try {
			 user = userService.AdminLogin(userPass, session);
			 user.setMessageList(messageService.findUnreadedMessagesByUid(user.getUserId()));
			 user.setMsgCount(messageService.getUnreadMessagesCountByUid(user.getUserId()));
			 flag = true;
		}catch (UserException serviceE){
			logger.error("sys admin login failed!", serviceE);
			errorMessage = serviceE.getMessage();
		}catch (Exception e) {
		logger.error("sys admin login failed! ", e);
		}
		jsonResult.setResultCode(flag ? 0 : 1);
		jsonResult.setResultMessage(flag ? "用户登录成功" : errorMessage);
		jsonResult.setData(user);
		return jsonResult;
	}
	
	/**
	 * @Description: 修改密码业务
	 * @author:JackBauer
	 * @Date:2015年8月15日下午9:02:03
	 */
	@RequestMapping(value="/modifyPwd",method = RequestMethod.POST)
	public @ResponseBody  JsonResult ModifyPwd(HttpSession session,PasswordInfo pwdInfo)throws Exception{
		JsonResult jsonResult = new JsonResult();
		if(!validCodeService.checkValidCode(session,pwdInfo.getAuthCode())){
			jsonResult.setResultCode(3);
			return jsonResult;
		}
		User user = (User)session.getAttribute("user");
		if(!pwdInfo.getNewPwd().equals(pwdInfo.getReNewPwd())){
			jsonResult.setResultCode(2);
			return jsonResult;
		}
		pwdInfo.setOldPwd(MD5Util.GetMD5Code(pwdInfo.getOldPwd()));
		if(!user.getPassword().equals(pwdInfo.getOldPwd())){
			jsonResult.setResultCode(0);
		}else{
			pwdInfo.setNewPwd(MD5Util.GetMD5Code(pwdInfo.getNewPwd()));
			userService.modifyPwd(pwdInfo, user);
			user.setPassword(pwdInfo.getNewPwd());
			session.setAttribute("user", user);
			jsonResult.setResultCode(1);
		}
		return jsonResult;
	}
	
	/**
	 * @Description: 注销业务
	 * @author:JackBauer
	 * @Date:2015年8月16日上午9:22:37
	 */
	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session)throws Exception{
		if(session!=null){
			session.invalidate();
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/login");
		return mv;
	}
	
	/**
	 * @Description: 检查用户是否未注销，若未注销返回首页地址，否则返回登录地址
	 * @author:JackBauer
	 * @Date:2015年8月18日上午9:12:05
	 */
	public String userExist(HttpSession session)throws Exception{
		User user = (User)session.getAttribute("user");
		if(user==null){
			return "login";
		}else{
			Integer positionId = user.getPositionId();
			switch(positionId){
				case 1:
					return "user/sysAdmin/index";
				case 2:
					return "user/proExpand/index";
				case 3:
					return "user/proAdmin/index";
				case 4:
					return "user/fundAdmin/index";
				case 5:
					return "user/benificiary/index";
				case 6:
					return "user/fund/index";
				case 7:
					return "user/donor/index";
				case 8:
					return "user/student/index";
				case 9:
					return "user/teacher/index";
				default:
					return "login";
			}
		}
	}
}
