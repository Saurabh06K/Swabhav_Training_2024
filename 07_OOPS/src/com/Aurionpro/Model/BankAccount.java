package com.Aurionpro.Model;

public class BankAccount {
	private int accountNumber;
	private String name;
	private int balance = 5000;
	
	public BankAccount(int accountNumber, String name, int balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAccountNumber(int number) {
		accountNumber = number;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public int deposit(int amount) {
		if(amount > 0) {
		balance += amount;
		return balance;
		}
		return -1;
	}

	public int withdraw(int amount) {
		if(amount < 0) {
			return 0;
		}
	else if (amount <= balance) {
			balance -= amount;
			return balance;
		} else {
			return -1;
		}
	}
}
