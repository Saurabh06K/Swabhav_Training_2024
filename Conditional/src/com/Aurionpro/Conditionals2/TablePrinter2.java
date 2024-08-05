package com.Aurionpro.Conditionals2;

import java.util.Scanner;

public class TablePrinter2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();

		for (number = 1; number <= 10; number++) {
			for (int i = 1; i <= 10; i++) {
				System.out.print((number * i) + "\t");
			}
			System.out.println();
		}
	}
}
