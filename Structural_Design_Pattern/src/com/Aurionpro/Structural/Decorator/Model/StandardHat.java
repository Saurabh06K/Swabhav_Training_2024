package com.Aurionpro.Structural.Decorator.Model;

public class StandardHat implements IHat {

	@Override
	public String getName() {
		return "Standard Hat";
	}

	@Override
	public double getPrice() {
		return 25;
	}

	@Override
	public String getDescription() {
		return "I am a Standard Hat";
	}

}
