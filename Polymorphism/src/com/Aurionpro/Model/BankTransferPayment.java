package com.Aurionpro.Model;

public class BankTransferPayment extends Payment {

	@Override
	public void payBill() {
		System.out.println("Bill payment done through BankTransfer.");
	}

	@Override
	public void redeem() {
		System.out.println("Redeem done through BankTransfer.");
	}
	
}
