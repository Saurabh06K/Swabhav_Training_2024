package com.Aurionpro.Creaational.Builder;

public class CarDirector {
    private CarBuilder builder;

    public CarDirector(CarBuilder builder) {
        this.builder = builder;
    }

    public Car constructSportsCar() {
        builder.setEngine("V8");
        builder.setBody("Sport");
        builder.setSeats(2);
        builder.setAirConditioning(true);
        builder.setGPS(true);
        return builder.build();
    }

    public Car constructSUV() {
        builder.setEngine("V6");
        builder.setBody("SUV");
        builder.setSeats(5);
        builder.setAirConditioning(true);
        builder.setGPS(false);
        return builder.build();
    }
}

