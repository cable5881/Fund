package com.fund.po;

public class PasswordInfo {
	private String oldPwd;
	private String newPwd;
	private String reNewPwd;
	private String authCode;
	
	public String getOldPwd() {
		return oldPwd;
	}
	public void setOldPwd(String oldPwd) {
		 this.oldPwd = oldPwd == null ? null : oldPwd.trim();
	}
	public String getNewPwd() {
		return newPwd;
	}
	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd == null ? null : newPwd.trim();
	}
	public String getReNewPwd() {
		return reNewPwd;
	}
	public void setReNewPwd(String reNewPwd) {
		this.reNewPwd = reNewPwd == null ? null : reNewPwd.trim();
	}
	public String getAuthCode() {
		return authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	
	
	
}
