package com.fund.query.base;

/**
 * @Description:查询参数基类
 * @author:JackBauer
 * @date:2015年9月23日 上午10:49:42
 */
public class BaseQuery {
	
	protected Integer pageNow = 1;//当前页
	protected Byte verified = 0;//审核或未审核，1和0

	public Integer getPageNow() {
		return pageNow;
	}

	public void setPageNow(Integer pageNow) {
		this.pageNow = pageNow==null?1:pageNow;
	}
	
	public Byte getVerified() {
		return verified;
	}
	
	public void setVerified(Byte verified) {
		this.verified = ( verified == null || verified > 1 || verified < 0 )? 0:verified;
	}
}
