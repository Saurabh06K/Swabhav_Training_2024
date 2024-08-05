package com.Aurionpro.Creaational.Builder;

public class BuilderTest {
	public static void main(String[] args) {
		CarBuilder builder = new CarBuilder();
		CarDirector director = new CarDirector(builder);

		Car sportsCar = director.constructSportsCar();
		System.out.println(sportsCar);

		Car suv = director.constructSUV();
		System.out.println(suv);
	}
}
