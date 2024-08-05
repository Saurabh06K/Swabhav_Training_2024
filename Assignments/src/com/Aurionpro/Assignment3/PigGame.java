package com.Aurionpro.Assignment3;

import java.util.*;

public class PigGame {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int turnScore = 0;
		int totalScore = 0;
		int turnNumber = 0;

		do {
			System.out.println("Roll or Hold a dice?(roll/hold)");
			String choice = scanner.next();
			if (choice.equalsIgnoreCase("roll")) {
				onRoll(random, turnScore, totalScore, turnNumber);
			} else if (choice.equalsIgnoreCase("hold")) {
				onHold(random, turnScore, totalScore, turnNumber);
			}
		} while (totalScore < 20);

	}

	private static int onHold(Random random, int turnScore, int totalScore, int turnNumber) {
		totalScore += turnScore;
		displayScores(turnScore, totalScore);
		turnScore = 0;
		turnNumber++;
		if (totalScore >= 20) {
			System.out.println("You finished in " + turnNumber + " turns!\nGame Over!");
		}
		return totalScore;
	}

	public static int onRoll(Random random, int turnScore, int totalScore, int turnNumber) {
		int dice = rollDice(random);
		System.out.println(dice);

		if (dice == 1) {
			turnScore = 0;
			turnNumber++;
			System.out.println("Turn Over.\nNo Score.");
			return turnScore;
		}
		turnScore += dice;
		displayScores(turnScore, totalScore);
		return turnScore;
	}

	public static int rollDice(Random random) {
		return random.nextInt(6) + 1;
	}

	public static void displayScores(int turnScore, int totalScore) {
		System.out.println("Score for turn: " + turnScore);
		System.out.println("Total Score: " + totalScore);
	}
}
