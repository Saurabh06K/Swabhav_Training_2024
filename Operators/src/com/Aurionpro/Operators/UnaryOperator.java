package com.Aurionpro.Operators;

import java.util.Scanner;

public class UnaryOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number1: ");
		int number1 = sc.nextInt();

		System.out.println("Enter your number2: ");
		int number2 = sc.nextInt();

		System.out.println("Unary Plus: " + (number1 + number2));
		System.out.println("Unary Minus: " + (number1 - number2));

		// Increment Operator
		System.out.println("Post Increment: " + (number1++));
		System.out.println("Value of number1: " + number1);
		System.out.println("Pre Increment: " + (++number1));

		// Decrement Operator
		System.out.println("Post Decrement: " + (number2--));
		System.out.println("Value of number2: " + number2);
		System.out.println("Pre Decrement: " + (--number2));
	}
}
