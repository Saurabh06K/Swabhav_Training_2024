package com.Aurionpro.Test;

import com.Aurionpro.Model.IFactorial;

public class IFactorialTest {
	public static void main(String[] args) {
		IFactorial factorial = (number) -> {
			int fact = 1;
			for (int i = number; i >= 1; i--) {
				fact *= i;
			}
			return fact;
		};

		System.out.println(factorial.fact(5));
	}
}
