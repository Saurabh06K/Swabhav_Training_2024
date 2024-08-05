package com.Aurionpro.Test;

import java.util.Scanner;

import com.Aurionpro.Exceptions.EmailNotValidException;
import com.Aurionpro.Exceptions.PasswordNotValidException;
import com.Aurionpro.Model.User;

public class UserTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Enter Email");
			String email = scanner.next();
			System.out.println("Enter Passowrd");
			String password = scanner.next();

			User user = new User(email, password);
			user.validateEmail(email);
			user.valdiatePassword(password);
			System.out.println(user);
		} catch (EmailNotValidException exception) {
			System.out.println(exception.getMessage());
		} catch (PasswordNotValidException exception) {
			System.out.println(exception.getMessage());
		}

		scanner.close();
	}
}
