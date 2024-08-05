package com.Aurionpro.Behavioural.Strategy.Model;

public class OperationTest {
	public static void main(String[] args) {
		OperationStrategy op = new OperationStrategy(new AddOperation());
		op.doOperation(12, 6);
		op.setOperation(new MultiplyOperation());
		op.doOperation(3, 4);
	}
}
