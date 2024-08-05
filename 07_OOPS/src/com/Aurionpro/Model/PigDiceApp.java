package com.Aurionpro.Model;

import java.util.Random;

public class PigDiceApp {
	private int turnScore = 0;
	private int totalScore = 0;
	private int turnNumber = 0;

	public static int rollDice() {
		Random random = new Random();
		return random.nextInt(6) + 1;
	}

	public int getTurnNumber() {
		return turnNumber;
	}

	public void setTurnNumber(int turnNumber) {
		this.turnNumber = turnNumber;
	}

	public void onRoll(int dice) {

		if (dice != 1) {
			turnScore += dice;
			System.out.println("TurnScore: " + turnScore);
			return;
		}
		turnScore = 0;
		turnNumber += 1;
		System.out.println("Turn Over.\nNo Score.");
	}

	public void onHold() {
		totalScore += turnScore;
		turnScore = 0;
		turnNumber += 1;
		System.out.println("Your Total Score is " + totalScore);

	}

	public void rolling() {
		int dice = PigDiceApp.rollDice();
		System.out.println("Dice: " + dice);
		onRoll(dice);
	}

	public int getTotalScore() {

		return totalScore;
	}
}