package com.Aurionpro.Test;

import java.util.Scanner;

import com.Aurionpro.Model.PigDiceApp;

public class PigDiceTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		PigDiceApp pigdice = new PigDiceApp();
		do {
			System.out.println("Roll or Hold a Dice? \n(r/h)");
			char option = scanner.nextLine().charAt(0);
			rollOrHold(pigdice, option);
			checkTotalScore(pigdice);
		} while (pigdice.getTotalScore() < 20);
	}

	public static void rollOrHold(PigDiceApp pigdice, char option) {
		if (option == 'r') {
			pigdice.rolling();
			return;
		}
		if (option == 'h') {
			pigdice.onHold();
			return;
		}
	}

	public static void checkTotalScore(PigDiceApp pigdice) {
		if (pigdice.getTotalScore() >= 20)
			System.out.println("You finished in " + pigdice.getTurnNumber() + " turns!\nGame Over!");
	}
}
