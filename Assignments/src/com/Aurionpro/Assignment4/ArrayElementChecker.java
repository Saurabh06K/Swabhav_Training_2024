package com.Aurionpro.Assignment4;

import java.util.Scanner;

public class ArrayElementChecker {

	public static int searchElement(int key, int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		Boolean present = false;

		for (int i = 0; i < size; i++) {
			System.out.println("Enter value for index " + i);
			array[i] = sc.nextInt();
		}

		System.out.println("The array is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\nEnter a value to find: ");
		int value = sc.nextInt();

		int index = searchElement(value, array);

		if (index != -1) {
			System.out.println("The value is present in the array at index: " + index);
		} else {
			System.out.println("Value not found in the array");
		}
	}
}
