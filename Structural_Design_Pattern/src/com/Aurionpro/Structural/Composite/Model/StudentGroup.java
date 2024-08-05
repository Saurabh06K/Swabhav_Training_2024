package com.Aurionpro.Structural.Composite.Model;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup implements IStudent {
    private List<IStudent> students = new ArrayList<>();

    public void addStudent(IStudent student) {
        students.add(student);
    }

    public void removeStudent(IStudent student) {
        students.remove(student);
    }

    @Override
    public void printDetails() {
        for (IStudent student : students) {
            student.printDetails();
        }
    }
}
