package com.Aurionpro.Assignment2;

import java.util.Scanner;

public class RideBillCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your height in centimetres: ");
		int height = sc.nextInt();
		int bill;

		if (height > 120) {
			System.out.println("Can Ride. \nEnter your age: ");
			int age = sc.nextInt();

			// For age under 12
			if (age < 12) {
				bill = 5;
				System.out.println("Want Photos? \nYes \nNo");
				String response = sc.next();
				if (response.equals("Yes")) {
					bill += 3;
					System.out.println("The total bill is: " + bill);
				} else {
					System.out.println("The total bill is: " + bill);
				}
			}

			// For age between 12 and 18
			else if (age >= 12 && age < 18) {
				bill = 7;
				System.out.println("Want Photos? \nYes \nNo");
				String response = sc.next();
				if (response.equals("Yes")) {
					bill += 3;
					System.out.println("The total bill is: " + bill);
				} else {
					System.out.println("The total bill is: " + bill);
				}
			}

			// For age above 18 or over
			else if (age >= 18 && age < 45) {
				bill = 12;
				System.out.println("Want Photos? \nYes \nNo");
				String response = sc.next();
				if (response.equals("Yes")) {
					bill += 3;
					System.out.println("The total bill is: " + bill);
				} else {
					System.out.println("The total bill is: " + bill);
				}
			}

			// For age between 45 and 55
			else if (age >= 45 && age <= 55) {
				bill = 0;
				System.out.println("Want Photos? \nYes \nNo");
				String response = sc.next();
				if (response.equals("Yes")) {
					bill += 3;
					System.out.println("The total bill is: " + bill);
				} else {
					System.out.println("The total bill is: " + bill);
				}
			}

		} else {
			System.out.println("Can't Ride");
		}
	}
}
