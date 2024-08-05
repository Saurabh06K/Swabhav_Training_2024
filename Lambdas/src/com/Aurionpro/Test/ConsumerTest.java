package com.Aurionpro.Test;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<Integer> consumer = (Integer number) -> System.out
				.println("The square of number is: " + (number * number));
		consumer.accept(12);
	}
}
