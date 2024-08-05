package com.Aurionpro.Conditionals2;

import java.util.Scanner;

public class OddNumberPrinter {
	public static void main(String[] args) {
		int number = 1;
		while (number <= 100) {
			if (number % 2 != 0) {
				System.out.println(number);
			}
			number++;
		}
	}
}
