package com.Aurionpro.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.Aurionpro.Comparator.EmployeeComparator;
import com.Aurionpro.Model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of employees: ");
		int size = scanner.nextInt();
		List<Employee> employees = new ArrayList<Employee>();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter EmployeeId: ");
			int employeeId = scanner.nextInt();
			System.out.println("Enter Name: ");
			String name = scanner.next();
			System.out.println("Enter Salary: ");
			double salary = scanner.nextDouble();

			employees.add(new Employee(employeeId, name, salary));
		}

		System.out.println("Employee Details before sort: ");
		System.out.println(employees);

		System.out.println("Sorting by EmployeeId: ");
		Collections.sort(employees, new EmployeeComparator.EmployeeIdComparator());
		System.out.println(employees);

		System.out.println("Sorting by Name: ");
		Collections.sort(employees, new EmployeeComparator.NameComparator());
		System.out.println(employees);

		System.out.println("Sorting by Salary: ");
		Collections.sort(employees, new EmployeeComparator.SalaryComparator());
		System.out.println(employees);
	}
}
