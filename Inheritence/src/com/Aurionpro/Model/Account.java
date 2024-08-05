package com.Aurionpro.Model;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	private String accountType;

	public Account(int accounNumber, String name, double balance) {
		this.accountNumber = accounNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAccountType(String accountType) {
		if (accountType.equalsIgnoreCase("Savings")) {
			this.accountType = "Savings";
			return;
		}
		if (accountType.equalsIgnoreCase("Current")) {
			this.accountType = "Current";
			return;
		}
	}

	public String getAccountType() {
		return accountType;
	}

	public void creditAmount(int amount) {
		if (amount >= 0) {
			this.balance += amount;
			System.out.println("Deposited Successfully! \nYour balance is " + this.balance);
			return;
		}
		System.out.println("Amount Should be Only Positive");

	}

	public void debitAmount(int amount) {
		if (amount <= 0 || amount > balance) {
			System.out.println("Please Enter a valid amount");
			return;
		}
		this.balance -= amount;
		System.out.println("Deposited SuccessFully! \nYour balance is " + balance);

	}

}
