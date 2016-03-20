package com.fund.query;

import com.fund.query.base.BaseQuery;

/**
 * 
 * @Description:系统管理员-访问所有账号所需参数
 * @author:JackBauer
 * @date:2015年9月21日 下午5:01:40
 */
public class AllUsersQuery extends BaseQuery{
	private Integer level = 1;
	private Integer userId;
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = ( level == null || level<1 || level>3 )?1:level;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
}
