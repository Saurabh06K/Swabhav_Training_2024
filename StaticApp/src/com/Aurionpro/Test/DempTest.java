package com.Aurionpro.Test;

import com.Aurionpro.Model.Demo;

public class DempTest {
	public static void main(String[] args) {
		greet();
		Demo demo1 = new Demo();
		demo1.display();
		Demo.increment();
		demo1.display();

		Demo demo2 = new Demo();
		demo2.display();
		Demo.increment();
		demo2.display();

		Demo demo3 = new Demo();
		demo3.display();
		Demo.increment();
		demo3.display();
	}
	
	public static void greet() {
		System.out.println("Namastee!");
	}

	static {
		System.out.println("Hello!!!");
	}
	
	{
		System.out.println("Heyyy");
	}
}
