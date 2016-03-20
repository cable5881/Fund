package com.fund.controller.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 
 * @author:JackBauer
 * @Description:日期转换器，主要获取执行时间和生日
 * @date:2015年8月13日 上午11:07:21
 */
public class CustomDateConverter implements Converter<String, Date> {
	
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	@Override
	public Date convert(String date) {
		try {
			//转成直接返回
			return simpleDateFormat.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//如果参数绑定失败返回null
		return null;
	}

}
