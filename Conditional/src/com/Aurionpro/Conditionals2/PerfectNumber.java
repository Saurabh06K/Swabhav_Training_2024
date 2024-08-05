package com.Aurionpro.Conditionals2;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int original = number;
		int sum = 0;
		int i = 1;

		while (i <= (number/2)) {
			if (number % i == 0) {
				sum += i;
			}
			i++;
		}

		if (sum == original) {
			System.out.println("It is a Perfect NUmber");
		} else {
			System.out.println("It is not a Perfect NUmber");
		}
	}
}
