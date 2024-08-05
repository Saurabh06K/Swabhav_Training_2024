package com.Aurionpro.Conditionals;

import java.util.Scanner;

public class VowelChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your character: ");
		char character = sc.next().charAt(0);
		switch (character) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("It is a vowel");
			break;
		default:
			System.out.println("It is not a vowel");
			break;
		}
	}
}
