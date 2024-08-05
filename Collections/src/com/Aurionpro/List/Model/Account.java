package com.Aurionpro.List.Model;

import java.util.List;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;

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

	public static void getMaximumBalanceAccount(List<Account> accounts) {
		Account maximumBalance = accounts.get(0);
		for (Account account : accounts) {
			if (account.getBalance() > maximumBalance.getBalance()) {
				maximumBalance = account;
			}
		}
		System.out.println("The account with maximum balance is: \n" + maximumBalance);
	}

	public static void sortAccountsAccordingBalance(List<Account> accounts) {
		for (int i = 0; i < accounts.size(); i++) {
			for (int j = 0; j < accounts.size() - 1 - i; j++) {
				if (accounts.get(j).getBalance() > accounts.get(j + 1).getBalance()) {
					Account tempAccount = accounts.get(j);
					accounts.set(j, accounts.get(j + 1));
					accounts.set(j + 1, tempAccount);
				}
			}
		}
		System.out.println("Accounts sorted according to balance are: \n" + accounts);
	}

	@Override
	public String toString() {
		return "Account [AccountNumber=" + accountNumber + ", Name=" + name + ", Balance=" + balance + "]";
	}

	// public void creditAmount(int amount) {
	// if (amount >= 0) {
	// this.balance += amount;
	// System.out.println("Deposited Successfully! \nYour balance is " +
	// this.balance);
	// return;
	// }
	// System.out.println("Amount Should be Only Positive");
	//
	// }
	//
	// public void debitAmount(int amount) {
	// if (amount <= 0 || amount > balance) {
	// System.out.println("Please Enter a valid amount");
	// return;
	// }
	// this.balance -= amount;
	// System.out.println("Deposited SuccessFully! \nYour balance is " + balance);
	// }
}
