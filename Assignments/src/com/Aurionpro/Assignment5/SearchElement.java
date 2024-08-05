package com.Aurionpro.Assignment5;

import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int cols = sc.nextInt();
		int arr[][] = new int[rows][cols];
		Boolean present = false;

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

		System.out.println("\nEnter the key value: ");
		int key = sc.nextInt();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (key == arr[i][j]) {
					// System.out.println("Value found at index: " + "(" + i + "," + j + ")");
					System.out.println("Value found at: \nRow - " + i + "\nColumn - " + j);
					present = true;
					break;
				}
			}
		}
		if (present != true) {
			System.out.println("Element not found");
		}
	}
}
