package com.Aurionpro.Test;

import com.Aurionpro.Model.IAddition;

public class IAdditionTest {
	public static void main(String[] args) {
		IAddition adder = (number1, number2) -> (number1 + number2);
		System.out.println(adder.add(6, 12));
	}
}
