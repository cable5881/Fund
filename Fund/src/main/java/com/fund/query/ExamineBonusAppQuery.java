package com.fund.query;

import com.fund.query.base.BaseQuery;

/**
 * @Description:请求审核或查看奖金申请表
 * @author:JackBauer
 * @date:2015年10月17日 下午11:18:09
 */
public class ExamineBonusAppQuery extends BaseQuery {
	private Integer appId;//申请表id
	private Byte isPassed;//通过或否决申请表，1和2
	private Integer projectId;//立项id
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
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
