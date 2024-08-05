package com.Aurionpro.Model;

import com.Aurionpro.Test.AccountType;

public class BankAccountApp {
	private long accountNo;
	private String name;
	private double balance;
	private AccountType accountType;

	public BankAccountApp() {

	}

	public BankAccountApp(long accountNo, String name, double balance, AccountType accountType2, AccountType accountType) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

//	public void setAccountType(String accountType) {
//		if (accountType.equalsIgnoreCase("Savings")) {
//			this.accountType = "Savings";
//		} else if (accountType.equalsIgnoreCase("Current")) {
//			this.accountType = "Current";
//		}
//
//	}
//
//	public String getAccountType() {
//		return accountType;
//	}

	@Override
	public String toString() {
		return "BankAccountApp [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + ", accountType="
				+ accountType + "]";
	}

	public void creditAmount(int amount) {
		if (amount >= 0) {
			this.balance += amount;
			System.out.println("Deposited Successfully! \nYour balance is " + this.balance);
		} else {
			System.out.println("Amount Should be Only Positive");
		}

	}

	public void debitAmount(int amount) {
		if (amount <= 0 || amount > balance)
			System.out.println("Please Enter a valid amount");
		else {
			this.balance -= amount;
			System.out.println("Deposited SuccessFully! \nYour balance is " + balance);
		}

	}
}
