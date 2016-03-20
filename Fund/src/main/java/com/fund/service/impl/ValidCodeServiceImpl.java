package com.fund.service.impl;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.fund.service.ValidCodeService;

@Service
public class ValidCodeServiceImpl implements ValidCodeService {

	@Override
	public void recordValidCode(String code, HttpSession session) {
		session.setAttribute("code",code);
		
	}

	@Override
	public boolean checkValidCode(HttpSession session, String authcode) {
		
		if(authcode.equals("")){
			return false;
		}
		if(!session.getAttribute("code").toString().equalsIgnoreCase(authcode)){
			return false;
		}
		return true;
	}
	


}
