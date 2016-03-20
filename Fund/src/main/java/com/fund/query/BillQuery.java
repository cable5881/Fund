package com.fund.query;

import java.util.Date;

/**
 * @Description:财务管理添加账单所需参数
 * @author:JackBauer
 * @date:2015年10月28日 下午3:24:10
 */
public class BillQuery {
	private Date date;//日期
	private Double amount;//金额（发放或到款）
	private String moneyNum;//财务编号
	private String payer;//付款单位
	private Byte mode;//提交模式（发放或到款，1/0）
	private Integer projectId;//立项id
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getMoneyNum() {
		return moneyNum;
	}
	public void setMoneyNum(String moneyNum) {
		this.moneyNum = moneyNum;
	}
	public String getPayer() {
		return payer;
	}
	public void setPayer(String payer) {
		this.payer = payer;
	}
	public Byte getMode() {
		return mode;
	}
	public void setMode(Byte mode) {
		this.mode = mode;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	
}
