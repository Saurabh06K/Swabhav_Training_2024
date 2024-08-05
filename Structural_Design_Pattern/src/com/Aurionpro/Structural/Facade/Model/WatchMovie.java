package com.Aurionpro.Structural.Facade.Model;

public class WatchMovie {
	DvdPlayer dvdPlayer = new DvdPlayer();
	Projector projector = new Projector();
	SoundSystem soundSystem = new SoundSystem();

	public void startMovie() {
		dvdPlayer.on();
		dvdPlayer.start();

		projector.on();
		projector.input("USB");

		soundSystem.start();
		soundSystem.volume(25);
	}

	public void stopMovie() {
		dvdPlayer.off();
		dvdPlayer.stop();

		projector.off();

		soundSystem.stop();

	}
}
