package com.Aurionpro.Debugger;

import java.util.Scanner;

public class DebuggerTest {
	public static int Addition(int a, int b) {
		Subtraction(a, b);
		return a + b;
	}
	
	public static int Subtraction(int a, int b) {
		return a-b;
	}

	public static void main(String[] args) {
		System.out.println("Enter the numbers: ");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();

		int sum = Addition(number1, number2);
		System.out.println("Addition is: " + sum);
	}
}
