package com.Aurionpro.Structural.Composite.Model;

public class StudentTest {
    public static void main(String[] args) {

        IStudent student1 = new IndividualStudent("Saurabh", 12);
        IStudent student2 = new IndividualStudent("Rohit", 45);
        IStudent student3 = new IndividualStudent("Virat", 18);

        StudentGroup group1 = new StudentGroup();
        group1.addStudent(student1);
        group1.addStudent(student2);
        System.out.println("Details of group-1:");
        group1.printDetails();

        StudentGroup group2 = new StudentGroup();
        group2.addStudent(student3);
        group2.addStudent(group1);
        System.out.println("Details of group-2:");
        group2.printDetails();
    }
}

