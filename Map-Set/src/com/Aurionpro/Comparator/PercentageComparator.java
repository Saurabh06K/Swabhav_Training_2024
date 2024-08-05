package com.Aurionpro.Comparator;

import java.util.Comparator;

import com.Aurionpro.Model.Student;

public class PercentageComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		if (student1.getPercentage() > student2.getPercentage()) {
			return 1;
		}
		if (student1.getPercentage() < student2.getPercentage()) {
			return -1;
		}
		return 0;
	}

}
