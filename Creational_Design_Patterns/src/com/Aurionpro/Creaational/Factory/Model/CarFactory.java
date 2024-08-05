package com.Aurionpro.Creaational.Factory.Model;

import com.Aurionpro.Creaational.Factory.ICar;

public class CarFactory {
	ICar car = null;
	
	public ICar getCar(CarNames carName) {
		if(carName == (CarNames.MARUTI))
			car = new Maruti();
		if(carName == (CarNames.TATA))
			car = new Tata();
		if(carName == (CarNames.MAHINDRA))
			car = new Mahindra();
		return car;
	}
}
