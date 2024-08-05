package com.Aurionpro.dip.Violation.Model;

public class TaxCalculator {
	
	private DBLogger dblogger = new DBLogger();
	
	void TaxCalculator() {
		
	}
	public int calculateTax(int amount, int rate) {
		return amount / rate;
	}
}
