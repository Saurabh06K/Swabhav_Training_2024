package com.Aurionpro.Assignment5;

import java.util.Scanner;

public class PeakElementFinder {

	public static int findPeak(int[] arr) {
		int n = arr.length;
		if (n == 1) {
			return 0;
		}

		for (int i = 1; i < n - 1; i++) {
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
				return arr[i];
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[] array = new int[size];

		System.out.println("Enter the elements: ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("The array is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		int peakElement = findPeak(array);

		if (peakElement != 0) {
			System.out.println("\nThe peak element is: " + peakElement);
		} else {
			System.out.println("\nThe peak element not found");
		}
	}
}
