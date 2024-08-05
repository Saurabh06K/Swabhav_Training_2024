package com.Aurionpro.Assignment4;

import java.util.Scanner;

public class ArrayPrimePrinter {
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
		System.out.println("Enter size of the Array: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		int count = 0;
		int result[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter value for index " + i);
			array[i] = sc.nextInt();
		}

		System.out.println("The array is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\nThe prime numbers are: ");
		for (int i = 0; i < array.length; i++) {
			if (isPrime(array[i])) {
				System.out.println(array[i]);
			}
		}
	}
}
