package com.Aurionpro.Creaational.AbstractFactory.Model;

public class SavingsAccountFactory implements IAccountFactory {

	@Override
	public IAccount createAccount(String name, String accountNumber, double minBalance) {
		return new SavingsAccount(name, accountNumber, minBalance);
	}

}
