package com.Aurionpro.ArrayApp;

import java.util.*;

public class ArrayApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter value for index " + i);
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
