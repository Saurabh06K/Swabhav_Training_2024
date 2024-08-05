package com.Aurionpro.Creaational.Factory.Test;

import com.Aurionpro.Creaational.Factory.Model.AccountFactory;
import com.Aurionpro.Creaational.Factory.Model.IAccount;

public class AccountTest {
	public static void main(String[] args) {
		AccountFactory account = new AccountFactory();
		IAccount acc = account.getCurrentAccount("Saurabh", 1234, 500);
		acc.credit();
	}
}
