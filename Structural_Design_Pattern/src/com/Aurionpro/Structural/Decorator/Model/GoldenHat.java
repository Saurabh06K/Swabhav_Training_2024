package com.Aurionpro.Structural.Decorator.Model;

public class GoldenHat extends HatDecorator {

	public GoldenHat(IHat hat) {
		super(hat);
	}
	
	public String getName() {
		return "Golden" +" "+ hat.getName();
	}
	
	public double getPrice() {
		return 30 + hat.getPrice(); 
	}
	
	public String getDescription() {
		return hat.getDescription() + " with Golden decoration";
	}

}
