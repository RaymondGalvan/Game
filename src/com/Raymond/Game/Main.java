package com.Raymond.Game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main {

	public static void main(String[] args) {
		try {
			AppGameContainer app = new AppGameContainer(new Game("My Game Title"));
			app.setDisplayMode(640, 480, false);
			app.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
