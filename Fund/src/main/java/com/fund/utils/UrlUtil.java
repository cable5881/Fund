package com.fund.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * 
 * @Description:用于获取各种路径
 * @author:JackBauer
 * @date:2015年8月21日 下午11:20:08
 */
public class UrlUtil {
	
	//public static final String fileRootPath = "/files/";
	
	//生成如“项目绝对路径/WEB-INF/temp/2015/8”的路径
	public static String getFileDir(String filePathPrefix){
		Calendar calendar = Calendar.getInstance();
		String year = calendar.get(Calendar.YEAR) + "";
		String month = calendar.get(Calendar.MONTH) + 1 + "";
		return filePathPrefix + "/" + year + "/" + month;
	}
	
	//生成如“20150821fdsfsd8fsdf78shsjdhr(日期加32位uuid)”的文件名，不加后缀
	public static String getNewFileName(){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		return formatter.format(new Date()) + uuid;
	} 
	
	/**
	 * @Description: 去掉文件名前缀得到真实文件名
	 * @author:JackBauer
	 * @Date:2015年10月29日下午5:50:17
	 */
	public static String getFileNameOld(String fileName) {
		return fileName.substring(fileName.indexOf("_") + 1);
	}
}
