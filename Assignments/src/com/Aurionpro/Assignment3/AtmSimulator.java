package com.Aurionpro.Assignment3;

import java.util.Scanner;

public class AtmSimulator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 1000;
		Boolean service = true;

		while (service) {
			System.out.println("ATM Menu:\n" + "1. Check Balance\n" + "2. Deposit Money\n" + "3. Withdraw Money\n"
					+ "4. Exit\n" + "Please choose an option: ");

			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Your current balance is: " + balance);
			} else if (choice == 2) {
				System.out.println("Enter amount to deposit: ");
				int deposit = sc.nextInt();
				System.out.println("You have deposited " + deposit);
				balance += deposit;
				System.out.println("Your new balance is: " + balance);
			} else if (choice == 3) {
				System.out.println("Enter amount to withdraw: ");
				int withdraw = sc.nextInt();
				if (withdraw <= balance) {
					System.out.println("You have withdrawn " + withdraw);
					balance -= withdraw;
					System.out.println("Your new balance is: " + balance);
				} else {
					System.out.println("Your balance is only: " + balance);
				}

			} else if (choice == 4) {
				System.out.println("Thankyou for using the ATM.\n Goodbye!");
				service = false;
			} else {
				System.out.println("Please enter a valid option.");
			}
		}
	}
}
