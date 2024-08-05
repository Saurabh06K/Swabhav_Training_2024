package com.Aurionpro.Creaational.AbstractFactory.Model;

public class SavingsAccount implements IAccount {

	private String name;
	private String accountNumber;
	private double minBalance;
	private double balance;

	public SavingsAccount(String name, String accountNumber, double minBalance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.minBalance = minBalance;
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
		if (balance - amount >= minBalance) {
			balance -= amount;
			System.out.println("Amount Debited successfully! \nCurrent Balance is: " + balance);
			return;
		}
		System.out.println("Transaction failed! \nInsufficient funds");
	}

	@Override
	public String toString() {
		return "SavingsAccount [name=" + name + ", accountNumber=" + accountNumber + ", minBalance=" + minBalance
				+ ", balance=" + balance + "]";
	}
	
	

}
