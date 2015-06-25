package com.Ray.Game.entity;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Point;

public class Box extends BaseEntity {
	private int speed = 1;
	private int xvelocity = 1;
	private int yvelocity = 1;
	
	public Box(Point point, int i, int j, int k) {
		super(point, i, j, k);
	}

	@Override
	public void update(GameContainer container, int delta)throws SlickException {
		position.setX(position.getX()+ 1);
		position.setY(position.getY()+ 1);
		if(position.getX() + width >= container.getWidth());
		xvelocity*= -1;
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		g.setColor(Color.red);
		g.drawRect(position.getX(), position.getY(), width, height);

	}

}
