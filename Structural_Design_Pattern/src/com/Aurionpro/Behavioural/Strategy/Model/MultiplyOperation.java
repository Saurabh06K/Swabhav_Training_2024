package com.Aurionpro.Behavioural.Strategy.Model;

public class MultiplyOperation implements IOperation {

	@Override
	public int doOperation(int a, int b) {
		return a * b;
	}

}
