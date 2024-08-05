package com.Aurionpro.Conditionals2;

import java.util.Scanner;

public class PrimeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int i = 2;

		if (i == 1) {
			System.out.println("Neither prime nor composite");
		} else {
			while (i < number) {

				if (number % i == 0) {
					System.out.println("It is not a prime");
					break;
				}
				i++;
			}
			if (i == number) {
				System.out.println("It is prime");
			}
		}

	}
}
