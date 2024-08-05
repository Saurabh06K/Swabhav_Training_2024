package com.Aurionpro.Creaational.Factory.Model;

import com.Aurionpro.Creaational.Factory.ICar;

public class Tata implements ICar {
	
	@Override
	public void start() {
		System.out.println("Tata Car Starts");
	}

	@Override
	public void stop() {
		System.out.println("Tata Car Stops");
	}
}
