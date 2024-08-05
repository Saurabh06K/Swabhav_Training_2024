package com.Aurionpro.Conditionals2;

import java.util.Scanner;

public class NumberPrinter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();

		for (int i = 0; i < number; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
