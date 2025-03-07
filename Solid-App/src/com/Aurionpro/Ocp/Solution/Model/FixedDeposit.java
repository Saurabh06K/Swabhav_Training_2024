package com.Aurionpro.Ocp.Solution.Model;

import com.Aurionpro.Ocp.Violation.Model.FestivalType;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principle;
	private int duration;
	private IFestivalInterest festival;
	
	public FixedDeposit(int accountNumber, String name, double principle, int duration, IFestivalInterest festival) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrinciple() {
		return principle;
	}

	public void setPrinciple(double principle) {
		this.principle = principle;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public IFestivalInterest getFestival() {
		return festival;
	}

	public void setFestival(IFestivalInterest festival) {
		this.festival = festival;
	}
	
	public double calculateSimpleInterest() {
		return (principle*duration*festival.getInterestRate()) / 100;
	}

	@Override
	public String toString() {
		return "FixedDeposit [accountNumber=" + accountNumber + ", name=" + name + ", principle=" + principle
				+ ", duration=" + duration + ", festival=" + festival + "]";
	}
	
	
}
