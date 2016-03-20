package com.fund.exception.resolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import com.fund.exception.base.BaseException;

public class GlobalExceptionResolver implements HandlerExceptionResolver {

	private Logger logger = Logger.getLogger(getClass());
	
	@Override
	public ModelAndView resolveException(HttpServletRequest arg0,
			HttpServletResponse arg1, Object handler, Exception ex) {
		
		ModelAndView mv = new  ModelAndView("error");
        logger.error(ex);  
    
        BaseException unknowdException = null;
        if(ex instanceof BaseException) {  
        	mv.addObject("ex", ex);
        }else { 
        	unknowdException = new BaseException("未知错误");
        	mv.addObject("ex", unknowdException);
        }  
        
        return mv;
	}
}
