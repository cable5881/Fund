package com.fund.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.fund.po.User;
import com.fund.service.UserService;

/**
 * @author:gjh
 * @Description:项目管理拦截器
 * @date:2015年8月13日 上午9:54:16
 */
public class ProAdminInterceptor implements HandlerInterceptor {

	private final Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private UserService userService;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String url = request.getRequestURI();
		logger.info("ProAdmininterceptor excute order:1.preHandle================");  
        logger.info("request url:" + url);
		HttpSession session  = request.getSession();//判断session
		User user = (User) session.getAttribute("user");//从session中取出用户身份信息
		int id=3;//项目管理老师的positionId为3
		boolean bool=userService.checkSession(user,id, response);//判断用户信息
		return bool;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("ProAdmininterceptor excute order:2.preHandle================");
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.info("ProAdmininterceptor excute order:3.preHandle================");
		
	}

}
