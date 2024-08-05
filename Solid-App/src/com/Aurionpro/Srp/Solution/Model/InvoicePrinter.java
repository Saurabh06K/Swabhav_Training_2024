package com.Aurionpro.Srp.Solution.Model;
import com.Aurionpro.Srp.Solution.Model.TaxCalculator;

public class InvoicePrinter {
	Invoice invoice;

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public void print(Invoice invoice) {
		System.out.println(invoice.getId());
		System.out.println(invoice.getDesc());
		System.out.println(invoice.getAmount());
		System.out.println("Tax Percentage: "+invoice.getTax());
		TaxCalculator taxedAmount = new TaxCalculator();
		System.out.println(taxedAmount.calculateTax(invoice));
	}
}
