package com.Aurionpro.Structural.Decorator.Test;

import com.Aurionpro.Structural.Decorator.Model.CarInspection;
import com.Aurionpro.Structural.Decorator.Model.ICarService;
import com.Aurionpro.Structural.Decorator.Model.OilChange;
import com.Aurionpro.Structural.Decorator.Model.WheelAllign;

public class CarServiceTest {
	public static void main(String[] args) {
		ICarService car1 = new CarInspection();
		System.out.println(car1.getCost());
		
		ICarService oilChangeCar1 = new OilChange(car1);
		System.out.println(oilChangeCar1.getCost());
		
		ICarService car2 = new CarInspection();
		System.out.println(car2.getCost());
		
		ICarService oilChangeCar2 = new OilChange(car2);
		System.out.println(oilChangeCar2.getCost());
		
		ICarService wheelAllignCar2 = new WheelAllign(car2);
		System.out.println(wheelAllignCar2.getCost());
	}
}
