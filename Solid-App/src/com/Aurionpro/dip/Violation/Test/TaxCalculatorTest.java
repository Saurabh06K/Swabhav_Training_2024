package com.Aurionpro.dip.Violation.Test;

import com.Aurionpro.dip.Violation.Model.DBLogger;
import com.Aurionpro.dip.Violation.Model.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		TaxCalculator t1 = new TaxCalculator();
		try {
			double tax = t1.calculateTax(100000, 0);
			System.out.println("The tax amount is: "+tax);
		} catch (Exception e) {
			new DBLogger().log("Divided by zero");
		}

	}
}
