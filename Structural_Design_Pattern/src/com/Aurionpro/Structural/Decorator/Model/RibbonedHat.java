package com.Aurionpro.Structural.Decorator.Model;

public class RibbonedHat extends HatDecorator {
	
	public RibbonedHat(IHat hat) {
		super(hat);
	}
	
	public String getName() {
		return "Ribboned" +" "+ hat.getName();
	}
	
	public double getPrice() {
		return 20 + hat.getPrice(); 
	}
	
	public String getDescription() {
		return hat.getDescription() + " with Ribbon decoration";
	}
	
}
