package com.fund.query;

/**
 * @Description:删除到款记录post提交所需参数
 * @author:JackBauer
 * @date:2015年11月1日 上午8:46:38
 */
public class DeleteOutbillQuery {
	private Integer outbillId;
	private Double moneyOut;
	private Integer mCheckId;
	
	public Integer getOutbillId() {
		return outbillId;
	}
	public void setOutbillId(Integer outbillId) {
		this.outbillId = outbillId;
	}
	public Double getMoneyOut() {
		return moneyOut;
	}
	public void setMoneyOut(Double moneyOut) {
		this.moneyOut = moneyOut;
	}
	public Integer getmCheckId() {
		return mCheckId;
	}
	public void setmCheckId(Integer mCheckId) {
		this.mCheckId = mCheckId;
	}
	
}
