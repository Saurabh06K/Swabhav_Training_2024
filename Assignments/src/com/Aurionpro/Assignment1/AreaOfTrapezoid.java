package com.Aurionpro.Assignment1;
import java.util.Scanner;

public class AreaOfTrapezoid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base1 of trapezoid: ");
		double base1 = sc.nextDouble();
		System.out.println("Enter base2 of trapezoid: ");
		double base2 = sc.nextDouble();
		System.out.println("Enter height of trapezoid: ");
		double height = sc.nextDouble();
		
		double area = ((base1 + base2) / 2) * height;
		System.out.println("The area of trapezoid is: " + area);
	}
}
