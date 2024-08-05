package com.Aurionpro.Practise;
import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter number2: ");
		int n2 = sc.nextInt();
		int sum = n1+n2;
		System.out.println("The sum of "+n1+ " and "+n2+ " is "+ sum);
	}
}
