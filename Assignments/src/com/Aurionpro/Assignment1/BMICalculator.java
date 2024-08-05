package com.Aurionpro.Assignment1;
import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your weight in kilograms: ");
		double weight = sc.nextDouble();
		System.out.println("Enter your height in metres: ");
		double height = sc.nextDouble();
		
		double BMI = weight / (height * height);
		System.out.println("Your BMI is: " + BMI);
	}
}
