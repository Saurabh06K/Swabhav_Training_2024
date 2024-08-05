package com.Aurionpro.Test;

import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		Supplier<Integer> randomNumber = () -> (int) (Math.random() * 1000);
		System.out.println("The number generated is: " + randomNumber.get());
	}
}
