package com.fund.service;

import java.util.List;

import com.fund.po.Message;
import com.fund.utils.Page;

public interface MessageService {
	public List<Message> findMessagesByUid(Page page,Integer userid)throws Exception;
	public List<Message> findUnreadedMessagesByUid(Integer userid)throws Exception;
	public void deleteMessagesByMid(Integer[] messageIds)throws Exception;
	public void deleteOneMessageByMid(Integer messageId)throws Exception;
	public void updateMessageReadState(Message message)throws Exception;
	public void insertMessage(Message message) throws Exception;
	public int getUnreadMessagesCountByUid(Integer userId)throws Exception;
	public int getAllMessagesCountByUid(Integer userId)throws Exception;
	public Message findOneMessageByMid(Integer messageId)throws Exception;
}
