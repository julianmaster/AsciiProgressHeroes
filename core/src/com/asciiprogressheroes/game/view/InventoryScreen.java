package com.asciiprogressheroes.game.view;

import com.asciiprogressheroes.game.AsciiProgressHeroes;
import com.asciiterminal.ui.AsciiTerminal;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;

/**
 * Created by Julien on 01/05/2017.
 */
public class InventoryScreen extends CommonScreen {

    public InventoryScreen(final AsciiProgressHeroes game) {
        super(game);
    }

    @Override
    public void render(float delta) {
        asciiTerminal.writeString(1, 1, "Inventory", Color.WHITE);

        if(Gdx.input.isKeyPressed(Input.Keys.Z)) {
            game.setScreen(new CityScreen(game));
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
