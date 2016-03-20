package com.fund.po;

import java.util.List;

public class MoneyCheckCustom extends Moneycheck {
	private List<Inbill> inBillList;
	private List<Outbill> outBillList;
	
	public List<Inbill> getInBillList() {
		return inBillList;
	}
	public void setInBillList(List<Inbill> inBillList) {
		this.inBillList = inBillList;
	}
	public List<Outbill> getOutBillList() {
		return outBillList;
	}
	public void setOutBillList(List<Outbill> outBillList) {
		this.outBillList = outBillList;
	}
	
}
