package com.Aurionpro.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class StudentTest {
	
	IStudentService studentService;
	Student student;
	
	@BeforeEach
	void init() {
		studentService = Mockito.mock(IStudentService.class);
	}

	@Test
	void testGetPercentage() {
		student = new Student(studentService);
		Mockito.when(studentService.getTotalMarks()).thenReturn(650);
		Mockito.when(studentService.getTotalSybjects()).thenReturn(10);
		assertEquals(65, student.getPercentage());
	}

}
 