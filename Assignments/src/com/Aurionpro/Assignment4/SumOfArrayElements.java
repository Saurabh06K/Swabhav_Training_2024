package com.Aurionpro.Assignment4;

import java.util.Scanner;

public class SumOfArrayElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		int sum = 0;
		for (int i = 0; i < size; i++) {
			System.out.println("Enter value for index " + i);
			array[i] = sc.nextInt();
		}

		System.out.println("The array is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < size; i++) {
			sum += array[i];
		}

		System.out.println("\nThe sum of the array elements is: " + sum);
	}
}