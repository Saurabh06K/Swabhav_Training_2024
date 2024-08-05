package com.Aurionpro.Model;

public class Car extends FourWheeler {
	@Override
	public String toString() {
		return "Car [Price=" + price + ", Mileage=" + getMileage() + ", CompanyName=" + getCompanyName() + "]";
	}

	public Car(String companyName, int mileage, int price) {
		super(companyName, mileage);
		this.price = price;
	}

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
