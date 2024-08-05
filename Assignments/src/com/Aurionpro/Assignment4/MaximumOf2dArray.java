package com.Aurionpro.Assignment4;

import java.util.Scanner;

public class MaximumOf2dArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int cols = sc.nextInt();
		int arr[][] = new int[rows][cols];
		int maximum = arr[0][0];

		System.out.println("Enter the elements: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("The array is: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (arr[i][j] > maximum) {
					maximum = arr[i][j];
				}
			}
		}

		System.out.println("The maximum element is: " + maximum);
	}
}
