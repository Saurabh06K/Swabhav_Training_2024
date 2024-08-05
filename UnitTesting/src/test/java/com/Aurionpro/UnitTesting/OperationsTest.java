package com.Aurionpro.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {
	
	Operations operation;
	
	@BeforeEach
	void init() {
		operation = new Operations();
	}
	
	@AfterEach
	void status() {
		System.out.println("Test passed!");
	}

	@Test
	public void testAddition() {
		assertEquals(30, operation.addition(20, 10));
	}
	
	@Test
	public void testSubtraction() {
		assertEquals(30, operation.subtraction(50, 20));
	}
	
	@Test
	public void testMultiplication() {
		assertEquals(1000, operation.multiplication(50, 20));
	}
	
	@Test
	public void testDivision() {
		assertEquals(2, operation.division(40, 20));
		assertThrows(ArithmeticException.class, () -> operation.division(10, 0));
	}
	
	@Test
	public void testSquareOfArrayElements() {
		int squares[] = {25, 36, 49};
		int numbers[] = {5, 6, 7};
		assertArrayEquals(squares, operation.squareOfArrayElements(numbers));
	}
	
//	@Test
//	public void testIsEven() {
//		assertTrue();
//		assertFalse();
//	}

}
