package com.Aurionpro.Conditionals;

import java.util.Scanner;

public class PositiveNegativeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = sc.nextInt();

		if (number == 0) {
			System.out.println("The number is zero");
		} else if (number > 0) {
			System.out.println("The number is positive");
		} else {
			System.out.println("The number is negative");
		}
	}
}
