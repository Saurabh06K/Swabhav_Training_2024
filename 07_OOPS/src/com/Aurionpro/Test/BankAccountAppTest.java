package com.Aurionpro.Test;

import com.Aurionpro.Test.AccountType;

import java.util.Scanner;

import com.Aurionpro.Model.BankAccountApp;

public class BankAccountAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Accounts to be created");
		int size = sc.nextInt();
		double max = Integer.MIN_VALUE;
		BankAccountApp maxBalanceAccount = null;
		BankAccountApp[] bankaccounts = new BankAccountApp[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the account No");
			long accountNo = sc.nextLong();
			sc.nextLine();
			System.out.println("Enter the Name");
			String name = sc.nextLine();
			System.out.println("Enter the Balance");
			double balance = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter the Account Type: \n1.Current \n2.Savings");
			int accountType = sc.nextInt();
			if (accountType == 1) {
				BankAccountApp newAccount = new BankAccountApp();
				System.out.println("Enter the amount to be Credited");
				int depositAmount = sc.nextInt();
				newAccount.creditAmount(depositAmount);
				System.out.println("Enter the amount to be Debited");
				int debitAmount = sc.nextInt();
				sc.nextLine();
				newAccount.debitAmount(debitAmount);
				bankaccounts[i] = newAccount;
			}
		}

		System.out.println();

		for (int i = 0; i < bankaccounts.length; i++) {
			if (bankaccounts[i].getBalance() > max) {
				max = bankaccounts[i].getBalance();
				maxBalanceAccount = bankaccounts[i];
			}
			System.out.println("Account Details are: ");
			System.out.println("Account number: " + bankaccounts[i].getAccountNo() + "\nName: "
					+ bankaccounts[i].getName() + "\nBalance: " + bankaccounts[i].getBalance() + " \nAccount Type: "
					+ bankaccounts[i].getAccountType());
			System.out.println();

		}
		if (maxBalanceAccount != null && max != Integer.MIN_VALUE)
			System.out.println("Maximum Balance Account is of Account number " + maxBalanceAccount.getAccountNo()
					+ " by " + maxBalanceAccount.getName() + " with a balance of " + maxBalanceAccount.getBalance()
					+ " on " + maxBalanceAccount.getAccountType() + "account");
	}

}
