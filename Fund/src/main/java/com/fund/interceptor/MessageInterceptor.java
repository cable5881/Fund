package com.fund.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import com.fund.po.User;

public class MessageInterceptor implements HandlerInterceptor {

	private final Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String url = request.getRequestURI();
		logger.info("FileInterceptor excute order:1.preHandle================");  
        logger.info("request url:" + url);
		HttpSession session  = request.getSession();
		User user = (User) session.getAttribute("user");
		if(user==null){
			response.sendRedirect("/Fund/login");
			return false;
		}else{
			return true;
		} 
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("FileInterceptor excute order:2.preHandle================");

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.info("FileInterceptor excute order:3.preHandle================");

	}

}
