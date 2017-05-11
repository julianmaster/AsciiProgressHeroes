package com.asciiprogressheroes.game.view;

import com.asciiprogressheroes.game.AsciiProgressHeroes;
import com.badlogic.gdx.graphics.Color;

/**
 * Created by Julien on 10/05/2017.
 */
public class LandScreen extends CommonScreen {

    public LandScreen(final AsciiProgressHeroes game) {
        super(game);
    }

    @Override
    public void render(float delta) {
        drawBorder(false, Color.DARK_GRAY);
        drawBorder(true, Color.DARK_GRAY);


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
