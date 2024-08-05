package com.Aurionpro.Creaational.AbstractFactory.Model;

public class Tata implements ICars {
	@Override
	public void start() {
		System.out.println("Tata Car Starts");
	}

	@Override
	public void stop() {
		System.out.println("Tata Car Stops");
	}
}
