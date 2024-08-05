package com.Aurionpro.Model;

import com.Aurionpro.Exceptions.OverDraftLimitExceededException;

public class CurrentAccount extends Account {
	private double overDraftLimit;

	public CurrentAccount(int accounNumber, String name, double balance, double overDraftLimit) {
		super(accounNumber, name, balance);
		this.setOverDraftLimit(overDraftLimit);
	}

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}

	public void checkOverDraftLimit(int amountToBeDebited, double overDraftLimit) {
		double balance = getBalance();

		if (amountToBeDebited <= balance) {
			balance -= amountToBeDebited;
			setBalance(balance);
			System.out.println("Amount debited successfully!\n" + "Current Balance is: " + getBalance());
			return;
		}
		if (amountToBeDebited > balance) {
			double remainingAmount = amountToBeDebited - balance;
			if (remainingAmount <= overDraftLimit) {
				setBalance(0.0);
				this.setOverDraftLimit(this.getOverDraftLimit() - remainingAmount);
				System.out.println("Amount debited successfully using OverDraftLimit\n" + "Your Balance is: "
						+ getBalance() + "\nCurrent OverDraftLimit is: " + getOverDraftLimit());
				return;
			}
			if (remainingAmount > overDraftLimit) {
				throw new OverDraftLimitExceededException();
			}
		}
		System.out.println("Current Balance is: " + getBalance() + " " + "\nOverDraft: " + this.getOverDraftLimit());
	}

	@Override
	public String toString() {
		return "CurrentAccount [overDraftLimit=" + overDraftLimit + ", AccountNumber=" + getAccountNumber() + ", Name="
				+ getName() + ", Balance=" + getBalance() + ", AccountType=" + getAccountType() + "]";
	}

}
