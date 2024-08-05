package com.Aurionpro.Test;

import java.util.Scanner;

import com.Aurionpro.Exceptions.MinimumBalanceException;
import com.Aurionpro.Exceptions.OverDraftLimitExceededException;
import com.Aurionpro.Model.Account;
import com.Aurionpro.Model.CurrentAccount;
import com.Aurionpro.Model.SavingsAccount;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of Accounts to be created");
		int size = scanner.nextInt();
		Account[] bankAccounts = new Account[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter account number: ");
			int accountNumber = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter your Name: ");
			String name = scanner.nextLine();
			System.out.println("Enter balance: ");
			double balance = scanner.nextDouble();

			System.out.println("Enter the Account Type: \n1.Current \n2.Savings");
			int accountType = scanner.nextInt();

			chooseAccount(accountType, scanner, accountNumber, balance, name, bankAccounts, i);

			System.out.println(bankAccounts[i].toString());
		}
	}

	public static void chooseAccount(int accountType, Scanner scanner, int accountNumber, double balance, String name,
			Account[] bankAccounts, int i) {
		if (accountType == 1) {
			System.out.println("Enter Over Draft Limit: ");
			double overDraftLimit = scanner.nextInt();
			CurrentAccount newCurrentAccount = new CurrentAccount(accountNumber, name, balance, overDraftLimit);
			System.out.println("Enter the amount to be Credited");
			int depositAmount = scanner.nextInt();
			newCurrentAccount.creditAmount(depositAmount);
			System.out.println("Enter the amount to be Debited");
			int debitAmount = scanner.nextInt();
			scanner.nextLine();
			try {
				newCurrentAccount.checkOverDraftLimit(debitAmount, overDraftLimit);
			} catch (OverDraftLimitExceededException exception) {
				System.out.println(exception.getMessage());
			}
			bankAccounts[i] = newCurrentAccount;
			return;
		}
		if (accountType == 2) {
			System.out.println("Enter minimum balance: ");
			double minBalance = scanner.nextDouble();
			scanner.nextLine();
			SavingsAccount newSavingsAccount = new SavingsAccount(accountNumber, name, balance, minBalance);
			System.out.println("Enter the amount to be Credited");
			int depositAmount = scanner.nextInt();
			newSavingsAccount.creditAmount(depositAmount);
			System.out.println("Enter the amount to be Debited");
			int debitAmount = scanner.nextInt();
			scanner.nextLine();
			try {
				newSavingsAccount.checkMinimumBalance(debitAmount, minBalance);
			} catch (MinimumBalanceException exception) {
				System.out.println(exception.getMessage());
			}
			bankAccounts[i] = newSavingsAccount;
			return;
		}
	}
}
