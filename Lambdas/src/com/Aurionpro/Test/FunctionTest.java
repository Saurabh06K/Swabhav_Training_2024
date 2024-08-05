package com.Aurionpro.Test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<Integer, Integer> squareNumber = (Integer number) -> number * number;
		method(squareNumber);

		BiFunction<Integer, Integer, Integer> sumOfNumbers = (number1, number2) -> (number1 + number2);
		System.out.println("The sum is: " + sumOfNumbers.apply(12, 6));
	}

	private static void method(Function<Integer, Integer> squareNumber) {
		System.out.println("The square of the number is: " + squareNumber.apply(12));
	}
}
