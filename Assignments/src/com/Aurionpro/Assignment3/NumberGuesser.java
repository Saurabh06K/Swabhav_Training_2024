package com.Aurionpro.Assignment3;

import java.util.Scanner;

public class NumberGuesser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int randomNumber = (int) (Math.random() * 100) + 1;
		int lives = 5;
		int guess, i;
		Boolean playAgain = true;

		while (playAgain) {
			for (i = 0; i < lives; i++) {
				System.out.println("Guess the number");
				guess = sc.nextInt();

				if (guess == randomNumber) {
					System.out.println("Congratulations!" + " You won in attempt: " + (i+1));
					break;
				} else if (guess < randomNumber && i != lives - 1) {
					System.out.println("Sorry, Too Low");
				} else if (guess > randomNumber && i != lives - 1) {
					System.out.println("Sorry, Too High");
				}
			}

			if (i == lives) {
				System.out.println("No attempts left");
				System.out.println("The number was " + randomNumber);
			}

			// Consume the newline character left in the buffer
			sc.nextLine();

			System.out.println("Do you want to play again: yes/no ");
			String res = sc.nextLine();
			playAgain = res.equalsIgnoreCase("yes");
		}

	}
}
