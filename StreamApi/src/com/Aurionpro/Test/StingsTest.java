package com.Aurionpro.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.stream.Collectors;

public class StingsTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jayesh", "Nimesh", "Mark", "Mahesh", "Ramesh");
		
		names.stream().forEach((name)->System.out.println(name));
		
		System.out.println("Top 3 Students in ascending order: ");
		names.stream()
		.sorted()
		.limit(3)
		.forEach((name)->System.out.println(name));
		
		System.out.println("Names in ascending containing a: ");
		names.stream()
		.filter((name)->(name.contains("a")))
		.sorted()
		.forEach((name)->System.out.println(name));
		
		System.out.println("Students in descending order: ");
		names.stream()
		.sorted(Collections.reverseOrder())
		.forEach((name)->System.out.println(name));
		
		System.out.println("First 3 characters of all names: ");
		List<String> firstThreeCharacters = names.stream()
		.map((name)->name.substring(0, 3))
		.collect(Collectors.toList());
		System.out.println(firstThreeCharacters);
		
		List<String> namesWithFourCharacters = names.stream()
		.filter((name)->(name.length()<=4))
		.collect(Collectors.toList());
		System.out.println(namesWithFourCharacters);
	}
}
