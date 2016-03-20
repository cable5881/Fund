package com.fund.controller.base;

import org.springframework.beans.factory.annotation.Autowired;
import com.fund.po.Message;
import com.fund.po.Project;
import com.fund.service.MessageService;
import com.fund.utils.MsgUtils;

public class BaseController {
	
	protected static  MsgUtils msgUtil;
	
	static{
		msgUtil = new MsgUtils();
	}
	
	@Autowired
	private MessageService messageService;
	
	public void sendProjectMessage(Project p,String template,String sender)throws Exception{
		Message msg = msgUtil.getProjectMessage(p.getUserId(), template, p,sender);
		messageService.insertMessage(msg);
	}
	
}
