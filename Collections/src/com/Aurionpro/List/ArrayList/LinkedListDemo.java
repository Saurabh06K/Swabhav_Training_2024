package com.Aurionpro.List.ArrayList;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(12);
		numbers.add(45);
		numbers.add(1, 78);
		numbers.addFirst(10);
		numbers.addLast(23);

		for (Integer number : numbers) {
			System.out.println(number);
		}
		
		numbers.contains(78);
		numbers.clone();
	}
}
