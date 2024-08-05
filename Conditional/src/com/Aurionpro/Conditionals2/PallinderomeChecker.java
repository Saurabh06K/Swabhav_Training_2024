package com.Aurionpro.Conditionals2;

import java.util.Scanner;

public class PallinderomeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int original = number;
		int reverse = 0;

		while (number > 0) {
			int lastDigit = number % 10;
			number /= 10;
			reverse = (reverse * 10) + lastDigit;
		}

		if (reverse == original) {
			System.out.println("It is a Pallindrome");
		} else {
			System.out.println("It is not a Pallindrome");
		}
	}
}
