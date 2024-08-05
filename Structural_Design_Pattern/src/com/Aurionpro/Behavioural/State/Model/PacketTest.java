package com.Aurionpro.Behavioural.State.Model;

public class PacketTest {
	public static void main(String[] args) {
		Packet packet = new Packet(new Ordered());
		
		packet.current();
		packet.next();
		packet.next();
		packet.printStatus();
	}
}
