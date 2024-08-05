package com.Aurionpro.Srp.Solution.Model;

public class TaxCalculator {
	
	Invoice invoice;
	
	public Invoice getInvoice() {
		return invoice;
	}


	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}


	public double calculateTax(Invoice invoice) {
		return invoice.getAmount() * invoice.getTax()/100;
	}
}
