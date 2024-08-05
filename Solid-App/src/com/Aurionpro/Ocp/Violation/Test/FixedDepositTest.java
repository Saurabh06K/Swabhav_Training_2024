package com.Aurionpro.Ocp.Violation.Test;
import com.Aurionpro.Ocp.Violation.Model.FixedDeposit;
import com.Aurionpro.Ocp.Violation.Model.FestivalType;

public class FixedDepositTest {
	public static void main(String[] args) {
		FixedDeposit fxedDeposit = new FixedDeposit(1234, "Saurabh", 100000, 5, FestivalType.DIWALI);
		double simpleInterest = fxedDeposit.calculateSimpleInterest();
		System.out.println(simpleInterest);
	}
}