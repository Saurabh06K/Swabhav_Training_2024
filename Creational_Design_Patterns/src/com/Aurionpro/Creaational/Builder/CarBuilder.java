package com.Aurionpro.Creaational.Builder;

public class CarBuilder implements ICarBuilder {
	private String engine;
	private String body;
	private int seats;
	private boolean airConditioning;
	private boolean gps;

	@Override
	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public void setAirConditioning(boolean airConditioning) {
		this.airConditioning = airConditioning;
	}

	@Override
	public void setGPS(boolean gps) {
		this.gps = gps;
	}

	@Override
	public Car build() {
		return new Car(engine, body, seats, airConditioning, gps);
	}
}
