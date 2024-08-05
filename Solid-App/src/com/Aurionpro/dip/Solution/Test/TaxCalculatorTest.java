package com.Aurionpro.dip.Solution.Test;

import com.Aurionpro.dip.Solution.Model.DBLogger;
import com.Aurionpro.dip.Solution.Model.FileLogger;
import com.Aurionpro.dip.Solution.Model.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		try {
			TaxCalculator t1 = new TaxCalculator(new DBLogger());
			System.out.println(t1.calculateTax(5000, 2));
			
			TaxCalculator t2 = new TaxCalculator(new FileLogger());
			System.out.println(t2.calculateTax(3000, 0));
		} catch (Exception e) {
			new FileLogger().log("Divided by zero");
		}

	}
}
