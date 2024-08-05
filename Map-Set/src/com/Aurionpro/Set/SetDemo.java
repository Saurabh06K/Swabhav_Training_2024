package com.Aurionpro.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Saurabh");
		set.add("Rohit");
		set.add("Virat");
		set.add("Bumrah");
		System.out.println(set);

		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
		linkedset.add("Rahul");
		linkedset.add("Saurabh");
		linkedset.add("Rohit");
		System.out.println(linkedset);

		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("Saurabh");
		treeset.add("Shubham");
		treeset.add("Aditya");
		System.out.println(treeset);

		TreeSet<String> treeset2 = new TreeSet<String>();
		treeset2.add("Rahul");
		treeset2.add("Saurabh");
		treeset2.add("sourabh");
		treeset2.add("rohit");
		System.out.println(treeset2);

		treeset.addAll(treeset2);
		System.out.println(treeset);
		System.out.println(treeset2.pollFirst());

	}
}
