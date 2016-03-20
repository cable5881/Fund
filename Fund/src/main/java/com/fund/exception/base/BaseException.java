package com.fund.exception.base;

public class BaseException extends Exception{

	private static final long serialVersionUID = 759256853367109637L;
	
	private String message;
	
	public BaseException(){
		
	}
	
	public BaseException(String message){
		super(message);
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
