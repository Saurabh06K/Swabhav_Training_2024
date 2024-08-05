package com.Aurionpro.Behavioural.State.Model;

public interface IPacketState {
	void next(Packet packet);
	void previous(Packet packet);
	void current(Packet packet);
}
