package com.asciiprogressheroes.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.asciiprogressheroes.game.AsciiProgressHeroes;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = AsciiProgressHeroes.WINDOW_WIDTH * AsciiProgressHeroes.CHARACTER_WIDTH;
		config.height = AsciiProgressHeroes.WINDOW_HEIGHT * AsciiProgressHeroes.CHARACTER_HEIGHT;
		new LwjglApplication(new AsciiProgressHeroes(), config);
	}
}
