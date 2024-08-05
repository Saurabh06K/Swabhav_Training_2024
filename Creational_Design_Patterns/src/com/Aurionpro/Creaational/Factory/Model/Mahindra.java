package com.Aurionpro.Creaational.Factory.Model;

import com.Aurionpro.Creaational.Factory.ICar;

public class Mahindra implements ICar {
	
	@Override
	public void start() {
		System.out.println("Mahindra Car Starts");
	}

	@Override
	public void stop() {
		System.out.println("Mahindra Car Stops");
	}
}
