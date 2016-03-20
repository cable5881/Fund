package com.fund.service;

import javax.servlet.http.HttpSession;


public interface ValidCodeService {
	
	public void recordValidCode(String code ,HttpSession session);
	
	public boolean checkValidCode(HttpSession session, String authCode);


}
