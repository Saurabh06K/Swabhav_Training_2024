package com.Aurionpro.Test;

import java.util.Scanner;

import com.Aurionpro.Exceptions.InnsufficientBalanceException;
import com.Aurionpro.Exceptions.NegativeAmountException;
import com.Aurionpro.Model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter account number: ");
		int accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter your Name: ");
		String name = scanner.nextLine();
		System.out.println("Enter balance: ");
		Double balance = scanner.nextDouble();

		Account account1 = new Account(accountNumber, name, balance);
		System.out.println(account1);
		try {
			System.out.println("Enter amount to deposit: ");
			double creditAmount = scanner.nextDouble();
			account1.deposit(creditAmount);
			System.out.println("Enter amount to withdraw: ");
			double debitAmount = scanner.nextDouble();
			account1.withdraw(debitAmount);
		} catch (InnsufficientBalanceException exception) {
			System.out.println(exception.getMessage());
		} catch (NegativeAmountException exception) {
			System.out.println(exception.getMessage());
		}

	}
}
