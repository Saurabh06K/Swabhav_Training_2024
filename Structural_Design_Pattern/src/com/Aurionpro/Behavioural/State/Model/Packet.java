package com.Aurionpro.Behavioural.State.Model;

public class Packet {

	IPacketState packetState;

	public IPacketState getPacketState() {
		return packetState;
	}

	public void setPacketState(IPacketState packetState) {
		this.packetState = packetState;
	}

	public Packet(IPacketState packetState) {
		super();
		this.packetState = packetState;
	}

	public void previous() {
		packetState.previous(this);
	}

	public void next() {
		packetState.next(this);
	}

	public void current() {
		packetState.current(this);
	}

	public String printStatus() {
		return "Packet [packetState=" + packetState + "]";
	}
	
	

}
