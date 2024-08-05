package com.Aurionpro.Assignment4;

import java.util.Scanner;

public class ArrayReverser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		int n = array.length;

		for (int i = 0; i < size; i++) {
			System.out.println("Enter value for index " + i);
			array[i] = sc.nextInt();
		}

		System.out.println("The array is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		// Reversing the array
		for (int i = 0; i < n / 2; i++) {
			int temp = array[i];
			array[i] = array[n - i - 1];
			array[n - i - 1] = temp;
		}

		System.out.println("\nThe reverse of array is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
