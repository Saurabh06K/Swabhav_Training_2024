package com.Aurionpro.dip.Solution.Model;

public class TaxCalculator {
	private ILogger logger;

	public TaxCalculator(ILogger logger) {
		super();
		this.logger = logger;
	}

	public ILogger getLogger() {
		return logger;
	}

	public void setLogger(ILogger logger) {
		this.logger = logger;
	}
	
	public int calculateTax(int amount, int rate) {
		return amount/rate;
	}

	@Override
	public String toString() {
		return "TaxCalculator [logger=" + logger + "]";
	}
	
}
