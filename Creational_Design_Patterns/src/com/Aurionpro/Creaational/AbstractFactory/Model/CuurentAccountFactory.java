package com.Aurionpro.Creaational.AbstractFactory.Model;

public class CuurentAccountFactory implements IAccountFactory {

	@Override
	public IAccount createAccount(String name, String accountNumber, double overdraftLimit) {
		return new CurrentAccount(name, accountNumber, overdraftLimit);
	}

}
