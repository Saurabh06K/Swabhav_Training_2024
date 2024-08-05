package com.Aurionpro.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.Aurionpro.Comparator.StudentComparator;
import com.Aurionpro.Model.Student;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(3, "Saurabh", 87));
		students.add(new Student(5, "Aditya", 92));
		students.add(new Student(1, "Rohit", 77));
		students.add(new Student(4, "Virat", 67));

		System.out.println("Before Sort: ");
		System.out.println(students);

		System.out.println("After Sort as per Roll Number: ");
		Collections.sort(students, new StudentComparator.RollNumberComparator());
		System.out.println(students);

		System.out.println("After Sort as per Percentage: ");
		Collections.sort(students, new StudentComparator.PercentageComparator());
		System.out.println(students);

		System.out.println("After Sort as per Name: ");
		Collections.sort(students, new StudentComparator.NameComparator());
		System.out.println(students);
	}
}
