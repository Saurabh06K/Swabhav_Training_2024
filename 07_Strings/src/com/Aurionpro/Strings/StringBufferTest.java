package com.Aurionpro.Strings;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer name1 = new StringBuffer("Saurabh");
		System.out.println(name1.hashCode());
		name1.append("Kadam");
		System.out.println(name1.hashCode());
	}
}
