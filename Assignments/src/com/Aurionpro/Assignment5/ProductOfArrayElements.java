package com.Aurionpro.Assignment5;

import java.util.Scanner;

public class ProductOfArrayElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array: ");
		int size = sc.nextInt();
		int array[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter value for index " + i);
			array[i] = sc.nextInt();
		}

		System.out.println("The array is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		int prod[] = productArray(array, size);

		System.out.println("\nThe product array is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(prod[i] + " ");
		}
	}

	public static int[] productArray(int[] array, int size) {
		int productArray[] = new int[size];

		for (int i = 0; i < size; i++) {
			productArray[i] = 1;
		}

		// Temp variable to store the running product from the left
		int temp = 1;
		for (int i = 0; i < size; i++) {
			productArray[i] = temp;
			temp *= array[i];
		}

		// Reset temp to 1 to store the running product from the right
		temp = 1;
		for (int i = size - 1; i >= 0; i--) {
			productArray[i] *= temp;
			temp *= array[i];
		}
		return productArray;
	}
}
