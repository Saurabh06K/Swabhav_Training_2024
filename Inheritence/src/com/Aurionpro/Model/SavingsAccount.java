package com.Aurionpro.Model;

import com.Aurionpro.Exceptions.MinimumBalanceException;

public class SavingsAccount extends Account {
	private double minBalance;

	public SavingsAccount(int accounNumber, String name, double balance, double minBalance) {
		super(accounNumber, name, balance);
		this.minBalance = minBalance;
	}

	@Override
	public String toString() {
		return "SavingsAccount [Minimum Balance=" + minBalance + ", Account Number=" + getAccountNumber() + ", Name="
				+ getName() + ", Balance=" + getBalance() + "]";
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	public void checkMinimumBalance(int amountToBeDebited, double minBalance) {
		this.minBalance = getMinBalance();
		double balance = getBalance();

		if (amountToBeDebited < balance && (balance - amountToBeDebited) > minBalance) {
			balance -= amountToBeDebited;
			setBalance(balance);
			System.out.println("Amount debited successfully!\n" + "Current Balance is: " + getBalance());
			return;
		}
		throw new MinimumBalanceException();
	}
}
