package com.Raymond.entities;

import org.lwjgl.util.Rectangle;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;

public class Pacman extends BaseEntity {
	
private static final Color Color = null;
private Circle Pacman;
private int x;
private int y;
private int velocityx;
private int velocityy;
private int speed;
private Rectangle ghost; 
	

	public Pacman(int zIndex, float f, float g, int width, int height) {
		super(zIndex);
		Pacman = new Circle(f, g, 20, 20);
		this.zIndex = zIndex; 
		
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		Input in = container.getInput();
	if (in.isKeyDown(Input.KEY_LEFT)) {
		Pacman.setX(Pacman.getX() + velocityx * speed - 2);
	}
	if (in.isKeyDown(Input.KEY_RIGHT)) {
		Pacman.setX(Pacman.getX() + velocityy * speed + 2);
	}
	if (in.isKeyDown(Input.KEY_UP)) {
		Pacman.setY(Pacman.getY() + velocityy * speed -2);
	}
	if (in.isKeyDown(Input.KEY_DOWN)) {
		Pacman.setY(Pacman.getY() + velocityy * speed + 2);
	}
	if (Pacman.getX() > 590) {
		Pacman.setX(0);
	}
	if (Pacman.getY() > 500) {
		Pacman.setY(0);
	}
	if (Pacman.getX() < 0) {
		Pacman.setX(590);
	}
	if (Pacman.getY() < 0) {
		Pacman.setY(500);
	}
		

	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		g.setColor(Color.yellow);
		g.fill(Pacman);
	
		
		
		

	}

}
