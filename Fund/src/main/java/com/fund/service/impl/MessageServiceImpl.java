package com.fund.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fund.exception.MessageException;
import com.fund.mapper.MessageMapper;
import com.fund.po.Message;
import com.fund.po.MessageExample;
import com.fund.service.MessageService;
import com.fund.utils.Page;

@Service
public class MessageServiceImpl implements MessageService {

	private Logger logger = Logger.getLogger(getClass());	
	@Autowired
	private MessageMapper messageMapper;
	
	/**
	 * @Description: 查找用户消息
	 * @author:JackBauer
	 * @Date:2015年10月22日上午10:46:23
	 */
	@Override
	public List<Message> findMessagesByUid(Page page,Integer userid) throws Exception {
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("page", page);
			map.put("userId", userid);
			return  messageMapper.selectAllMsgByUid(map);
		} catch (Exception e) {
			logger.error("findMessagesByUid failed!", e);
			throw new MessageException("查找用户消息失败！");
		}
	}

	/**
	 * @Description: 批量删除用户消息
	 * @author:JackBauer
	 * @Date:2015年10月22日上午10:46:23
	 */
	@Override
	public void deleteMessagesByMid(Integer[] messageIds) throws Exception {
		try {
			for(Integer mid : messageIds){
				Message messageToDelete = new Message();
				messageToDelete.setMessageId(mid);
				messageToDelete.setState((byte) 0);
				messageMapper.updateByPrimaryKeySelective(messageToDelete);
			}
		} catch (Exception e) {
			logger.error("deleteOneMessage failed!", e);
			throw new MessageException("删除消息失败！");
		}
	}

	public void deleteOneMessageByMid(Integer messageId)throws Exception{
		try {
			Message message = new Message();
			message.setMessageId(messageId);
			message.setState((byte) 0);
			messageMapper.updateByPrimaryKeySelective(message);
		} catch (Exception e) {
			logger.error("deleteOneMessageByMid failed!", e);
			throw new MessageException("删除消息失败！");
		}
	}

	@Override
	public void updateMessageReadState(Message message) throws Exception {
		try {
			Message messageToUpdate = new Message();
			messageToUpdate.setMessageId(message.getMessageId());
			messageToUpdate.setIsReaded((byte) 1);
			messageMapper.updateByPrimaryKeySelective(messageToUpdate);
		} catch (Exception e) {
			logger.error("updateMessageReadState failed!", e);
			
		}
	}

	@Override
	public List<Message> findUnreadedMessagesByUid(Integer userid) throws Exception {
		try {
			return  messageMapper.selectUnreadMsgByUid(userid);
		} catch (Exception e) {
			logger.error("findUnreadedMessagesByUid failed!", e);
			return null;
		}
	}

	/**
	 * @Description: 根据用户id查找所有其未读的消息
	 * @author:JackBauer
	 * @Date:2015年9月19日下午12:51:51
	 */
	@Override
	public int getUnreadMessagesCountByUid(Integer userId) throws Exception {
		try {
			MessageExample example = new MessageExample();
			MessageExample.Criteria criteria = example.createCriteria();
			criteria.andUserIdEqualTo(userId);
			criteria.andIsReadedEqualTo((byte) 0);
			criteria.andStateEqualTo((byte) 1);
			return messageMapper.countByExample(example);
		} catch (Exception e) {
			logger.error("getUnreadMessagesCountByUid failed!", e);
			return 0;
		}
	}

	/**
	 * 
	 * @Description: 根据用户id查找所有其已读的消息
	 * @author:JackBauer
	 * @Date:2015年9月19日下午12:51:51
	 */
	@Override
	public int getAllMessagesCountByUid(Integer userId) throws Exception {
		try {
			MessageExample example = new MessageExample();
			MessageExample.Criteria criteria = example.createCriteria();
			criteria.andUserIdEqualTo(userId);
			criteria.andStateEqualTo((byte) 1);
			return messageMapper.countByExample(example);
		} catch (Exception e) {
			logger.error("getAllMessagesCountByUid failed!", e);
			return 0;
		}
	}

	/**
	 * @Description: 根据消息id查找出一条消息
	 * @author:JackBauer
	 * @Date:2015年9月19日下午2:01:11
	 */
	@Override
	public Message findOneMessageByMid(Integer messageId) throws Exception {
		try {
			return messageMapper.selectByPrimaryKey(messageId);
		} catch (Exception e) {
			logger.error("findOneMessageByMid failed!", e);
			return null;
		}
	}

	/**
	 * @Description: 插入一条消息
	 * @author:JackBauer
	 * @Date:2015年10月26日下午5:23:27
	 */
	@Override
	public void insertMessage(Message message) throws Exception {
		try {
			messageMapper.insertSelective(message);
		} catch (Exception e) {
			logger.error("insertMessage failed!",e);
			throw new MessageException("插入一条消息失败！");
		}
	}

}
