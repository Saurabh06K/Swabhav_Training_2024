package com.Aurionpro.Behavioural.State.Model;

public class Delivered implements IPacketState {

	@Override
	public void next(Packet packet) {
		System.out.println("Packet is already Delivered");
	}

	@Override
	public void previous(Packet packet) {
		packet.setPacketState(new Dispatched());
		System.out.println("Packet is moving to Dispatched state");
	}

	@Override
	public void current(Packet packet) {
		System.out.println("Packet is in Delivered state");
	}

}
