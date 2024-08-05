package com.Aurionpro.Structural.Proxy.Model;

public class ProxyStudent implements IStudent {
    private String name;
    private int rollNumber;
    private RealStudent realStudent;

    public ProxyStudent(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public void displayDetails() {
        if (realStudent == null) {
            realStudent = new RealStudent(name, rollNumber);
        }
        realStudent.displayDetails();
    }
}
