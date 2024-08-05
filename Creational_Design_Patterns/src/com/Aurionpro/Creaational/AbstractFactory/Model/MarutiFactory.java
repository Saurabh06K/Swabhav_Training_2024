package com.Aurionpro.Creaational.AbstractFactory.Model;

public class MarutiFactory implements ICarFactory {
	
	ICars car = null;

	@Override
	public ICars makeCar() {
		car = new Maruti();
		return car;
	}

}
