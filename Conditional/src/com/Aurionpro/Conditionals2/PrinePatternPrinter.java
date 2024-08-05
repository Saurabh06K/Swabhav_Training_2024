package com.Aurionpro.Conditionals2;

import java.util.Scanner;

public class PrinePatternPrinter {

	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int count = 2;

		for (int i = 0; i < number; i++) {
			for (int j = 1; j <= i; j++) {
				while (!isPrime(count)) {
					count++;
				}
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}

}
