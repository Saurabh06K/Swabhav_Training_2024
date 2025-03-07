package com.Aurionpro.Creaational.AbstractFactory.Model;

public class CurrentAccount implements IAccount {

	private String name;
	private String accountNumber;
	private double overdraftLimit;
	private double balance;

	public CurrentAccount(String name, String accountNumber, double overdraftLimit) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getAccountNumber() {
		return accountNumber;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void credit(double amount) {
		balance += amount;
		System.out.println("Amount credited successfully! \nCurrent Balance is: " + balance);
	}

	@Override
	public void debit(double amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.println("Amount Debited Successfully \nCurrent Balance is: " + balance);
			return;
		}
		if (amount - balance <= overdraftLimit) {
			overdraftLimit -= amount;
			setBalance(0.0);
			System.out.println("Amount Debited using OverdraftLimit \nCurrent Balance is: " + balance);
			System.out.println("Current OverdraftLimit is: "+overdraftLimit);
			return;
		}
		System.out.println("Transaction failed! \nOverdraft limit exceeded..");
	}

	@Override
	public String toString() {
		return "CurrentAccount [name=" + name + ", accountNumber=" + accountNumber + ", overdraftLimit="
				+ overdraftLimit + ", balance=" + balance + "]";
	}
	
	

}
