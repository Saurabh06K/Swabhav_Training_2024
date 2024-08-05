package com.Aurionpro.Creaational.Factory.Model;

import com.Aurionpro.Creaational.Factory.ICar;

public class Maruti implements ICar {

	@Override
	public void start() {
		System.out.println("Maruti Car Starts");
	}

	@Override
	public void stop() {
		System.out.println("Maruti Car Stops");
	}

}
