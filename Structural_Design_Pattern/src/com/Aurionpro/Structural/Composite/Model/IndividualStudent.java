package com.Aurionpro.Structural.Composite.Model;

public class IndividualStudent implements IStudent{
    private String name;
    private int rollNumber;

    public IndividualStudent(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

	@Override
	public void printDetails() {
		System.out.println("Student: " + name + ", Roll Number: " + rollNumber);
	}
}
