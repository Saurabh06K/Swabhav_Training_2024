package com.Aurionpro.Exceptions;

public class MinimumBalanceException extends RuntimeException {
	public String getMessage() {
		return "Transaction Failed!\nPlease maintain the minimum balance";
	}
}
