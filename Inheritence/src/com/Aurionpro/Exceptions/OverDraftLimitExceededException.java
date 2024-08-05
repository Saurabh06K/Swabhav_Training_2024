package com.Aurionpro.Exceptions;

public class OverDraftLimitExceededException extends RuntimeException {
	public String getMessage() {
		return "OverDraft Limit Exceeded.\nTransaction not possible!";
	}
}
