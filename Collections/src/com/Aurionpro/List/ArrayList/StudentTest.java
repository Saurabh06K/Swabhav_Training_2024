package com.Aurionpro.List.ArrayList;

import com.Aurionpro.List.Model.Student;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Student> students = new ArrayList<Student>();
		for (int i = 0; i < students.size(); i++) {
			System.out.println("Enter Roll number: ");
			int rollNumber = scanner.nextInt();
			System.out.println("Enter name for index: ");
			String name = scanner.next();
			System.out.println("Enter Percentage: ");
			double percentage = scanner.nextDouble();
			students.add(new Student(rollNumber, name, percentage));
		}


		System.out.println("The elements are: ");
		for (Student student : students) {
			System.out.println(student);
		}

		ListIterator<Student> studentListIterator = students.listIterator();

		while (studentListIterator.hasNext()) {
			System.out.println(studentListIterator.next());
		}
		while (studentListIterator.hasPrevious()) {
			System.out.println(studentListIterator.previous());
		}
	}
}
