package com.Aurionpro.Test;
import com.Aurionpro.Model.*;

public class CalculatorTest {
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		
		CalculatorModel add = new CalculatorModel();
		add.Addition(a, b);
		CalculatorModel sub = new CalculatorModel();
		sub.Subtraction(a, b);
		CalculatorModel mul = new CalculatorModel();
		mul.Multiplication(a, b);
		CalculatorModel div = new CalculatorModel();
		div.Division(a, b);

	}
}
