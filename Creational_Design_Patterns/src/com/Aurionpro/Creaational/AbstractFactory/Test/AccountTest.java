package com.Aurionpro.Creaational.AbstractFactory.Test;

import com.Aurionpro.Creaational.AbstractFactory.Model.CuurentAccountFactory;
import com.Aurionpro.Creaational.AbstractFactory.Model.IAccountFactory;
import com.Aurionpro.Creaational.AbstractFactory.Model.SavingsAccountFactory;
import com.Aurionpro.Creaational.AbstractFactory.Model.IAccount;

public class AccountTest {
	public static void main(String[] args) {
		IAccountFactory savingsFactory = new SavingsAccountFactory();
		IAccount savings = savingsFactory.createAccount("Saurabh", "3421", 2000.0);
		System.out.println(savings);
		savings.credit(15000);
		savings.debit(300);
		savings.debit(1300);

		// Create Current Account
		IAccountFactory currentFactory = new CuurentAccountFactory();
		IAccount current = currentFactory.createAccount("Rohit", "4512", 5000.0);
		System.out.println(current);
		current.credit(2000);
		current.debit(1500);
		current.debit(800); 
	}
}
