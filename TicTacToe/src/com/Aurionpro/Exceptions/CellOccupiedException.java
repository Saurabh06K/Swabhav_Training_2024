package com.Aurionpro.Exceptions;

public class CellOccupiedException extends RuntimeException {
	public String getMessage() {
        return "Invalid move! Please try again";
    }
}
