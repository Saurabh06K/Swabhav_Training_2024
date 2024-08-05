package com.Aurionpro.Operators;

import java.util.Scanner;

public class LogicalOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks: ");
		int marks = sc.nextInt();

		if (marks < 20 && marks > 7) {
			System.out.println("You passed the test");
		} else if (marks == 7 || marks == 20) {
			System.out.println("You passed the test");
		} else if (!(marks >= 7)) {
			System.out.println("You failed the test");
		}
	}
}
