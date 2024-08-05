package com.Aurionpro.Model;

public class Board {
	private char[][] board = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };

	public void displayBoard() {
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

	public void update(int choice, Player player) {
		int row = (choice - 1) / 3;
		int col = (choice - 1) % 3;
		board[row][col] = player.getSymbol();
	}

	public boolean isMoveValid(int choice) {
		int row = (choice - 1) / 3;
		int col = (choice - 1) % 3;
		return board[row][col] != Player.X.getSymbol() && board[row][col] != Player.O.getSymbol();
	}

	public boolean checkWin(Player player) {
		for (int i = 0; i < 3; i++) {
			if ((board[i][0] == player.getSymbol() && board[i][1] == player.getSymbol()
					&& board[i][2] == player.getSymbol())
					|| (board[0][i] == player.getSymbol() && board[1][i] == player.getSymbol()
							&& board[2][i] == player.getSymbol())) {
				return true;
			}
		}

		if ((board[0][0] == player.getSymbol() && board[1][1] == player.getSymbol()
				&& board[2][2] == player.getSymbol())
				|| (board[0][2] == player.getSymbol() && board[1][1] == player.getSymbol()
						&& board[2][0] == player.getSymbol())) {
			return true;
		}

		return false;
	}
}
