package com.Aurionpro.Operators;

import java.util.*;

public class RelationalOperator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();

		// Age criteria for voting
		if (age == 18) {
			System.out.println("Start applying for your voter ID");
		} else if (age != 18 && age < 18) {
			System.out.println("You are not eligible");
		} else if (age <= 18) {
			System.out.println("You will be eligible");
		} else if (age > 18) {
			System.out.println("You can vote");
		} else if (age >= 18) {
			System.out.println("You are eligible and can vote");
		}
	}
}
