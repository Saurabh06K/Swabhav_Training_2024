package com.Aurionpro.Creaational.AbstractFactory.Model;

public class Mahindra implements ICars {
	@Override
	public void start() {
		System.out.println("Mahindra Car Starts");
	}

	@Override
	public void stop() {
		System.out.println("Mahindra Car Stops");
	}
}
