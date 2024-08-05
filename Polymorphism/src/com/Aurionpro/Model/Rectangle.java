package com.Aurionpro.Model;

public class Rectangle extends Shape {
	@Override
	public void area() {
		double length = 10;
		double breadth = 12;
		System.out.println("The area of circle is: "+(length * breadth));
	}
}
