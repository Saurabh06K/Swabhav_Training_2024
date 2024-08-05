package com.Aurionpro.Creaational.Singleton.Test;

import com.Aurionpro.Creaational.Singleton.Model.Login;

public class LoginTest {
	public static void main(String[] args) {
		Login login1 = Login.getLogin();
		System.out.println(login1.hashCode());
		login1.status();
		
		Login login2 = Login.getLogin();
		System.out.println(login2.hashCode());
		login2.status();
	}
}
