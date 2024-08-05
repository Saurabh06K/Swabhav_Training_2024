package com.Aurionpro.Test;

import java.util.Scanner;

import com.Aurionpro.Model.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Account 1
		System.out.println("Enter a balance amount: ");
		int balance = sc.nextInt();
		// account1.setBalance(balance);
		System.out.println("Enter name of Employee 1: ");
		String name = sc.nextLine();
		// account1.setName(name);
		System.out.println("Enter Account Number: ");
		int number = sc.nextInt();
		// account1.setAccountNumber(number);
		BankAccount account1 = new BankAccount(number, name, balance);

		System.out.println("The name of Employee is: " + account1.getName());
		System.out.println("Account Number is: " + account1.getAccountNumber());
		System.out.println("Balance is: " + account1.getBalance());

		System.out.println("1. Deposit" + "\n2. Withdraw");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("Enter amount to deposit");
			int amount = sc.nextInt();
			balance = account1.deposit(amount);
			if (balance != -1) {
				System.out.println("Your balance is: " + account1.getBalance());
			} else {
				System.out.println("Enter amount in positive");
			}
		} else if (choice == 2) {
			System.out.println("Enter amount to withdraw");
			int amount = sc.nextInt();
			balance = account1.withdraw(amount);
			if (balance == 0) {
				System.out.println("Enter amount in positive");
			} else if (balance == -1) {
				System.out.println("Insufficient Balance");
			} else {
				System.out.println("Your balance is: " + account1.getBalance());
			}
		} else {
			System.out.println("Enter valid option");
		}
		sc.nextLine();

		// Account 2
		System.out.println("Enter a balance amount: ");
		balance = sc.nextInt();
		// account2.setBalance(balance);
		System.out.println("Enter name of Employee 2: ");
		name = sc.nextLine();
		// account2.setName(name);
		System.out.println("Enter Account Number: ");
		number = sc.nextInt();
		// account2.setAccountNumber(number);
		BankAccount account2 = new BankAccount(number, name, balance);

		System.out.println("The name of Employee is: " + account2.getName());
		System.out.println("Account Number is: " + account2.getAccountNumber());
		System.out.println("Balance is: " + account2.getBalance());

		System.out.println("1. Deposit" + "\n2. Withdraw");
		choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("Enter amount to deposit");
			int amount = sc.nextInt();
			balance = account2.deposit(amount);
			if (balance != -1) {
				System.out.println("Your balance is: " + account2.getBalance());
			} else {
				System.out.println("Enter amount in positive");
			}
		} else if (choice == 2) {
			System.out.println("Enter amount to withdraw");
			int amount = sc.nextInt();
			balance = account2.withdraw(amount);
			if (balance == 0) {
				System.out.println("Enter amount in positive");
			} else if (balance == -1) {
				System.out.println("Insufficient Balance");
			} else {
				System.out.println("Your balance is: " + account2.getBalance());
			}
		} else {
			System.out.println("Enter valid option");
		}
	}

}
