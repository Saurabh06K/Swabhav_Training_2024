package com.Aurionpro.Test;

import java.util.Scanner;

import com.Aurionpro.Model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		s1.setName(name);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		s1.setAge(age);
		System.out.println("Enter percentage: ");
		Double percentage = sc.nextDouble();
		s1.setPercentage(percentage);

		System.out.println("The name of student is: " + s1.getName());
		System.out.println("Age is: " + s1.getAge());
		System.out.println("Percentage is: " + s1.getPercentage());
		System.out.println("Student's grade is: " + s1.getGrade(percentage));

		sc.nextLine();
		Student s2 = new Student();
		System.out.println("Enter name: ");
		name = sc.nextLine();
		s2.setName(name);
		System.out.println("Enter age: ");
		age = sc.nextInt();
		s2.setAge(age);
		System.out.println("Enter percentage: ");
		percentage = sc.nextDouble();
		s2.setPercentage(percentage);

		System.out.println("The name of student is: " + s2.getName());
		System.out.println("Age is: " + s2.getAge());
		System.out.println("Percentage is: " + s2.getPercentage());
		System.out.println("Student's grade is: " + s2.getGrade(percentage));
	}

}
