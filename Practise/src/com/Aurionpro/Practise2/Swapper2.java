package com.Aurionpro.Practise2;

public class Swapper2 {
	public static void main(String[] args) {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);

		System.out.println("Before swap :");
		System.out.println(number1);
		System.out.println(number2);

		// Swap
		number1 = number1 + number2;
		number2 = number2 - number1;
		number1 = number1 - number2;

		System.out.println("After swap :");
		System.out.println(number1);
		System.out.println(number2);
	}
}
