package com.Aurionpro.Creaational.Prototype;

public class ShapeTest {
	public static void main(String[] args) {

		IShape originalRectangle = new Rectangle(10, 20);
		IShape originalCircle = new Circle(15);
		System.out.println("Original Objects:");
		originalRectangle.draw();
		originalCircle.draw();

		IShape clonedRectangle = originalRectangle.clone();
		IShape clonedCircle = originalCircle.clone();
		System.out.println("\nCloned Objects:");
		clonedRectangle.draw();
		clonedCircle.draw();

	}
}
