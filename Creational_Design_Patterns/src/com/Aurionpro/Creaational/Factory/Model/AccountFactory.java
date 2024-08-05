package com.Aurionpro.Creaational.Factory.Model;

public class AccountFactory {
	IAccount accountType = null;
	
	public IAccount getSavingsAccount(String accountName, int accountId, double minBalance) {
		accountType = new SavingsAccount(accountName, accountId, minBalance);
		return accountType;
	}
	
	public IAccount getCurrentAccount(String accountName, int accountId, double overDraftLimit) {
		accountType = new SavingsAccount(accountName, accountId, overDraftLimit);
		return accountType;
	}
}
