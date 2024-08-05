package com.Aurionpro.Test;

import com.Aurionpro.Model.BankTransferPayment;
import com.Aurionpro.Model.CreditCardPayment;
import com.Aurionpro.Model.PayPalPayment;
import com.Aurionpro.Model.Payment;

public class PaymentTest {
	public static void main(String[] args) {
		Payment payment1 = new CreditCardPayment();
		payment1.payBill();
		payment1.redeem();
		
		Payment payment2 = new PayPalPayment();
		payment2.payBill();
		payment2.redeem();
		
		Payment payment3 = new BankTransferPayment();
		payment3.payBill();
		payment3.redeem();
		
	}
}
