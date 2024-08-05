package com.Aurionpro.Operators;

import java.util.*;

public class ArithmeticOperators {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int number1 = sc.nextInt();
		System.out.println("Enter number2: ");
		int number2 = sc.nextInt();

		// Addition Operator
		System.out.println("Addition is: " + (number1 + number2));

		// Subtraction Operator
		System.out.println("Subtraction is: " + (number1 - number2));

		// Multiplication Operator
		System.out.println("Multiplication is: " + (number1 * number2));

		// Division Operator
		System.out.println("Division is: " + (number1 / number2));

		// Modulo Operator
		System.out.println("Modulo is: " + (number1 % number2));
	}
}
