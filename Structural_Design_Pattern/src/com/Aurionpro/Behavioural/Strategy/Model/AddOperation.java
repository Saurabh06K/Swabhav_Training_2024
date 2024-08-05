package com.Aurionpro.Behavioural.Strategy.Model;

public class AddOperation implements IOperation {

	@Override
	public int doOperation(int a, int b) {
		return a + b;
	}

}
