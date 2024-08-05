package com.Aurionpro.Ocp.Solution.Test;

import com.Aurionpro.Ocp.Solution.Model.IFestivalInterest;
import com.Aurionpro.Ocp.Violation.Model.FestivalType;
import com.Aurionpro.Ocp.Solution.Model.DiwaliFestival;
import com.Aurionpro.Ocp.Solution.Model.FixedDeposit;
import com.Aurionpro.Ocp.Solution.Model.HoliFestival;

public class FixedDepositTest {
	public static void main(String[] args) {
		FixedDeposit fxedDeposit = new FixedDeposit(1234, "Saurabh", 100000, 5, new HoliFestival());
		double simpleInterest = fxedDeposit.calculateSimpleInterest();
		System.out.println(simpleInterest);
	}
}
