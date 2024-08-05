package com.Aurionpro.Model;

import com.Aurionpro.Exceptions.EmailNotValidException;
import com.Aurionpro.Exceptions.PasswordNotValidException;

public class User {
	private String email;
	private String password;

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void validateEmail(String email) {
		if (!email.contains("@") || !email.contains(".com") || !email.contains("."))
			throw new EmailNotValidException("Please Enter a Valid Email");

		System.out.println("Email validated Successfully");
	}

	public void valdiatePassword(String password) {
		boolean checkPasswordLength = checkPasswordLength(password);
		boolean checkNumber = checkNumber(password);
		boolean checkUpperCase = checkUpperCase(password);
		boolean checkSpecialCharacter = checkSpecialCharacter(password);

		if (checkPasswordLength && checkNumber && checkUpperCase && checkSpecialCharacter) {
			System.out.println("Password is Valid");
			return;
		}
		if (!checkPasswordLength)
			throw new PasswordNotValidException("Password length should contain atleast 8 characters");
		if (!checkNumber)
			throw new PasswordNotValidException("Password should have atleast One Number");
		if (!checkUpperCase)
			throw new PasswordNotValidException("Password should contain atleast one UpperCase Character");
		if (!checkSpecialCharacter)
			throw new PasswordNotValidException("Password should contain atleast one Special Character");
	}

	public static boolean checkPasswordLength(String password) {
		if (password.length() >= 8)
			return true;

		return false;
	}

	public static boolean checkNumber(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
				return true;
			}
		}
		return false;
	}

	public static boolean checkUpperCase(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
				return true;
			}
		}
		return false;
	}

	public static boolean checkSpecialCharacter(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (!(password.charAt(i) >= 48 && password.charAt(i) <= 57)
					&& !(password.charAt(i) >= 65 && password.charAt(i) <= 90)
					&& !(password.charAt(i) >= 97 && password.charAt(i) <= 122)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}
}
