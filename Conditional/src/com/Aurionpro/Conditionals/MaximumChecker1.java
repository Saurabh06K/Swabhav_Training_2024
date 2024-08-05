package com.Aurionpro.Conditionals;

import java.util.Scanner;

public class MaximumChecker1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int number1 = sc.nextInt();

		System.out.println("Enter number2: ");
		int number2 = sc.nextInt();

		if (number1 > number2) {
			System.out.println("The number1 is maximum");
		} else if (number1 == number2) {
			System.out.println("Both are equal");
		} else {
			System.out.println("The number2 is maximum");
		}
	}
}
