package com.Aurionpro.Practise2;

public class SimpleInterestCalculator {
	public static void main(String[] args) {
		int principal = Integer.parseInt(args[0]);
		double rateOfInterest = Integer.parseInt(args[1]);
		int numberOfYears = Integer.parseInt(args[2]);

		double simpleInterest = (principal * rateOfInterest * numberOfYears) / 100;
		System.out.println("The simple interest is: " + simpleInterest);
	}
}
