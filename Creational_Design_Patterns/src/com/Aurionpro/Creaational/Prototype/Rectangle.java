package com.Aurionpro.Creaational.Prototype;

public class Rectangle implements IShape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public IShape clone() {
        return new Rectangle(width, height);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with width: " + width + " and height: " + height);
    }
}


