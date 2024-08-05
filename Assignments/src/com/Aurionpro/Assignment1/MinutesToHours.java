package com.Aurionpro.Assignment1;

import java.util.Scanner;

public class MinutesToHours {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the minutes: ");
		long minutes = sc.nextLong();

		long hours = minutes / 60;
		long remainingMinutes = minutes % 60;

		System.out.println("The time is: " + hours + " hour and " + remainingMinutes + " minutes");
	}
}
