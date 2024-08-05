package com.Aurionpro.Conditionals;

import java.util.Scanner;

public class SeasonChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Month: ");
		int monthNumber = sc.nextInt();
		switch (monthNumber) {
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Summer");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("Monsoon");
			break;
		case 10:
		case 11:
		case 12:
		case 1:
			System.out.println("Winter");
			break;
		default:
			System.out.println("Enter a valid number");
			break;
		}
	}
}