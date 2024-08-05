package com.Aurionpro.Model;

public class Student {
	private String name;
	private int age;
	private double percentage;

	public void setName(String n) {
		name = n;
	}

	public void setAge(int a) {
		age = a;
	}

	public void setPercentage(Double p) {
		percentage = p;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getPercentage() {
		return percentage;
	}

	public String getGrade(Double p) {
		if (p > 75) {
			return "A";
		} else if (p >= 60 && p <= 75) {
			return "B";
		} else if (p >= 50 && p <= 60) {
			return "C";
		} else if (p >= 50 && p <= 40) {
			return "D";
		} else {
			return "F";
		}
	}
}
