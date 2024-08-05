package com.Aurionpro.Behavioural.Observer.Exceptions;

public class InsufficientFundsException extends RuntimeException {
	public String getMessage() {
		return "Transaction Failed.\nInsufficient Funds in your Account.";
	}
}
