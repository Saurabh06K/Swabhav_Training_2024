package com.Aurionpro.Patterns;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int count = 1;

		for (int i = 0; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}
}
