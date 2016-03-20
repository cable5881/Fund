package com.fund.query;

import java.util.List;

import com.fund.po.UserCustom;

public class UserQuery {

	private List<UserCustom> sysAdminList;
	private List<UserCustom> adminList;
	private List<UserCustom> visitorList;
	public List<UserCustom> getSysAdminList() {
		return sysAdminList;
	}
	public void setSysAdminList(List<UserCustom> sysAdminList) {
		this.sysAdminList = sysAdminList;
	}
	public List<UserCustom> getAdminList() {
		return adminList;
	}
	public void setAdminList(List<UserCustom> adminList) {
		this.adminList = adminList;
	}
	public List<UserCustom> getVisitorList() {
		return visitorList;
	}
	public void setVisitorList(List<UserCustom> visitorList) {
		this.visitorList = visitorList;
	}
	
}
