package com.asciiprogressheroes.game.view;

import com.asciiprogressheroes.game.AsciiProgressHeroes;
import com.asciiterminal.ui.AsciiTerminal;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Actor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Julien on 07/05/2017.
 */
public abstract class CommonScreen extends ScreenAdapter {

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

        drawRectangle(offset, 0, AsciiProgressHeroes.WINDOW_WIDTH/2 - 1, AsciiProgressHeroes.WINDOW_HEIGHT - 1, borderColor);
    }

    protected void drawRectangle(int positionX, int positionY, int width, int height, Color color) {
        asciiTerminal.write(positionX, positionY, (char)218, color);
        asciiTerminal.write(positionX + width, positionY, (char)191, color);
        asciiTerminal.write(positionX, positionY + height, (char)192, color);
        asciiTerminal.write(positionX + width, positionY + height, (char)217, color);
        for(int i = positionX; i < positionX + width - 1; i++) {
            asciiTerminal.write(1+i, 0, (char)196, color);
            asciiTerminal.write(1+i, AsciiProgressHeroes.WINDOW_HEIGHT - 1, (char)196, color);
        }
        for(int j = positionY; j < positionY + height - 1; j++) {
            asciiTerminal.write(positionX, 1+j, (char)179, color);
            asciiTerminal.write(positionX + width, 1+j, (char)179, color);
        }
    }
}
