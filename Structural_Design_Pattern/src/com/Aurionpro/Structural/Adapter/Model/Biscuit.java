package com.Aurionpro.Structural.Adapter.Model;

public class Biscuit implements IItems {
	
	private String name;
	private double mrp;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMrp() {
		return mrp;
	}

	public void setMrp(double mrp) {
		this.mrp = mrp;
	}

	@Override
	public String getItemName() {
		return name;
	}

	@Override
	public double getItemPrice() {
		return mrp;
	}

}
