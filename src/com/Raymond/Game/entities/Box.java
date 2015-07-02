package com.Raymond.Game.entities;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

import com.Raymond.Game.collision.Collidable;
import com.Raymond.Game.collision.CollisionSystem;

public class Box extends BaseEntity implements Collidable {
	private int xvelocity;
	private int yvelocity;
	private Rectangle box1;
	
	public Box(int zIndex, int x, int y, int width, int height) {
		super(zIndex);
		box1 = new Rectangle(x, y, width, height);
		CollisionSystem.getInstance().register(this);
	}
	
	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		box1.setX(box1.getX() + xvelocity);
		box1.setY(box1.getY() + yvelocity);
		xvelocity = 4;
		yvelocity = 4;

		if (box1.getX() > 590) {
			box1.setX(0);
		}
		if (box1.getY() > 500) {
			box1.setY(0);
		}
		if (box1.getX() < 0) {
			box1.setX(590);
		}
		if (box1.getY() < 0) {
			box1.setY(500);
		}

	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		g.setColor(Color.red);
		g.fill(box1);
		g.setColor(Color.orange);
		
	}

	@Override
	public Shape getCollisionBouds() {
		return box1;
	}

	@Override
	public boolean collidesWith(Collidable c) {
		return box1.intersects(c.getCollisionBouds());
	}

}
