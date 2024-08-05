package com.Aurionpro.Test;

import java.util.Scanner;

import com.Aurionpro.Exceptions.AgeNotValidException;
import com.Aurionpro.Model.Voter;

public class VoterTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter VoterID: ");
		int voterId = scanner.nextInt();
		System.out.println("Enter First Name: ");
		String firstName = scanner.next();
		System.out.println("Enter Last Name: ");
		String lastName = scanner.next();
		System.out.println("Enter age");
		int age = scanner.nextInt();

		try {
			Voter voter1 = new Voter(voterId, firstName, lastName, age);
			System.out.println(voter1);
		} catch (AgeNotValidException exception) {
			exception.getMessage();
		}
	}
}
