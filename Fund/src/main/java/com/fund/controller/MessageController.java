package com.fund.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.fund.po.JsonResult;
import com.fund.po.Message;
import com.fund.po.User;
import com.fund.po.UserCustom;
import com.fund.service.MessageService;
import com.fund.utils.Page;

@Controller
@RequestMapping("/message")
public class MessageController {
	
	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private MessageService messageService;
	
	/*
	 * 转发到消息列表
	 */
	@RequestMapping("/messagesPage")
	public ModelAndView toMessagesPage(HttpSession session,@RequestParam(value="pageNow",required=false) Integer pageNow)throws Exception{
		ModelAndView mv = new ModelAndView();
		try {
			Page page = null;
			User user = (User)session.getAttribute("user");
			int totalCount = messageService.getAllMessagesCountByUid(user.getUserId());
			if (pageNow != null) {
				page = new Page(totalCount, pageNow);
			} else {
				page = new Page(totalCount, 1);
			}
			
			List<Message> messageList = messageService.findMessagesByUid(page, user.getUserId());

			mv.addObject("page", page);
			mv.addObject("messageList", messageList);
			mv.setViewName(forwardMessagesPage(user));
		} catch (Exception e) {
			logger.error("toMessagesPage failed!", e);
			mv.setViewName("500");
		}
		return mv;
	
	}
	
	/*
	 * 转发到单条消息的详细列表
	 */
	@RequestMapping("/oneMessagePage")
	public ModelAndView toOneMessagePage(HttpSession session,Integer messageId)throws Exception{
		ModelAndView mv = new ModelAndView();
		try {
			User user = (User)session.getAttribute("user");
			Message message = messageService.findOneMessageByMid(messageId);
			if(message!=null && message.getUserId()==user.getUserId()){
				if(message.getIsReaded()==0)//若消息未读更新未已读
					messageService.updateMessageReadState(message);
				mv.addObject("msg", message);
				mv.setViewName(forwardOneMessagePage(user));
			}else{
				mv.setViewName("404");
			}
		} catch (Exception e) {
			logger.error("toOneMessagePage failed!", e);
			mv.setViewName("500");
		}
		return mv;
	}
	
	@RequestMapping("/unreadMessagePage")
	public ModelAndView unreadMessagePage(HttpSession session,Integer messageId)throws Exception{
		ModelAndView mv = new ModelAndView();
		UserCustom user = (UserCustom)session.getAttribute("user");
		Message message = messageService.findOneMessageByMid(messageId);
		if(message!=null && user.getUserId()==message.getUserId()){
			if(message.getIsReaded()==0)//若消息未读更新未已读
				messageService.updateMessageReadState(message);
			mv.addObject("msg", message);
			mv.setViewName(forwardOneMessagePage(user));
			
			user.setMessageList(messageService.findUnreadedMessagesByUid(user.getUserId()));
			user.setMsgCount(messageService.getUnreadMessagesCountByUid(user.getUserId()));
		}else{
			mv.setViewName("404");
		}
		return mv;
	}
	
	/*
	 * 删除多条信息
	 */
	@RequestMapping(value = "deleteMessages",method = RequestMethod.POST)
	@ResponseBody
	public JsonResult deleteMessages(Integer[] messageId)throws Exception{
		JsonResult jsonResult = new JsonResult();
		try {
			messageService.deleteMessagesByMid(messageId);
			jsonResult.setResultCode(1);
		} catch (Exception e) {
			jsonResult.setResultCode(0);
			jsonResult.setResultMessage("删除消息失败！");
		}
		return jsonResult;
	}
	
	/*
	 * 删除单条信息
	 */
	@RequestMapping(value = "deleteOneMessage",method = RequestMethod.POST)
	@ResponseBody
	public JsonResult deleteOneMessage(Integer messageId)throws Exception{
		JsonResult jsonResult = new JsonResult();
		try {
			messageService.deleteOneMessageByMid(messageId);
			jsonResult.setResultCode(1);
		} catch (Exception e) {
			jsonResult.setResultCode(0);
			jsonResult.setResultMessage("删除消息失败！");
		}
		return jsonResult;
	}
	
	/*
	 * 通过判断用户身份返回用户的消息列表地址
	 */
	public String forwardMessagesPage(User user)throws Exception{
		if(user.getPositionId()==2){
			return "user/proExpand/message";
		}else if(user.getPositionId()==3){
			return "user/proAdmin/message";
		}else if(user.getPositionId()==4){
			return "user/fundAdmin/message";
		}else if(user.getPositionId()==5){
			return "user/benificiary/message";
		}else if(user.getPositionId()==6){
			return "user/foundation/message";
		}else if(user.getPositionId()==7){
			return "user/donor/message";
		}
		return "404";
	}
	
	/*
	 * 通过判断用户身份返回用户的单条消息地址
	 */
	public String forwardOneMessagePage(User user)throws Exception{
		if(user.getPositionId()==2){
			return "user/proExpand/messageDetail";
		}else if(user.getPositionId()==3){
			return "user/proAdmin/messageDetail";
		}else if(user.getPositionId()==4){
			return "user/fundAdmin/messageDetail";
		}else if(user.getPositionId()==5){
			return "user/benificiary/messageDetail";
		}else if(user.getPositionId()==6){
			return "user/foundation/messageDetail";
		}else if(user.getPositionId()==7){
			return "user/donor/messageDetail";
		}
		return "404";
	}
	
}
