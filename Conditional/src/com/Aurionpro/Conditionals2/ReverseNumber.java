package com.Aurionpro.Conditionals2;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int reverse = 0;

		while (number > 0) {
			int lastDigit = number % 10;
			number /= 10;
			reverse = (reverse*10) + lastDigit;
		}

		System.out.println("The reverse is: " + reverse);
	}
}
