package com.Aurionpro.Test;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		Predicate<Integer> evenChecker = (Integer number) -> (number % 2 == 0);
		System.out.println(evenChecker.test(13));
		System.out.println(evenChecker.test(18));

		BiPredicate<Integer, Integer> greatestNumber = (number1, number2) -> {
			if (number1 > number2)
				return true;
			return false;
		};

		System.out.println(greatestNumber.test(13, 46));
		System.out.println(greatestNumber.test(38, 19));

	}
}
