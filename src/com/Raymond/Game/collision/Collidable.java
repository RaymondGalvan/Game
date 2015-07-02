package com.Raymond.Game.collision;

import org.newdawn.slick.geom.Shape;

import com.Raymond.Game.Events.Event;



public interface Collidable {
	public Shape getCollisionBouds();
	
	public boolean collidesWith(Collidable c);
	
	public void invokeEvent(Event e);
}
