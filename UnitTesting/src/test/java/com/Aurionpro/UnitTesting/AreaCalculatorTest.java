package com.Aurionpro.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AreaCalculatorTest {

	AreaCalculator calculator;

	@BeforeEach
	void init() {
		calculator = new AreaCalculator();
	}

	@AfterEach
	void status() {
		System.out.println("Tested Successfully!");
	}

	@Test
	void testCalculateArea() {
		assertEquals(78.5, calculator.calculateArea(5));
	}

}
