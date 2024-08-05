package com.Aurionpro.Structural.Facade.Model;

public class Projector {
	void on() {
		System.out.println("Projector turning ON");
	}
	void off() {
		System.out.println("Projector turning OFF");
	}
	void input(String source) {
		System.out.println("Source is: "+source);
	}
}
