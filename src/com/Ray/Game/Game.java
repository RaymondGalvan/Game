package com.Ray.Game;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Game extends BasicGame
{

	public Game(String gamename) {
		super(gamename);
		// TODO Auto-generated constructor stub
	}

		@Override
	public void render(GameContainer container, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub
			g.drawString("Howdy!", 10, 10);
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		// TODO Auto-generated method stub
			
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		
	}
}

