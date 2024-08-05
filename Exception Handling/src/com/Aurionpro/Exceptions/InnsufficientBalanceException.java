package com.Aurionpro.Exceptions;

public class InnsufficientBalanceException extends RuntimeException {
	public String getMessage() {
		return "Innsufficient balance in your Account!";
	}
}
