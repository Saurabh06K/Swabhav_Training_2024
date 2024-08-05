package com.Aurionpro.Structural.Decorator.Model;

public class OilChange extends CarServiceDecorator {

	public OilChange(ICarService carobj) {
		super(carobj);
	}
	@Override
	public double getCost() {
		return super.getCost() + 500;
	}

}
