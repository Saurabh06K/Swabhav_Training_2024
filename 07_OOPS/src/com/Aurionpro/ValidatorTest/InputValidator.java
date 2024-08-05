package com.Aurionpro.ValidatorTest;

public class InputValidator {
	public boolean validateInput(String input, int minLength, int maxLength) {
		if (input == null || input == "" || input.length() < minLength || input.length() > maxLength)
			return false;
		return true;
	}

	public boolean validatePassword(String password) {
		if (!validateInput(password, 8, 30))
			return false;
		String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?])(?=\\S+$).{8,}$";
		if (!password.contains((passwordRegex)))
			return false;
		return true;
	}

	public boolean validateEmail(String email) {
		if (!validateInput(email, 5, 50))
			return false;
		if (!email.contains("@") || !email.contains(".com"))
			return false;
		return true;
	}
}
