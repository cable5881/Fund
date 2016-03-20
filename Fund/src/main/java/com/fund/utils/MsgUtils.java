package com.fund.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import com.fund.po.Message;
import com.fund.po.NewsUrlCustom;
import com.fund.po.Project;

/**
 * @Description:系统消息类，用于发送系统消息
 * @author:JackBauer
 * @date:2015年10月26日 下午6:43:52
 */
public class MsgUtils {
	private String templatePath = "/msgTemplates.properties";//消息模板
	
	public MsgUtils(){
		
	}
	
	public MsgUtils(String templatePath) {
		super();
		this.templatePath = templatePath;
	}

	public String getTemplatePath() {
		return templatePath;
	}

	public void setTemplatePath(String templatePath) {
		this.templatePath = templatePath;
	}
	
	public Properties GetProperty() throws Exception{
		InputStream in = this.getClass().getResourceAsStream(templatePath);
		BufferedReader bf = new BufferedReader(new InputStreamReader(in,"utf-8"));  
		Properties p = new Properties();
		p.load(bf);
		in.close();
		bf.close();
		return p;
	}
	
	public String getValue(String key,String... arguments) throws Exception{
		Properties p = GetProperty();
		String msg = p.getProperty(key);
		Object[] objs = (Object[])arguments;
		String m = MessageFormat.format(msg, objs);
		return m;
	}
	
	public String getTitle(String titleTemplate) throws Exception{
		return getValue(titleTemplate);
	}
	
	public String getTitle(String titleTemplate,String... arguments) throws Exception{
		return getValue(titleTemplate, arguments);
	}
	
	public String getProjectContent(Project project,String sender)throws Exception{
		return getValue("msg.content.project.info", project.getProjectName(),project.getProjectNum(),dateToStr(project.getSetupTime(), "yyyy-MM-dd"),project.getLeader(),sender);
	}
	
	public String getNewsUrlContent(NewsUrlCustom newsurl,String sender)throws Exception{
		return getValue("msg.content.newsurl.info", newsurl.getLaunchUrl(),newsurl.getNewsType().getTypeName(),dateToStr(newsurl.getUploadTime(), "yyyy-MM-dd"),sender);
	}
	
	public String getContent(String contentTemplate,String... arguments) throws Exception{
		return getValue(contentTemplate,arguments); 
	}
	
	public String dateToStr(Date date,String pattern) {
	    SimpleDateFormat formatter = null;
		try {
			if (date == null || date.equals(""))
				 return "";
			   formatter = new SimpleDateFormat(pattern);
			   return formatter.format(date);
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		} 
    } 
	
	public Message getProjectMessage(Integer userId,String msgTemplate,Project project,String sender){
		Message msg = null;
		try {
			msg = new Message();
			msg.setUserId(userId);
			msg.setMsgTitle( getTitle(msgTemplate) );
			msg.setMsgContent( getProjectContent(project,sender) );
			msg.setReceivedTime(new Date());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	
	public Message getNewsUrlMessage(Integer userId,String msgTemplate,NewsUrlCustom newsurl,String sender){
		Message msg = null;
		try {
			msg = new Message();
			msg.setUserId(userId);
			msg.setMsgTitle( getTitle(msgTemplate) );
			msg.setMsgContent( getNewsUrlContent(newsurl, sender));
			msg.setReceivedTime(new Date());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	
	public static void main(String[] args){
		MsgUtils msgUtils = new MsgUtils();
		Integer userId = 2;
		String msgTemplate = "msg.title.projectForm.examine.success";
		Project project = new Project();
		project.setProjectName("周杰伦基金");
		project.setProjectNum("123456");
		project.setSetupTime(new Date());
		project.setLeader("李奇波");
		try {
			Message msg = msgUtils.getProjectMessage(userId, msgTemplate, project, "xxx");
			System.out.println(msg.getMsgContent());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
