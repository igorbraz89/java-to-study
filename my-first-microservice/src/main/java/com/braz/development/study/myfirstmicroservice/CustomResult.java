package com.braz.development.study.myfirstmicroservice;

public class CustomResult {

	private String message;

	
	public CustomResult(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
