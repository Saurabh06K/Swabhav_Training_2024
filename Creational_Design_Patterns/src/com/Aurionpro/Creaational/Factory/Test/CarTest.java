package com.Aurionpro.Creaational.Factory.Test;

import com.Aurionpro.Creaational.Factory.ICar;
import com.Aurionpro.Creaational.Factory.Model.CarFactory;
import com.Aurionpro.Creaational.Factory.Model.CarNames;
import com.Aurionpro.Creaational.Factory.Model.Mahindra;
import com.Aurionpro.Creaational.Factory.Model.Maruti;
import com.Aurionpro.Creaational.Factory.Model.Tata;

public class CarTest {
	public static void main(String[] args) {
		CarFactory car = new CarFactory();
		ICar CAR = car.getCar(CarNames.MARUTI);
		CAR.start();
	}
}
