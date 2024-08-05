package com.Aurionpro.Structural.Decorator.Model;

public class WheelAllign extends CarServiceDecorator {

	public WheelAllign(ICarService carobj) {
		super(carobj);
	}
	
	@Override
	public double getCost() {
		return super.getCost() + 400;
	}

}
