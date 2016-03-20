package com.fund.query;


/**
 * @Description:请求审核捐赠协议action所需参数
 * @author:JackBauer
 * @date:2015年8月27日 上午11:13:35
 */
public class ExamineProtocolQuery{
	
	private Integer protocolId;//捐赠协议id
	private Byte isPassed;//审核失败或成功
	private Integer projectId;
	
	
	public Integer getProtocolId() {
		return protocolId;
	}
	public void setProtocolId(Integer protocolId) {
		this.protocolId = protocolId;
	}
	public Byte getIsPassed() {
		return isPassed;
	}
	public void setIsPassed(Byte isPassed) {
		this.isPassed = isPassed;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
}
