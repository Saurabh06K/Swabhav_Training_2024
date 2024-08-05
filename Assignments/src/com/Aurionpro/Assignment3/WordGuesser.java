package com.Aurionpro.Assignment3;

import java.util.Random;
import java.util.Scanner;

public class WordGuesser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.print("Enter the desired word length: ");
		int length = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		String word = "";
		for (int i = 1; i <= length; i++) {

			int no = random.nextInt(26) + 97;

			char ch = (char) no;
			word += ch;
		}

		System.out.println(word);

		char[] guessedLetters = new char[length];
		for (int i = 0; i < length; i++) {
			guessedLetters[i] = '_';
		}

		int attempts = length * 3;
		while (attempts > 0) {
			System.out.println("Current word: " + new String(guessedLetters));
			System.out.print("Guess a letter: ");
			char guess = scanner.nextLine().charAt(0);

			if (word.contains(String.valueOf(guess))) {
				for (int i = 0; i < length; i++) {
					if (word.charAt(i) == guess) {
						guessedLetters[i] = guess;
					}
				}
			} else {
				System.out.println("Incorrect guess. Try again.");
				attempts--;
			}

			if (new String(guessedLetters).equals(word)) {
				System.out.println("Congratulations! You guessed the word: " + word);
				System.out.println("Total attempts: " + (length * 3 - attempts));
				break;
			}
		}

		if (attempts == 0) {
			System.out.println("Game Over! You haven't left with any attempts.");
		}
	}

	public static String generateRandomWord(int length) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder word = new StringBuilder();

		for (int i = 0; i < length; i++) {
			Random random = null;
			int index = random.nextInt(alphabet.length());
			word.append(alphabet.charAt(index));
		}

		return word.toString();
	}
}
