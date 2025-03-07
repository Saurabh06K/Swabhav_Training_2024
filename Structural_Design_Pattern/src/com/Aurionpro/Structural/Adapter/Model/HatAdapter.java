package com.Aurionpro.Structural.Adapter.Model;

public class HatAdapter implements IItems {

	private Hat hat;

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getItemName() {
		return hat.getShortName() +" "+ hat.getLongName();
	}

	@Override
	public double getItemPrice() {
		return hat.getBasicPrice() + hat.getTax();
	}

}
