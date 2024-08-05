package com.Aurionpro.Model;

public class PayPalPayment extends Payment {

	@Override
	public void payBill() {
		System.out.println("Bill payment done through PayPal");
	}

	@Override
	public void redeem() {
		System.out.println("Redeem done through PayPal");
	}
	
}
