package com.Aurionpro.Operators;

import java.util.Scanner;

public class AssignmentOperator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int number = sc.nextInt();

		System.out.println("number += 3: " + (number += 3));
		System.out.println("number -= 2: " + (number -= 2));
		System.out.println("number *= 5: " + (number *= 5));
		System.out.println("number /= 2: " + (number /= 2));
		System.out.println("number %= 4: " + (number *= 4));
	}
}
