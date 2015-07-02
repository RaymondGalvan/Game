package com.Raymond.Game.collision;

import com.Raymond.Game.Events.Event;

public class CollisionEvent extends Event{
	
	public CollisionEvent(Object collider) {
		super("CollisionEvent", new Object[] {collider});
	}
}
