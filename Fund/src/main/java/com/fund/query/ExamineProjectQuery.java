package com.fund.query;

/**
 * @Description:项目拓展老师审核立项申请表所需参数
 * @author:JackBauer
 * @date:2015年8月28日 上午9:36:55
 */
public class ExamineProjectQuery {
	private Byte isPassed;//审核通过或者失败，值为2或3
	private String projectNum;//项目编号
	
	public String getProjectNum() {
		return projectNum;
	}
	public void setProjectNum(String projectNum) {
		this.projectNum = projectNum;
	}
	public Byte getIsPassed() {
		return isPassed;
	}
	public void setIsPassed(Byte isPassed) {
		this.isPassed = isPassed;
	}
}
