package com.Ray.Game;

import java.util.ArrayList;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import com.Ray.Game.entity.BaseEntity;

public class Game extends BasicGame
{
	private ArrayList<BaseEntity> entityList;
	
	
	public Game(String gamename) {
		super(gamename);
		this.entityList = new ArrayList<BaseEntity>();
	}

		@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		for(int i = 0; i < entityList.size();i++){
				entityList.get(i).render(container, g);
		}
			
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		// TODO Auto-generated method stub
			
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		for(BaseEntity e : entityList){
			e.update(container,  delta);
			}
		}
	
}

