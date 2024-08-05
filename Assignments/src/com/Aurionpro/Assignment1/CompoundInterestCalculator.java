


package com.Aurionpro.Assignment1;

import java.util.Scanner;

public class CompoundInterestCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount: ");
		int principal = sc.nextInt();
		System.out.println("Enter the rate of interest: ");
		double rateOfInterest = sc.nextDouble();
		System.out.println("Enter the number of years: ");
		int numberOfYears = sc.nextInt();

		double compoundInterest = principal * Math.pow(1 + (rateOfInterest / 100), numberOfYears) - principal;
		System.out.println("The simple interest is: " + compoundInterest);
	}
}
