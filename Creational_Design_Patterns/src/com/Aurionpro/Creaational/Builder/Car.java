package com.Aurionpro.Creaational.Builder;

public class Car {
    private String engine;
    private String body;
    private int seats;
    private boolean airConditioning;
    private boolean gps;

    public Car(String engine, String body, int seats, boolean airConditioning, boolean gps) {
        this.engine = engine;
        this.body = body;
        this.seats = seats;
        this.airConditioning = airConditioning;
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", body=" + body + ", seats=" + seats 
                + ", airConditioning=" + airConditioning + ", gps=" + gps + "]";
    }
}
