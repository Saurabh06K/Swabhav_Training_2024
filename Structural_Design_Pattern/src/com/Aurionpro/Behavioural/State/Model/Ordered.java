package com.Aurionpro.Behavioural.State.Model;

public class Ordered implements IPacketState {

	@Override
	public void next(Packet packet) {
		packet.setPacketState(new Dispatched());
		System.out.println("Packet is moving to Dispatched state");
	}

	@Override
	public void previous(Packet packet) {
		System.out.println("Packet is already in Ordered state");
	}

	@Override
	public void current(Packet packet) {
		System.out.println("Packet is in Ordered state");
	}

}
