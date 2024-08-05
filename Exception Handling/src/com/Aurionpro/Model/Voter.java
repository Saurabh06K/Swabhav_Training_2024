package com.Aurionpro.Model;

import com.Aurionpro.Exceptions.AgeNotValidException;

public class Voter {

	private int voterId;
	private String firstName;
	private String lastName;
	private int age;

	public Voter(int voterId, String firstName, String lastName, int age) {
		super();
		this.voterId = voterId;
		this.firstName = firstName;
		this.lastName = lastName;
		if (age < 18) {
			try {
				throw new AgeNotValidException();
			} catch (AgeNotValidException exception) {
				System.out.println(exception.getMessage());
			}
		}
		this.age = age;
	}

	public int getVoterId() {
		return voterId;
	}

	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 18) {
			throw new AgeNotValidException();
		}
		this.age = age;
	}

	@Override
	public String toString() {
		return "Voter [voterId=" + getVoterId() + ", firstName=" + getFirstName() + ", lastName=" + getLastName()
				+ ", age=" + getAge() + "]";
	}
}
