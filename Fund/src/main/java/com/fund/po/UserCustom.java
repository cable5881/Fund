package com.fund.po;

import java.util.List;

public class UserCustom extends User {
	private Position position;//身份
	private List<Message> messageList;//未读消息
	private Integer msgCount;//未读消息数量，不同于未读消息集合大小

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public List<Message> getMessageList() {
		return messageList;
	}

	public void setMessageList(List<Message> messageList) {
		this.messageList = messageList;
	}

	public Integer getMsgCount() {
		return msgCount;
	}

	public void setMsgCount(Integer msgCount) {
		this.msgCount = msgCount;
	}
	
}
