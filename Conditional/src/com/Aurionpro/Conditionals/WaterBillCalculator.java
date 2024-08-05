package com.Aurionpro.Conditionals;

import java.util.Scanner;

public class WaterBillCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of units consumed: ");
		int units = sc.nextInt();
		int meterCharge = 75;
		int charge;

		if (units <= 100) {
			charge = units * 5;
		} else {
			if (units <= 250) {
				charge = (100 * 5) + ((units - 100) * 10);
			} else {
				charge = (100 * 5) + (150 * 10 + (units - 50) * 20);
			}
		}

		int TotalBill = charge + meterCharge;
		System.out.println("The total water meter bill is: " + TotalBill);
	}
}
