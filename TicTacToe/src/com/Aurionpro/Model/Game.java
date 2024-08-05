package com.Aurionpro.Model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game implements IPlayGame {

	private Board board = new Board();
	private Player currentPlayer = Player.X;
	private int turnCount = 0;
	private boolean gameWon = false;
	private Scanner scanner = new Scanner(System.in); // Use a single Scanner instance

	@Override
	public void start() {
		while (turnCount < 9 && !gameWon) {
			clearScreen();
			displayBoard();
			playerMove();
			gameWon = checkWin();
			if (gameWon) {
				clearScreen();
				displayBoard();
				System.out.println("Player " + currentPlayer.getSymbol() + " wins!");
				return;
			}
			if (turnCount == 8) {
				clearScreen();
				displayBoard();
				System.out.println("It's a draw!");
				return;
			}
			currentPlayer = (currentPlayer == Player.X) ? Player.O : Player.X;
		}
	}

	@Override
	public void displayBoard() {
		board.displayBoard();
	}

	@Override
	public void playerMove() {
		int cell = 0;
		boolean validInput = false;

		while (!validInput) {
			System.out.print("Player " + currentPlayer.getSymbol() + ", choose your cell (1-9): ");
			try {
				cell = scanner.nextInt();
				if (isMoveValid(cell, board)) {
					updateBoard(cell);
					validInput = true;
					return;
				}
				System.out.println("Cell is already occupied or invalid! Please choose a different cell.");
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please enter a number between 1 and 9.");
				scanner.next();
			}
		}
	}

	@Override
	public boolean checkWin() {
		return board.checkWin(currentPlayer);
	}

	@Override
	public boolean isMoveValid(int choice, Board board) {
		return choice >= 1 && choice <= 9 && board.isMoveValid(choice);
	}

	@Override
	public void updateBoard(int choice) {
		board.update(choice, currentPlayer);
		turnCount++;
	}

	public void clearScreen() {
		System.out.flush();
	}

}
