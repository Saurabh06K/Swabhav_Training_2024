package com.Aurionpro.Behavioural.State.Model;

public class Dispatched implements IPacketState {
	
	@Override
	public void next(Packet packet) {
		packet.setPacketState(new Delivered());
		System.out.println("Packet is moving to Delivered state");
	}

	@Override
	public void previous(Packet packet) {
		packet.setPacketState(new Ordered());
		System.out.println("Packet is moving to Ordered state");
	}

	@Override
	public void current(Packet packet) {
		System.out.println("Packet is in Dispatched state");
	}

	
}
