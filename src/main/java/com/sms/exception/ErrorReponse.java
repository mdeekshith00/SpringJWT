package com.sms.exception;

public class ErrorReponse {
	private String fieldMethod;
	private String feildName;
	private Object field;
	
	public ErrorReponse(String fieldMethod , String feildName, Object field) {
//		super(String.format(feildName, null))
		this.fieldMethod=fieldMethod;
		this.feildName=feildName;
		this.field=field;
	}

}
