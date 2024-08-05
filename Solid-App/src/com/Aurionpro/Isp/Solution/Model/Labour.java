package com.Aurionpro.Isp.Solution.Model;

public class Labour implements IWorkable, ILunchInterval {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Start Labour");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Stop Labour");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eat Labour");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Drink Labour");
	}

}
