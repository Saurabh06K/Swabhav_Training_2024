package com.Aurionpro.Comparator;

import java.util.Comparator;

import com.Aurionpro.Model.Employee;

public class EmployeeComparator {
	public static class EmployeeIdComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee employee1, Employee employee2) {
			if (employee1.getEmployeeId() > employee2.getEmployeeId()) {
				return 1;
			}
			if (employee1.getEmployeeId() < employee2.getEmployeeId()) {
				return -1;
			}
			return 0;
		}

	}

	public static class NameComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee employee1, Employee employee2) {
			return employee1.getName().compareTo(employee2.getName());
		}

	}

	public static class SalaryComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee employee1, Employee employee2) {
			if (employee1.getSalary() > employee2.getSalary()) {
				return 1;
			}
			if (employee1.getSalary() < employee2.getSalary()) {
				return -1;
			}
			return 0;
		}

	}


}
