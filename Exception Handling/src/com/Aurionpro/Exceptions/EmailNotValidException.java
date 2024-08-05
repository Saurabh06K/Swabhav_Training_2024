package com.Aurionpro.Exceptions;

public class EmailNotValidException extends RuntimeException {
	private String message;

	public EmailNotValidException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
