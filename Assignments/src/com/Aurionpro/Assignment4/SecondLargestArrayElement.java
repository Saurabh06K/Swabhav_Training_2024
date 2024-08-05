package com.Aurionpro.Assignment4;

import java.util.Scanner;

public class SecondLargestArrayElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < size; i++) {
			System.out.println("Enter value for index " + i);
			array[i] = sc.nextInt();
		}

		System.out.println("The array is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < size; i++) {
			if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
			} else if (array[i] > secondLargest && array[i] != largest) {
				secondLargest = array[i];
			}
		}

		System.out.println("\nThe second largest element is: " + secondLargest);
	}
}
