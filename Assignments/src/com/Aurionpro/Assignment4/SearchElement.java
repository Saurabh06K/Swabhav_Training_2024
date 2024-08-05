package com.Aurionpro.Assignment4;

import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int cols = sc.nextInt();
		int arr[][] = new int[rows][cols];

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

		System.out.println("Enter the value: ");
		int key = sc.nextInt();
		Boolean isPresent = false;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (key == arr[i][j]) {
					isPresent = true;
				}
			}
		}
		if (isPresent) {
			isPresent = true;
			System.out.println("Elment found");
		} else {
			System.out.println("Element not found");
		}

	}
}
