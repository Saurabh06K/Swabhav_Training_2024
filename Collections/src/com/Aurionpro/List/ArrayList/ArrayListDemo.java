package com.Aurionpro.List.ArrayList;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		System.out.println(names.size());
		names.add("Saurabh");
		names.add("Aditya");
		names.add("Hemant");
		names.add("Rohit");
		names.add(2, "Virat");
		names.set(3, "Amey");
		System.out.println(names.indexOf("Rohit"));
		System.out.println(names.get(3));
		names.remove(1);
		System.out.println(names);
	}
}
