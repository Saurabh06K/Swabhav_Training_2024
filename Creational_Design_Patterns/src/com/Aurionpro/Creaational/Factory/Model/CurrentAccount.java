package com.Aurionpro.Creaational.Factory.Model;

public class CurrentAccount implements IAccount {
	
	private String accountName;
	private int accountNumber;
	private double overDraftLimit;

	
	public CurrentAccount(String accountName, int accountNumber, double overDraftLimit) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.overDraftLimit = overDraftLimit;
	}

	@Override
	public void credit() {
	}

	@Override
	public void debit() {
	}

}
