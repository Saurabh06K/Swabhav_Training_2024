package com.Aurionpro.Srp.Violation.Test;

import com.Aurionpro.Srp.Violation.Model.Invoice;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("1231", "Hii", 30000, 10);
		invoice.calculateTax();
		invoice.print();
	}
}
