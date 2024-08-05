package com.Aurionpro.Test;

public class BiConsumer {
	public static void main(String[] args) {
		java.util.function.BiConsumer<Integer, Integer> biConsumer = (number1, number2) -> System.out
				.println("The sum if numbers is: " + (number1 + number2));
		biConsumer.accept(12, 6);
	}
}
