package com.Aurionpro.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 23, 54, 67, 89);

		numbers.stream()
			.forEach((number) -> System.out.println(number));

		List<Integer> filteredList = numbers.stream()
		.filter((number) -> (number % 2 != 0))
		.filter((number)-> (number>35))
		.collect(Collectors.toList());
		
		filteredList.forEach((number) -> System.out.println("Filtered List is: "+number));

		List<Integer> numberSquares = numbers.stream()
		.map((number)-> number*number)
		.collect(Collectors.toList());
		numberSquares.forEach((number)->System.out.println(number));
		
		int sum = numbers.stream().reduce(0, (number1, number2)->(number1+number2));
		System.out.println("The sum is: "+sum);
		
		System.out.println("Sorting in ascending order:");
		numbers.stream()
		.sorted()
		.forEach((number)->System.out.println(number));
		
		System.out.println("Sorting in descending order:");
		numbers.stream()
		.sorted(Collections.reverseOrder())
		.limit(3)
		.forEach((number)->System.out.println(number));
		
		Optional<Integer> max = numbers.stream().max((number1, number2)->(number1-number2));
		if(max.isPresent())
			System.out.println("Max is: "+max.get());
		
		Optional<Integer> min = numbers.stream().min((number1, number2)->(number1-number2));
		if(min.isPresent())
			System.out.println("Min is: "+min.get());
	}
}
