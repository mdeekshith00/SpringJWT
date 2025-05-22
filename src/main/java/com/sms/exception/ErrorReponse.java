package com.sms.exception;


public class ErrorReponse {
	    private String resourceName;
	    private String fieldName;
	    private String message;

	    public ErrorReponse(String resourceName, String fieldName, String message) {
	        this.resourceName = resourceName;
	        this.fieldName = fieldName;
	        this.message = message;
	    }

	    // Getters and Setters
	    public String getResourceName() {
	        return resourceName;
	    }

	    public void setResourceName(String resourceName) {
	        this.resourceName = resourceName;
	    }

	    public String getFieldName() {
	        return fieldName;
	    }

	    public void setFieldName(String fieldName) {
	        this.fieldName = fieldName;
	    }

	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }
	  


}
