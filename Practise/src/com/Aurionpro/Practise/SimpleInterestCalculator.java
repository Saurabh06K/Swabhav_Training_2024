package com.Aurionpro.Practise;

import java.util.*;

public class SimpleInterestCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount: ");
		int principal = sc.nextInt();
		System.out.println("Enter the rate of interest: ");
		double rateOfInterest = sc.nextDouble();
		System.out.println("Enter the number of years: ");
		int numberOfYears = sc.nextInt();

		double simpleInterest = (principal * rateOfInterest * numberOfYears) / 100;
		System.out.println("The simple interest is: " + simpleInterest);
	}
}
