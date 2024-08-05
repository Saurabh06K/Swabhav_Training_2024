package com.Aurionpro.Isp.Violation.Model;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Start Robot");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Stop Robot");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eat Robot");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Drink Robot");
	}

}
