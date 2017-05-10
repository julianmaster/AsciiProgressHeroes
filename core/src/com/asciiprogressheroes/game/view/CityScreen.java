package com.asciiprogressheroes.game.view;

import com.asciiprogressheroes.game.AsciiProgressHeroes;
import com.asciiterminal.ui.AsciiTerminal;
import com.asciiterminal.ui.AsciiTerminalButton;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Actor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Julien on 30/04/2017.
 */
public class CityScreen extends CommonScreen {

    CharacterFrameColor playerColor = new CharacterFrameColor();

    public CityScreen(final AsciiProgressHeroes game) {
        super(game);
    }

    @Override
    public void render(float delta) {
//        if(Gdx.input.isKeyPressed(Input.Keys.A)) {
//            game.setScreen(new InventoryScreen(game));
//        }
//        else if(Gdx.input.isKeyPressed(Input.Keys.W)) {
//            playerColor.hit();
//        }
//        else if(Gdx.input.isKeyPressed(Input.Keys.X)) {
//            playerColor.poison(3);
//        }

        playerColor.update(delta);

        Color color = playerColor.getCurrentBorderColor();

        drawBorder(false, color);
        drawBorder(true, color);

        asciiTerminal.writeString(1, 0, "Character", playerColor.getCurrentTitleColor());
        for(int i = 0; i < AsciiProgressHeroes.WINDOW_WIDTH/2 - 2; i++) {
            asciiTerminal.writeString(i+1, 1, " ", Color.YELLOW, new Color(0x777700ff));
        }
        asciiTerminal.writeString(1, 1, "Level 10", Color.YELLOW, new Color(0x777700ff));
        for(int i = 0; i < AsciiProgressHeroes.WINDOW_WIDTH/2 - 2; i++) {
            asciiTerminal.writeString(i+1, 2, " ", Color.RED, new Color(0x770000ff));
        }
        asciiTerminal.writeString(1, 2, "HP 100/100", Color.RED, new Color(0x770000ff));

        asciiTerminal.writeString(1, 4, "strength:", Color.GOLD);
        asciiTerminal.writeString(13, 4, "5", new Color(0x0077ffff));

        asciiTerminal.writeString(1, 5, "dexterity:", Color.GOLD);
        asciiTerminal.writeString(13, 5, "5", new Color(0x0077ffff));

        asciiTerminal.writeString(1, 6, "intellige:", Color.GOLD);
        asciiTerminal.writeString(13, 6, "5", new Color(0x0077ffff));

        asciiTerminal.writeString(1, 7, "constitut:", Color.GOLD);
        asciiTerminal.writeString(13, 7, "5", new Color(0x0077ffff));

        asciiTerminal.writeString(1, 8, "luck:", Color.GOLD);
        asciiTerminal.writeString(13, 8, "5", new Color(0x0077ffff));


        asciiTerminal.writeString(22, 1, "Town", Color.CYAN);
        asciiTerminal.writeString(16, 2, "Action:", Color.WHITE);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {
        AsciiTerminalButton fightButton = new AsciiTerminalButton(asciiTerminal, "Go to land", 16, 3, Color.GRAY, Color.WHITE, Color.WHITE, Color.BLACK);
        asciiTerminal.addActor(fightButton);
        getListActor().add(fightButton);

        AsciiTerminalButton merchantButton = new AsciiTerminalButton(asciiTerminal, "Go to merchant", 16, 4, Color.GRAY, Color.WHITE, Color.WHITE, Color.BLACK);
        asciiTerminal.addActor(merchantButton);
        getListActor().add(merchantButton);
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
