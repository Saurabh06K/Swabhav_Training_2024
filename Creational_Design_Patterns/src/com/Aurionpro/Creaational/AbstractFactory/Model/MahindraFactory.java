package com.Aurionpro.Creaational.AbstractFactory.Model;

public class MahindraFactory implements ICarFactory {

	ICars car = null;
	
	@Override
	public ICars makeCar() {
		car = new Mahindra();
		return car;
	}

}
