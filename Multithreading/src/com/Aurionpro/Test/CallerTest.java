package com.Aurionpro.Test;

import com.Aurionpro.Model.CallMe;
import com.Aurionpro.Model.Caller;

public class CallerTest {
	public static void main(String[] args) {
		CallMe target = new CallMe();

		Caller caller1 = new Caller("Hello", target);
		Caller caller2 = new Caller("Saurabh", target);
		Caller caller3 = new Caller("Kadam", target);

		try {
			caller1.getThread().join();
			caller2.getThread().join();
			caller3.getThread().join();
		} catch (InterruptedException exception) {
			System.out.println(exception);
		}
	}
}
