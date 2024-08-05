package com.Aurionpro.Test;

import com.Aurionpro.Model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setAge(22);
		student1.setName("Saurabh");
		student1.setPercentage(90.78);
		student1.setAddress("Chembur");
		student1.setRollNumber(60);
		System.out.println(student1);
	}
}
