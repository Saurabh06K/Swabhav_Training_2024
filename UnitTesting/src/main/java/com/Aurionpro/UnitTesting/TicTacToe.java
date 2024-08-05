package com.Aurionpro.UnitTesting;

import java.util.Scanner;

public class TicTacToe {
	static char[][] board = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
	static char currentPlayer = 'X';

	public static void main(String[] args) {
		int turnCount = 0;
		boolean gameWon = false;

		while (turnCount < 9 && !gameWon) {
			clearScreen();
			displayBoard();
			playerMove();
			gameWon = checkWin();
			if (gameWon) {
				clearScreen();
				displayBoard();
				System.out.println("Player " + currentPlayer + " wins!");
			} else if (turnCount == 8) {
				clearScreen();
				displayBoard();
				System.out.println("It's a draw!");
			} else {
				turnCount++;
				currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
			}
		}
	}

	static void displayBoard() {
		System.out.println("     |     |     ");
		System.out.println("  " + board[0][0] + "  |  " + board[0][1] + "  |  " + board[0][2] + "  ");
		System.out.println("_____|_____|_____");
		System.out.println("     |     |     ");
		System.out.println("  " + board[1][0] + "  |  " + board[1][1] + "  |  " + board[1][2] + "  ");
		System.out.println("_____|_____|_____");
		System.out.println("     |     |     ");
		System.out.println("  " + board[2][0] + "  |  " + board[2][1] + "  |  " + board[2][2] + "  ");
		System.out.println("     |     |     ");
	}

	static void playerMove() {
		Scanner scanner = new Scanner(System.in);
		int cell = 0;
		boolean validInput = false;

		while (!validInput) {
			System.out.print("Player " + currentPlayer + ", choose your cell (1-9): ");
			if (scanner.hasNextInt()) {
				cell = scanner.nextInt();
				validInput = cell >= 1 && cell <= 9 && isMoveValid(cell);
			} else {
				scanner.next();
			}
			if (!validInput) {
				System.out.println("Invalid move! Please try again.");
			}
		}

		updateBoard(cell);
	}

	static boolean isMoveValid(int choice) {
		int row = (choice - 1) / 3;
		int col = (choice - 1) % 3;
		return board[row][col] != 'X' && board[row][col] != 'O';
	}

	static void updateBoard(int choice) {
		int row = (choice - 1) / 3;
		int col = (choice - 1) % 3;
		board[row][col] = currentPlayer;
	}

	static boolean checkWin() {
		for (int i = 0; i < 3; i++) {
			if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer)
					|| (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
				return true;
			}
		}

		if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
				|| (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
			return true;
		}

		return false;
	}

	static void clearScreen() {
		System.out.flush();
	}

}
