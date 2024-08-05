package com.Aurionpro.Strings;

public class StringEqualTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "AB";
		String name2 = "AB";
		String name3 = "B";

		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		name3 = name3 + "M";
		System.out.println(name3.hashCode());

		System.out.println(name1 == name2);

	}

}
