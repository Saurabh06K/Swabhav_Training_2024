package com.Aurionpro.Exceptions;

public class PasswordNotValidException extends RuntimeException {
	private String message;

	public PasswordNotValidException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
