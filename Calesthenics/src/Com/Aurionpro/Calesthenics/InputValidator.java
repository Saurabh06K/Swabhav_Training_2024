package Com.Aurionpro.Calesthenics;

public class InputValidator {
	
	public InputValidator() {
		
	}
	
	public static Boolean validateUsername(String username) {
		int length = username.length();
		if(username==null || username==" " || (length<=3 && length>=20))
			return false;
		System.out.println("Username Validated");
		return true;
	}
	
	public static Boolean validatePassword(String password) {
		int length = password.length();
		if(password==null || password==" " || (length<=8 && length>=30))
			return false;
		System.out.println("Password Validated");
		return true;
	}
	
	public static Boolean validateEmail(String email) {
		int length = email.length();
		if(email==null || email==" " || (length<=5 && length>=50) || !email.contains("@") || !email.contains("."))
			return false;
		System.out.println("Password Validated");
		return true;
	}
}
