package com.Aurionpro.Creaational.Factory.Model;

public class SavingsAccount implements IAccount {
	
	private String accountName;
	private int accountNumber;
	private double minBalance;
	
	

	public SavingsAccount(String accountName, int accountNumber, double minBalance) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.minBalance = minBalance;
	}

	@Override
	public void credit() {
	}

	@Override
	public void debit() {
	}

}
