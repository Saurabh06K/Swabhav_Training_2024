package com.Aurionpro.Creaational.Singleton.Model;

public class Login {

	private static Login Login;

	private Login() {
		System.out.println("Login created");
	}

	public void status() {
		System.out.println("Login successful");
	}

	public static Login getLogin() {
		if (Login == null)
			Login = new Login();
		return Login;
	}
}
