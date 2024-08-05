package com.Aurionpro.Model;

import com.Aurionpro.Exceptions.InnsufficientBalanceException;
import com.Aurionpro.Exceptions.NegativeAmountException;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;

	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
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

	public void deposit(double amount) {
		if (amount < 0) {
			throw new NegativeAmountException();
		}
		this.balance += amount;
		System.out.println("Deposited Successfully! \nYour balance is " + this.balance);
		return;
	}

	public void withdraw(double amount) {
		if (amount <= 0 || amount > balance) {
			throw new InnsufficientBalanceException();
		}
		this.balance -= amount;
		System.out.println("Withdrawn SuccessFully! \nYour balance is " + balance);
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

}
