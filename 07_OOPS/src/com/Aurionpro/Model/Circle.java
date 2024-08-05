package com.Aurionpro.Model;

public class Circle {
	private int radius;

	public Circle() {

	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double areaCalculator() {
		return 3.14 * radius * radius;
	}
}
