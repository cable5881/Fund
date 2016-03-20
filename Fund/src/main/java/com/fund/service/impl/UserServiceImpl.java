package com.fund.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fund.exception.UserException;
import com.fund.mapper.UserMapper;
import com.fund.po.PasswordInfo;
import com.fund.po.User;
import com.fund.po.UserCustom;
import com.fund.po.UserExample;
import com.fund.po.UserPass;
import com.fund.service.UserService;
import com.fund.service.ValidCodeService;
import com.fund.utils.MD5Util;

@Service
public class UserServiceImpl implements UserService {
	
	private static Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private ValidCodeService validCodeService;


	@Override
	public UserCustom AdminLogin(UserPass userPass, HttpSession session) throws Exception {
		if(!validCodeService.checkValidCode(session,userPass.getAuthcode())){
			throw new UserException("验证码错误！");
		}
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andUsernameEqualTo(userPass.getUsername());
		criteria.andStateEqualTo((byte)1);
		List<User> userList =userMapper.selectByExample(userExample);
		if(userList.size()<1)
		{
			throw new UserException("用户不存在！");
		}
		if(userList.size()>1)
		{
			throw new UserException("数据库中存在多个相同用户名的用户！");
		}
		User existUser = userList.get(0);
		if(existUser.getState()==0){
			throw new UserException("您的身份已过期！");
		}
		if(!existUser.getPassword().
				equalsIgnoreCase(MD5Util.GetMD5Code(userPass.getPassword()))){
			throw new UserException("用户名或密码错误！");
		}
		logger.info("=====================用户登录成功=================");
		UserCustom user = new UserCustom();
		BeanUtils.copyProperties(user, existUser);
		session.setAttribute("user", user);
		return user;
	}


	@Override
	public boolean checkSession(User user,Integer id, HttpServletResponse response) throws Exception {
		if(user == null){			
			response.sendRedirect("/Fund/login"); 
			return false;
		}else {
			if(user.getPositionId()!=id){
				response.sendRedirect("/Fund/login");
				return false;
			}else {
				return true;
			}
		}
	}


	@Override
	public void modifyPwd(PasswordInfo pwdInfo,User user) throws Exception {
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andUserIdEqualTo(user.getUserId());
		User toUpdateUser = new User();
		toUpdateUser.setPassword(pwdInfo.getNewPwd());
		userMapper.updateByExampleSelective(toUpdateUser, userExample);
	}


}
	
