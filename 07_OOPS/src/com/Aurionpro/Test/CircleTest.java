package com.Aurionpro.Test;

import java.util.Scanner;

import com.Aurionpro.Model.Circle;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the radius: ");
		int radius = sc.nextInt();
		Circle c1 = new Circle(radius);
//		c1.setRadius(radius);
		System.out.println("The Area is: " + c1.areaCalculator());
	}

}
