package com.Aurionpro.Exceptions;

public class NegativeAmountException extends RuntimeException {
	public String getMessage() {
		return "Transaction failed! \nAmount entered is negative";
	}
}
