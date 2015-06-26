package com.Raymond.Game.Events;

public class SpawnEvent extends Event {

	public int data;
	
	public SpawnEvent(int entID) {
		super("SpawnEvent", new Object[] {entID});
		this.data = entID;
	}
	
}
