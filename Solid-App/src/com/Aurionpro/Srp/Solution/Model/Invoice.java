package com.Aurionpro.Srp.Solution.Model;

public class Invoice {
	private String id;
	private String desc;
	private double amount;
	private double tax;
	
	public Invoice(String id, String desc, double amount, double tax) {
		super();
		this.id = id;
		this.desc = desc;
		this.amount = amount;
		this.tax = tax;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}
