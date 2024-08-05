package com.Aurionpro.Conditionals2;

import java.util.Scanner;

public class SumOfEvenNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int sum = 0;
		int i = 1;

		while (i <= number) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("The sum is: " + sum);
	}
}
