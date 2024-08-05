package com.Aurionpro.Structural.Facade.Model;

public class ItalianHotel implements IHotel {

	@Override
	public IMenu getMenu() {
		return new ItalianMenu();
	}
	
}
