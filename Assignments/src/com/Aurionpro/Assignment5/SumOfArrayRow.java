package com.Aurionpro.Assignment5;

import java.util.Scanner;

public class SumOfArrayRow {
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

		for (int i = 0; i < rows; i++) {
			int sum = 0;
			for (int j = 0; j < cols; j++) {
				sum += arr[i][j];
			}
			System.out.println("The sum of Row-" + i + " is " + sum);
		}

	}
}
