package com.Aurionpro.Model;

public class Demo {
	static private int a = 1;
	static private int b = 1;
	static private int c = 1;

	public static void increment() {
		a++;
		b++;
		c++;
	}

	public void display() {
		System.out.println("Value of a is: " + a + "\nValue of b is: " + b + "\nValue of c is:" + c);
	}

	{
		System.out.println("Welcome to Demo class");
	}
	
	static{
		System.out.println("I am static");
	}
}
