package com.sms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	    @ExceptionHandler(StudentNotFound.class)
	    public ResponseEntity<ErrorReponse> handleStudentNotFoundException(StudentNotFound ex) {
	        ErrorReponse error 	= new ErrorReponse("Student", "sid", ex.getMessage());
	        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	    }
	    @ExceptionHandler(Exception.class)
	    public ResponseEntity<ErrorReponse> handleGenericException(Exception ex) {
	        ErrorReponse error = new ErrorReponse("SpringJWt", "Unknown", ex.getMessage());
	        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	    @ExceptionHandler(UsersNotFound.class)
	    public ResponseEntity<?> handleUsersNotFoundException(UsersNotFound ux) {
	    	ErrorReponse error = new ErrorReponse("Users","user_id",ux.getMessage());
	    	return new ResponseEntity<>(error , HttpStatus.NOT_FOUND);
	    }
	
}
