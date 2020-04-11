package com.nagp.microservice.assignment.user.exception;

public class InvalidUserReferenceException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidUserReferenceException(String errorMessage) {
		super(errorMessage);
	}
}
