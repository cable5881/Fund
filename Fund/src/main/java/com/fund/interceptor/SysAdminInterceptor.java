package com.fund.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.fund.po.User;

/**
 * @author:gjh
 * @Description:系统管理拦截器
 * @date:2015年8月13日 上午9:54:16
 */
public class SysAdminInterceptor implements HandlerInterceptor {
	
	private final Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String url = request.getRequestURI();
		logger.info("SysAdmininterceptor excute order:1.preHandle================");  
        logger.info("request url:" + url);
		//判断session
		HttpSession session  = request.getSession();
		//从session中取出用户身份信息
		User user = (User) session.getAttribute("user");
		//判断身份
		if(user == null){			
			response.sendRedirect("/Fund/login"); 
			return false;
		}else {
			if(user.getPositionId()!=1){
				response.sendRedirect("/Fund/login");
				return false;
			}
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("SysAdmininterceptor excute order:2.preHandle================");
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.info("SysAdmininterceptor excute order:3.preHandle================");
		
	}

}
