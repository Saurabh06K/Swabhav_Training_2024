package com.Aurionpro.Model;

public class Employee {
	private int employeeId;
	private String name;
	private int salary;
	
	public Employee(int employeeId, String name, int salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public int getSalary() {
		return salary;
	}
}
