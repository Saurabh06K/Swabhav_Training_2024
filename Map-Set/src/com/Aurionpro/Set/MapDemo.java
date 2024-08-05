package com.Aurionpro.Set;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "Saurabh");
		hashmap.put(2, "Rahul");
		hashmap.put(3, "Rohit");
		hashmap.put(null, "Hello");
		System.out.println(hashmap);

		Map<Integer, String> linkedhash = new LinkedHashMap<Integer, String>();
		linkedhash.put(1, "Aditya");
		linkedhash.put(6, "Saurabh");
		linkedhash.put(6, "Hello");
		linkedhash.put(3, null);
		linkedhash.put(4, null);
		System.out.println(linkedhash);

		Map<Integer, String> treemap = new TreeMap<Integer, String>();
		treemap.put(2, "Hello");
		// treemap.put(null, "Hi");
		System.out.println(treemap);

		Set<Entry<Integer, String>> entries = hashmap.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	}
}
