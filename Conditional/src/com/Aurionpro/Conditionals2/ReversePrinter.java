package com.Aurionpro.Conditionals2;

import java.util.Scanner;

public class ReversePrinter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();

		while (number >= 0) {
			System.out.println(number);
			number--;
		}
	}
}
