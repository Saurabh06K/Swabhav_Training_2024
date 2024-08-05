package com.Aurionpro.Assignment2;

import java.util.Scanner;

public class CurrencyDenominator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter withdrawal amount: ");
		int amount = sc.nextInt();
		int Rs2000 = 0;
		int Rs500 = 0;
		int Rs200 = 0;
		int Rs100 = 0;

		if (amount % 100 == 0 && amount <= 50000) {
			while (amount >= 2000) {
				Rs2000 = amount / 2000;
				amount %= 2000;
			}

			while (amount >= 500) {
				Rs500 = amount / 500;
				amount %= 500;
			}

			while (amount >= 200) {
				Rs200 = amount / 200;
				amount %= 200;
			}

			while (amount >= 100) {
				Rs100 = amount / 100;
				amount %= 100;
			}

			System.out.println("The Result is: \n" + "Two Thousand: " + Rs2000 + "\nFive Hundred: " + Rs500
					+ "\nTwo Hundred: " + Rs200 + "\nOne Hundred: " + Rs100);
		} else if (amount > 50000) {
			System.out.println("Amount exceeds withdrawal limit of 50000");
		} else {
			System.out.println("Please enter the amount in multiples of 100");
		}

	}
}
