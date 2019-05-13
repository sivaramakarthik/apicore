package com.api.reward.model;

import java.io.Serializable;

public class APIResponse implements Serializable {
	
	private String message;
	private Integer statusCode;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	

}
