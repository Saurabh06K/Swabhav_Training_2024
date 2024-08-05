package com.Aurionpro.Assignment2;

import java.util.Scanner;

public class TreasureFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose left or right: ");
		String direction = sc.nextLine();

		if (direction.equals("left")) {
			System.out.println("Choose weither to swim or wait: ");
			String decision = sc.next();
			if (decision.equals("wait")) {
				System.out.println("Choose color of the door: \nREd \nYellow \nBlue ");
				String doorColor = sc.next();
				if (doorColor.equals("Yellow")) {
					System.out.println("You Win!");
				} else if (doorColor.equals("Red")) {
					System.out.println("Burned by fire. \nGame Over.");
				} else if (doorColor.equals("Blue")) {
					System.out.println("Eaten by beasts. \nGame Over.");
				} else {
					System.out.println("Game Over");
				}
			} else {
				System.out.println("Attacked by trout. \nGame Over.");
			}
		} else {
			System.out.println("Fall into a Hole. \nGame Over.");
		}
	}
}
