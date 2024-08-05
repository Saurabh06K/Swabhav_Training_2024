package com.Aurionpro.Creaational.AbstractFactory.Test;

import com.Aurionpro.Creaational.AbstractFactory.Model.ICarFactory;
import com.Aurionpro.Creaational.AbstractFactory.Model.ICars;
import com.Aurionpro.Creaational.AbstractFactory.Model.MarutiFactory;

public class CarTest {
	public static void main(String[] args) {
		ICarFactory marutiFactory = new MarutiFactory();
		ICars maruti = marutiFactory.makeCar();
		maruti.start();
		maruti.stop();
	}
}