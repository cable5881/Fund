package com.fund.po;

import java.io.Serializable;
/**
 * 返回前台的json数据
 */
public class JsonResult implements Serializable{

	private static final long serialVersionUID = 4273005680206220420L;
	/**
	 * 返回结果码
	 * 0成功，非0失败
	 */
	private int resultCode = 0;
	/**
	 * 操作结果信息
	 */
	private String resultMessage = "";
	/**
	 * 分页信息
	 */
	private Object pageInfo;
	/**
	 * 返回的数据
	 */
	private Object data;
	
	
	public int getResultCode() {
		return resultCode;
	}
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMessage() {
		return resultMessage;
	}
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Object getPageInfo() {
		return pageInfo;
	}
	
}
