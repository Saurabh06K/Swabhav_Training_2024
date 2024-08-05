package com.Aurionpro.Structural.Proxy.Model;

public class StudentTest {
	public static void main(String[] args) {
		IStudent student1 = new ProxyStudent("Saurabh", 60);
		IStudent student2 = new ProxyStudent("Rohit", 45);

		System.out.println("Details of student1:");
		student1.displayDetails();

		System.out.println("\nDetails of student2:");
		student2.displayDetails();

		System.out.println("\nDetails of student1 for second time:");
		student1.displayDetails();
		
		System.out.println("\nDetails of student1 for third time:");
		student1.displayDetails();
	}
}
