package com.Aurionpro.Operators;

import java.util.Scanner;

public class BitwiseOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int number1 = sc.nextInt();
		System.out.println("Enter number2: ");
		int number2 = sc.nextInt();

		System.out.println("The result is: " + (number1 & number2));

		// Leftshift
		System.out.println("Leftshift: " + (number1 >> 1));

		// Rightshift
		System.out.println("Rightshift: " + (number1 << 1));
	}
}
