package com.fund.service;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fund.po.PasswordInfo;
import com.fund.po.User;
import com.fund.po.UserCustom;
import com.fund.po.UserPass;

public interface UserService {
	

	//登录信息判断
	public UserCustom AdminLogin(UserPass userPass, HttpSession session) throws Exception;
	
	//判断session
	public boolean checkSession(User user,Integer id,HttpServletResponse response) throws Exception;
	
	public void modifyPwd(PasswordInfo pwdInfo,User user)throws Exception;
}
