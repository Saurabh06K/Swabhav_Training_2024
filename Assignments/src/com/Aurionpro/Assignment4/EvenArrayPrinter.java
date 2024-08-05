package com.Aurionpro.Assignment4;

import java.util.Scanner;

public class EvenArrayPrinter {
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

		System.out.println("\nThe even numbers are: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
				count++;
			}
		}

		// System.out.println("The array of even numbers is: ");
		// for (int i = 0; i < result.length; i++) {
		// System.out.print(result[i] + " ");
		// }
	}
}
