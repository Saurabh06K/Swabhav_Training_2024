package com.Aurionpro.Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		int duplicates = 0;

		for (int i = 0; i < size; i++) {
			System.out.println("Enter value for index " + i);
			array[i] = sc.nextInt();
		}

		System.out.println("The array is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		
//		Sorting the array
		Arrays.sort(array);

		for (int i = 0; i < size; i++) {
			if (array[i] == array[i+1]) {
				duplicates++;
				
				while(i < array.length-1 && array[i] == array[i+1]) {
					i++;
				}
			}
		}
		System.out.println("\nTotal Duplicate elements in the array are " + duplicates);
	}
}
