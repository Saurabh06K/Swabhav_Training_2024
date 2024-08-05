package com.Aurionpro.Creaational.Prototype;

public class Circle implements IShape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public IShape clone() {
        return new Circle(radius);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }
}
