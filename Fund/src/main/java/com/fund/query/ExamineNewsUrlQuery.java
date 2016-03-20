package com.fund.query;

import com.fund.query.base.BaseQuery;

/**
 * @Description:审核新闻链接所需参数
 * @author:JackBauer
 * @date:2015年9月18日 下午9:01:28
 */

public class ExamineNewsUrlQuery extends BaseQuery{
	private Integer projectId;//立项id
	
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
}
