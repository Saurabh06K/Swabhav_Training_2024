package com.Aurionpro.Practise;

import java.util.Scanner;

public class Swapper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int number1 = sc.nextInt();
		System.out.println("Enter number2: ");
		int number2 = sc.nextInt();
		System.out.println("Before swap :");
		System.out.println(number1);
		System.out.println(number2);
		
//		Swap
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		
		System.out.println("After swap :");
		System.out.println(number1);
		System.out.println(number2);
	}
}
