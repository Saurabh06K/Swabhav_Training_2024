package com.Aurionpro.Creaational.AbstractFactory.Model;

public class TataFactory implements ICarFactory {

	ICars car = null;
	
	@Override
	public ICars makeCar() {
		car = new Tata();
		return car;
	}

}
