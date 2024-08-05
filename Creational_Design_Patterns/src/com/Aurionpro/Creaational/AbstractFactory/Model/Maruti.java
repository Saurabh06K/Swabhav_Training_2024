package com.Aurionpro.Creaational.AbstractFactory.Model;

public class Maruti implements ICars {

	@Override
	public void start() {
		System.out.println("Maruti Car Starts");
	}

	@Override
	public void stop() {
		System.out.println("Maruti Car Stops");
	}

}
