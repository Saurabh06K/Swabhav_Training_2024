package com.Aurionpro.Comparator;

import java.util.Comparator;

import com.Aurionpro.Model.Student;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return student1.getName().compareTo(student2.getName());
	}

}
