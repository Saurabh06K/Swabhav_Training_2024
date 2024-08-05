package com.Aurionpro.Exceptions;

public class AgeNotValidException extends RuntimeException {
	public String getMessage() {
		return "Age Invalid: Age is less than 18";
	}
}
