package com.Aurionpro.Creaational.Builder;

public interface ICarBuilder {
	void setEngine(String engine);

	void setBody(String body);

	void setSeats(int seats);

	void setAirConditioning(boolean airConditioning);

	void setGPS(boolean gps);

	Car build();
}
