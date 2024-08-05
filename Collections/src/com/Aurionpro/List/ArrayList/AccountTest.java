package com.Aurionpro.List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.Aurionpro.List.Model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Account> accounts = new ArrayList<Account>();
		AccountTest testAccount = new AccountTest();
		testAccount.createAccount(accounts, scanner);
		Account.getMaximumBalanceAccount(accounts);
		Account.sortAccountsAccordingBalance(accounts);
	}

	public void createAccount(List<Account> accounts, Scanner scanner) {
		System.out.println("Enter number of accounts to create: ");
		int size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter Account Number: ");
			int accountNumber = scanner.nextInt();
			System.out.println("Enter Name: ");
			String name = scanner.next();
			System.out.println("Enter Balance: ");
			double balance = scanner.nextDouble();
			accounts.add(new Account(accountNumber, name, balance));
		}
	}
}
