package com.Aurionpro.Strings;

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder name1 = new StringBuilder("Saurabh");
		System.out.println(name1.hashCode());
		name1.append("Kadam");
		System.out.println(name1.hashCode());
	}
}
