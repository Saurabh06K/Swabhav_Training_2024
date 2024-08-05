package com.Aurionpro.Assignment4;

import java.util.Scanner;

public class MatrixAddition {
	public static int[][] matrixAddition(int[][] matrix1, int rows1, int cols1, int[][] matrix2, int rows2, int cols2) {
		if (cols1 != rows2) {
			System.out.println("Matrix cannot be multiplied.");
		}

		int[][] resultMatrix = new int[rows1][cols2];
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols2; j++) {
				for (int k = 0; k < cols1; k++) {
					resultMatrix[i][j] += matrix1[i][k] + matrix2[k][j];
				}
			}
		}
		return resultMatrix;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows for matrix 1: ");
		int rows1 = sc.nextInt();
		System.out.print("Enter the number of columns for matrix 1: ");
		int cols1 = sc.nextInt();

		int[][] matrix1 = new int[rows1][cols1];
		System.out.println("Enter matrix 1 elements:");
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols1; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix1 is:");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.print("Enter the number of rows for matrix 2: ");
		int rows2 = sc.nextInt();
		System.out.print("Enter the number of columns for matrix 2: ");
		int cols2 = sc.nextInt();

		int[][] matrix2 = new int[rows2][cols2];
		System.out.println("Enter matrix 2 elements:");
		for (int i = 0; i < rows2; i++) {
			for (int j = 0; j < cols2; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix2 is:");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}

		int resultMatrix[][] = matrixAddition(matrix1, rows1, cols1, matrix2, rows2, cols2);

		System.out.println("Result Matrix is:");
		for (int i = 0; i < resultMatrix.length; i++) {
			for (int j = 0; j < resultMatrix[i].length; j++) {
				System.out.print(resultMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}
}
