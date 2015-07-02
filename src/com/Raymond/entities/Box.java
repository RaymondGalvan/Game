package com.Raymond.entities;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;

public class Box extends BaseEntity{
	private int x;
	private int y;
	private int xvelocity;
	private int yvelocity;
	private Rectangle box1;
	private int speed;
	

	private Rectangle box;
	
	public Box(int zIndex, int x, int y, int width, int height) {
		super(zIndex);
		box1 = new Rectangle(x, y, width, height);
		box = new Rectangle (x, y, width, height);
	}
	
	@Override
	public void update(GameContainer container, int delta) throws SlickException {
	box1.setX(box1.getX() + xvelocity * speed + 3);
	box1.setY(box1.getY() + yvelocity * speed - 6);
	box.setX(box.getX() + xvelocity * speed + 7);
	box.setY(box.getY() + xvelocity * speed - 4);
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
	if (box.getX() > 590) {
		box.setX(0);
	}
	if (box.getY() > 500) {
		box.setY(0);
	}
	if (box.getX() < 0) {
		box.setX(590);
	}
	if (box.getY() < 0) {
		box.setY(500);
	}
		
		
	
		
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		g.setColor(Color.white);
		g.fill(box1);
	}

}
