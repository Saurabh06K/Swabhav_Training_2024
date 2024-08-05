package com.Aurionpro.Conditionals2;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int userInput = number;
		double sum = 0;
		int power = 0;
		int digits = number;

		while (digits > 0) {
			int digit = digits % 10;
			digits /= 10;
			power++;
		}

		while (number > 0) {
			int lastDigit = number % 10;
			sum += Math.pow(lastDigit, power);
			number /= 10;
		}

		if (sum == userInput) {
			System.out.println("It is an Armstrong number");
		} else {
			System.out.println("It is not an Armstrong number");
		}
	}
}
