package com.Aurionpro.Srp.Solution.Test;

import com.Aurionpro.Srp.Solution.Model.InvoicePrinter;
import com.Aurionpro.Srp.Solution.Model.TaxCalculator;
import com.Aurionpro.Srp.Solution.Model.Invoice;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("1231", "Hii", 30000, 10);
		TaxCalculator taxedAmount = new TaxCalculator();
		taxedAmount.calculateTax(invoice);
		InvoicePrinter printer = new InvoicePrinter();
		printer.print(invoice);
	}
}
