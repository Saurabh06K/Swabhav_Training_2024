package com.Aurionpro.Model;

public class CreditCardPayment extends Payment {

	@Override
	public void payBill() {
		System.out.println("Bill payment done through credit card");
	}

	@Override
	public void redeem() {
		System.out.println("Redeem done through credit card");
	}
	
}
