package com.fund.query;

/**
 * @Description:删除到款记录post提交所需参数
 * @author:JackBauer
 * @date:2015年11月1日 上午8:46:38
 */
public class DeleteInbillQuery {
	private Integer inbillId;
	private Double moneyIn;
	private Integer mCheckId;
	public Integer getInbillId() {
		return inbillId;
	}
	public void setInbillId(Integer inbillId) {
		this.inbillId = inbillId;
	}
	public Double getMoneyIn() {
		return moneyIn;
	}
	public void setMoneyIn(Double moneyIn) {
		this.moneyIn = moneyIn;
	}
	public Integer getmCheckId() {
		return mCheckId;
	}
	public void setmCheckId(Integer mCheckId) {
		this.mCheckId = mCheckId;
	}
	
}
