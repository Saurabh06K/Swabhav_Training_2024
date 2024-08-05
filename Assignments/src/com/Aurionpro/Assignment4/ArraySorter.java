package com.Aurionpro.Assignment4;

import java.util.Scanner;

public class ArraySorter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array: ");
		int size = sc.nextInt();
		int array[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter value for index " + i);
			array[i] = sc.nextInt();
		}

		System.out.println("The array before sort is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println("\nThe array after sort is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

	}
}
