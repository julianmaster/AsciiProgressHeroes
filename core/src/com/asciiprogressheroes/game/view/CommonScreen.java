package com.asciiprogressheroes.game.view;

import com.asciiprogressheroes.game.AsciiProgressHeroes;
import com.asciiterminal.ui.AsciiTerminal;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Actor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Julien on 07/05/2017.
 */
public abstract class CommonScreen implements Screen {

    protected final AsciiProgressHeroes game;
    protected final AsciiTerminal asciiTerminal;
    private List<Actor> listActor = new ArrayList<>();

    public CommonScreen(AsciiProgressHeroes game) {
        this.game = game;
        this.asciiTerminal = game.getAsciiTerminal();
    }

    @Override
    public void hide() {
        for(Actor actor : listActor) {
            actor.remove();
        }
    }

    public List<Actor> getListActor() {
        return listActor;
    }

    protected void drawBorder(boolean right, Color borderColor) {
        int offset = 0;
        if(right) {
            offset += AsciiProgressHeroes.WINDOW_WIDTH/2;
        }

        asciiTerminal.write(0 + offset, 0, (char)218, borderColor);
        asciiTerminal.write(AsciiProgressHeroes.WINDOW_WIDTH/2 - 1 + offset, 0, (char)191, borderColor);
        asciiTerminal.write(0 + offset, AsciiProgressHeroes.WINDOW_HEIGHT - 1, (char)192, borderColor);
        asciiTerminal.write(AsciiProgressHeroes.WINDOW_WIDTH/2 - 1 + offset, AsciiProgressHeroes.WINDOW_HEIGHT - 1, (char)217, borderColor);
        for(int i = 0 + offset; i < AsciiProgressHeroes.WINDOW_WIDTH/2 - 2 + offset; i++) {
            asciiTerminal.write(1+i, 0, (char)196, borderColor);
            asciiTerminal.write(1+i, AsciiProgressHeroes.WINDOW_HEIGHT - 1, (char)196, borderColor);
        }
        for(int j = 0; j < AsciiProgressHeroes.WINDOW_HEIGHT - 2; j++) {
            asciiTerminal.write(0 + offset, 1+j, (char)179, borderColor);
            asciiTerminal.write(AsciiProgressHeroes.WINDOW_WIDTH/2 - 1 + offset, 1+j, (char)179, borderColor);
        }
    }
}
