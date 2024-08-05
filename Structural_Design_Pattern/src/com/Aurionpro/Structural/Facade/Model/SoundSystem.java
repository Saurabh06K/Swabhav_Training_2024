package com.Aurionpro.Structural.Facade.Model;

public class SoundSystem {
	void start() {
		System.out.println("Starting sound system");
	}
	
	void stop() {
		System.out.println("Stoping sound system");
	}
	
	void volume(int level) {
		System.out.println("Volume is: "+level);
	}
}
