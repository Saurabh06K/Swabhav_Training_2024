package com.Aurionpro.Model;

public class Student extends Person {
	private int rollNumber;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Student [rollNumber: " + rollNumber + ", address: " + address + ", percentage: " + percentage
				+ ", Name: " + getName() + ", Age: " + getAge()+"]";
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	private String address;
	private Double percentage;

}
