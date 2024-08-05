package com.Aurionpro.Assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class SortedSquaredArray {

	public static int[] sortedSquaredArray(int arr[]) {
		int n = arr.length;
		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			int square = (int) Math.pow(arr[i], 2);
			result[i] = square;
		}
		Arrays.sort(result); 
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		int[] outputArray = new int[size];

		System.out.println("Enter all the values in sorted manner");
		for (int i = 0; i < size; i++) {
			System.out.println("Enter value for index " + i);
			array[i] = sc.nextInt();
		}

		System.out.println("The input array is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] > array[j]) {
					System.out.println("\nPlease input a sorted array");
					break;
				} else {
					outputArray = sortedSquaredArray(array);
				}
			}
		}

		System.out.println("\nThe output array is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(outputArray[i] + " ");
		}
	}
}
