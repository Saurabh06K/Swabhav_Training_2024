package com.Aurionpro.Test;

import java.util.Scanner;

import com.Aurionpro.Model.Employee;
import com.Aurionpro.Model.Student;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Employee 1

		System.out.println("Enter name: ");
		String name = sc.nextLine();
		// emp1.setName(name);
		System.out.println("Enter Employee Id: ");
		int id = sc.nextInt();
		// emp1.setEmployeeId(id);
		System.out.println("Enter salary: ");
		int salary = sc.nextInt();
		// emp1.setSalary(salary);
		Employee emp1 = new Employee(id, name, salary);

		System.out.println("The name of Employee is: " + emp1.getName());
		System.out.println("Employee Id is: " + emp1.getEmployeeId());
		System.out.println("Salary is: " + emp1.getSalary());

		// Employee 2
		sc.nextLine();
		System.out.println("Enter name: ");
		name = sc.nextLine();
		// emp2.setName(name);
		System.out.println("Enter Employee Id: ");
		id = sc.nextInt();
		// emp2.setEmployeeId(id);
		System.out.println("Enter salary: ");
		salary = sc.nextInt();
		// emp2.setSalary(salary);
		Employee emp2 = new Employee(id, name, salary);

		System.out.println("The name of Employee is: " + emp2.getName());
		System.out.println("Employee Id is: " + emp2.getEmployeeId());
		System.out.println("Salary is: " + emp2.getSalary());
	}

}
