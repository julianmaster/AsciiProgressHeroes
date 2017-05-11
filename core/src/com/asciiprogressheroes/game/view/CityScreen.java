package com.asciiprogressheroes.game.view;

import com.asciiprogressheroes.game.AsciiProgressHeroes;
import com.asciiprogressheroes.game.model.Player;
import com.asciiterminal.ui.AsciiTerminal;
import com.asciiterminal.ui.AsciiTerminalButton;
import com.asciiterminal.ui.AsciiTerminalDataCell;
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
        final Player player = game.getWorld().getPlayer();



        if(Gdx.input.isKeyPressed(Input.Keys.A)) {
            game.setScreen(new InventoryScreen(game));
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.W)) {
            playerColor.hit();
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.X)) {
            playerColor.poison(3);
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.C)) {
            player.addExperience(10);
        }

        playerColor.update(delta);

        Color color = playerColor.getCurrentBorderColor();

        drawBorder(false, color);

        asciiTerminal.writeString(1, 0, "Character", playerColor.getCurrentTitleColor());

        Color progressBarColor = new Color(0x777700ff);
        asciiTerminal.writeString(1, 1, "Level "+player.getLevel(), Color.YELLOW);
        int currentExtStep = player.getExperienceFromLastStep();
        int ExpStep = player.getNeedExperienceForLevelUp();
        int max = AsciiProgressHeroes.WINDOW_WIDTH/2 - 2;
        int current = (int)((float)currentExtStep / (float)ExpStep * (float)max);
        for(int i = 0; i < max; i++) {
            char c = asciiTerminal.getCell(i+1, 1).data;
            asciiTerminal.write(i+1, 1, c, Color.YELLOW, i < current ? progressBarColor : Color.BLACK);
        }

        for(int i = 0; i < AsciiProgressHeroes.WINDOW_WIDTH/2 - 2; i++) {
            asciiTerminal.writeString(i+1, 2, " ", Color.RED, new Color(0x770000ff));
        }

        // HP
        asciiTerminal.writeString(1, 2, "HP "+String.valueOf(player.getMaxHp())+"/"+String.valueOf(player.getMaxHp()), Color.RED, new Color(0x770000ff));

        // Strength
        asciiTerminal.writeString(1, 4, "strength:", Color.GOLD);
        asciiTerminal.writeString(13, 4, String.valueOf(player.getStrength()), new Color(0x0077ffff));

        // Dexterity
        asciiTerminal.writeString(1, 5, "dexterity:", Color.GOLD);
        asciiTerminal.writeString(13, 5, String.valueOf(player.getDexterity()), new Color(0x0077ffff));

        // Intelligence
        asciiTerminal.writeString(1, 6, "intellige:", Color.GOLD);
        asciiTerminal.writeString(13, 6, String.valueOf(player.getIntelligence()), new Color(0x0077ffff));

        // Constitution
        asciiTerminal.writeString(1, 7, "constitut:", Color.GOLD);
        asciiTerminal.writeString(13, 7, String.valueOf(player.getConstitution()), new Color(0x0077ffff));

        // Luck
        asciiTerminal.writeString(1, 8, "luck:", Color.GOLD);
        asciiTerminal.writeString(13, 8, String.valueOf(player.getLuck()), new Color(0x0077ffff));



        // Town, Actions
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
