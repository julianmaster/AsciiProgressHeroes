package com.asciiprogressheroes.game;

import com.asciiprogressheroes.game.model.World;
import com.asciiprogressheroes.game.view.MainMenuScreen;
import com.asciiprogressheroes.game.view.RainbowColor;
import com.asciiterminal.ui.AsciiTerminal;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

import java.util.Random;

public class AsciiProgressHeroes extends Game {

	public static final String TILESET = "Bedstead-10-df.png";
	public static final int CHARACTER_WIDTH = 6;
	public static final int CHARACTER_HEIGHT = 10;

	public static final int WINDOW_WIDTH = 32;
	public static final int WINDOW_HEIGHT = 10;

	public static final float COMBAT_TICK = 1.0f;

	private AsciiTerminal asciiTerminal;
	private World world;
	
	@Override
	public void create () {
		asciiTerminal = new AsciiTerminal("AsciiProgressHeroes", WINDOW_WIDTH, WINDOW_HEIGHT, TILESET, CHARACTER_WIDTH, CHARACTER_HEIGHT);

		Random rand = new Random();

//		for(int i = 0; i < WINDOW_WIDTH; i++) {
//			for (int j = 0; j < WINDOW_HEIGHT; j++) {
//				asciiTerminal.write(i, j, (char)rand.nextInt(255), new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat(), 1));
//			}
//		}

		this.setScreen(new MainMenuScreen(this));
	}

	@Override
	public void render () {
		// Clear
		asciiTerminal.clear();

		// Update
		super.render();

		// Render
		asciiTerminal.render(Gdx.graphics.getDeltaTime());
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
		asciiTerminal.resize(width, height);
	}

	@Override
	public void dispose () {
		asciiTerminal.dispose();
	}

	public AsciiTerminal getAsciiTerminal() {
		return asciiTerminal;
	}

	public void setWorld(World world) {
		this.world = world;
	}

	public World getWorld() {
		return world;
	}
}
