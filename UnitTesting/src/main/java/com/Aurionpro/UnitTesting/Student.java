package com.Aurionpro.UnitTesting;

public class Student {
	IStudentService studentService;
	
	
	
	public Student(IStudentService studentService) {
		super();
		this.studentService = studentService;
	}



	double getPercentage() {
		return studentService.getTotalMarks()/studentService.getTotalSybjects();
	}
}
