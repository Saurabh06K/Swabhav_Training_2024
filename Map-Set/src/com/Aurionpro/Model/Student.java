package com.Aurionpro.Model;

public class Student {
	private int RollNumber;
	private String Name;
	private double percentage;

	public Student(int rollNumber, String name, double percentage) {
		super();
		RollNumber = rollNumber;
		Name = name;
		this.percentage = percentage;
	}

	public int getRollNumber() {
		return RollNumber;
	}

	public void setRollNumber(int rollNumber) {
		RollNumber = rollNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "\nStudent [RollNumber=" + RollNumber + ", Name=" + Name + ", percentage=" + percentage + "]";
	}

}
