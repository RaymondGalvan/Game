package com.Raymond.Game.entities;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Shape;

import com.Raymond.Game.Events.Event;
import com.Raymond.Game.Events.EventHandler;
import com.Raymond.Game.collision.Collidable;
import com.Raymond.Game.collision.CollisionSystem;

public class Pacman extends BaseEntity implements Collidable {
	
	private static final Color Color = null;
	private Circle Pacman;
	private int velocityx;
	private int velocityy;
	private boolean isDead = false;

	public Pacman(int zIndex, float f, float g, int width, int height) {
		super(zIndex);
		Pacman = new Circle(f, g, 20, 20);
		this.zIndex = zIndex; 
		CollisionSystem.getInstance().register(this);
		
		addEventListener("CollisionEvent", new EventHandler() {
			@Override
			public void handleEvent(Event e) {
				isDead = true;
			}
			
		});
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		Input in = container.getInput();
		if (in.isKeyDown(Input.KEY_LEFT)) {
			velocityx = - 3;
			velocityy = 0;
		}
		if (in.isKeyDown(Input.KEY_RIGHT)) {
			velocityx = 3;
			velocityy = 0;
		}
		if (in.isKeyDown(Input.KEY_UP)) {
			velocityy = - 3;
			velocityx = 0;
		}
		if (in.isKeyDown(Input.KEY_DOWN)) {
			velocityy = 3;
			velocityx = 0;
		}
		
		Pacman.setX(Pacman.getX() + velocityx);
		Pacman.setY(Pacman.getY() + velocityy);
		
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
		if(!isDead) {
			g.setColor(Color.yellow);
			g.fill(Pacman);
		}

	}

	@Override
	public Shape getCollisionBouds() {
		return Pacman;
	}

	@Override
	public boolean collidesWith(Collidable c) {
		return Pacman.intersects(c.getCollisionBouds());
	}
}
