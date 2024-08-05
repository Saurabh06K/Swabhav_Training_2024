package com.Aurionpro.Structural.Proxy.Model;

public class RealStudent implements IStudent {
    private String name;
    private int rollNumber;

    public RealStudent(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        loadFromDatabase();
    }

    private void loadFromDatabase() {
        System.out.println("Loading student details from database for: " + name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Student: " + name + ", Roll Number: " + rollNumber);
    }
}
