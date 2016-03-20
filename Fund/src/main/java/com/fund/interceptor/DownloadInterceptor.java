package com.fund.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import com.fund.po.User;
import com.fund.utils.Const;

public class DownloadInterceptor implements HandlerInterceptor {

	private final Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String url = request.getRequestURI();
		logger.info("DownloadInterceptor excute order:1.preHandle================");  
        logger.info("request url:" + url);
		HttpSession session  = request.getSession();
		User user = (User) session.getAttribute("user");
		
		if(user!=null){
			int positionId = user.getPositionId();
			switch (positionId) 
			{
				case Const.POSITION_ID_SYSADMIN://系统管理员
				case Const.POSITION_ID_BENEFICIARY://受益方
					return true;
				default:
					break;
			}
		}
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("DownloadInterceptor excute order:2.preHandle================");

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.info("DownloadInterceptor excute order:3.preHandle================");

	}

}
