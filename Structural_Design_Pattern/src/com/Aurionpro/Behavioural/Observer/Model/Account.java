package com.Aurionpro.Behavioural.Observer.Model;

import java.util.ArrayList;
import java.util.List;

import com.Aurionpro.Behavioural.Observer.Exceptions.InsufficientFundsException;

public class Account {
	private String accountNumber;
	private String name;
	private double balance;
	private List<INotifier> notifiers;


	public Account(String accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.notifiers = new ArrayList<INotifier>();
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
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

	public List<INotifier> getNotifiers() {
		return notifiers;
	}

	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}

	public void deposit(double amount) {
		balance += amount;
		notifiers.forEach(notifier->notifier.notify(this));
	}

	public void withdraw(double amount) {
		if (amount > balance)
			throw new InsufficientFundsException();
		balance -= amount;
		notifiers.forEach(notifier->notifier.notify(this));
	}

	public void registerNotifier(INotifier notifier) {
		if (!notifiers.contains(notifier))
		this.notifiers.add(notifier);
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", notifiers="
				+ notifiers + "]";
	}

}