package com.Aurionpro.Model;

public interface IPlayGame {
	void start();
	void displayBoard();
	void playerMove();
	boolean checkWin();
	boolean isMoveValid(int choice, Board board);
	void updateBoard(int choice);
}
