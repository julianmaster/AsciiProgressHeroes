package com.asciiprogressheroes.game.view;

import com.asciiprogressheroes.game.AsciiProgressHeroes;
import com.asciiprogressheroes.game.model.EntityGenerator;
import com.asciiterminal.ui.AsciiTerminalButton;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

/**
 * Created by Julien on 07/05/2017.
 */
public class MainMenuScreen extends CommonScreen {

    public MainMenuScreen(final AsciiProgressHeroes game) {
        super(game);
    }

    @Override
    public void render(float delta) {
        RainbowColor.update(delta);
        asciiTerminal.writeString(6, 1, "AsciiProgressHeroes", RainbowColor.getColor());
    }

    @Override
    public void show() {
        AsciiTerminalButton startButton = new AsciiTerminalButton(asciiTerminal, "Start", 13, 3, Color.WHITE, Color.YELLOW, Color.YELLOW, Color.BLACK);
        startButton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setWorld(EntityGenerator.newWorld());
                game.setScreen(new CityScreen(game));
            }
        });
        asciiTerminal.addActor(startButton);
        getListActor().add(startButton);
    }
}
