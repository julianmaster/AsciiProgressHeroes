package com.asciiprogressheroes.game.view;

import com.asciiprogressheroes.game.AsciiProgressHeroes;
import com.asciiprogressheroes.game.model.Region;
import com.asciiterminal.ui.AsciiTerminalButton;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

/**
 * Created by Julien on 25/05/2017.
 */
public class ChoiceRegionScreen extends CommonScreen {

    public Integer landPosition = 0;

    public ChoiceRegionScreen(AsciiProgressHeroes game) {
        super(game);

        if(game.getWorld().isNeedGenerateRegion()) {
            game.getWorld().setNeedGenerateRegion(false);
            game.getWorld().generateRegions();
        }
    }

    @Override
    public void render(float delta) {
        String title = "Go to land";
        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH/2 - title.length()/2, 0, title, Color.WHITE);

        // Easy
        String easy = "Easy";
        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH/2 - easy.length()/2, 2, easy, Color.WHITE);


        // Medium
        String medium = "Medium";
        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH/2 - medium.length()/2, 5, medium, Color.WHITE);


        // Hard
        String hard = "Hard";
        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH/2 - hard.length()/2, 8, hard, Color.WHITE);







        // TODO Depend of the intelligence of player
//        String labelEnemies = "Number of enemies";
//        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH/2 - labelEnemies.length()/2, 6, labelEnemies, Color.WHITE);
//        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH/2, 7, enemiesNumber.toString(), Color.WHITE);
    }

    @Override
    public void show() {
        // Return
        AsciiTerminalButton returnButton = new AsciiTerminalButton(asciiTerminal,((char)27)+"Return", 0, 0, Color.GRAY, Color.WHITE, Color.WHITE, asciiTerminal.getDefaultCharacterBackgroundColor());
        returnButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(new CityScreen(game));
            }
        });
        asciiTerminal.addActor(returnButton);
        getListActor().add(returnButton);

        // Easy
        Region easyRegion = game.getWorld().getEasyRegion();
        AsciiTerminalButton easyRegionButton = new AsciiTerminalButton(asciiTerminal, easyRegion.getRegionName().name, AsciiProgressHeroes.WINDOW_WIDTH/2 - easyRegion.getRegionName().name.length()/2, 3, new Color(0x007f00ff), Color.WHITE, Color.GREEN, asciiTerminal.getDefaultCharacterBackgroundColor());
        easyRegionButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                //TODO adding action
                game.getWorld().setCurrentRegion(easyRegion);
                game.setScreen(new RegionScreen(game));
            }
        });
        asciiTerminal.addActor(easyRegionButton);
        getListActor().add(easyRegionButton);

        // Medium
        Region mediumRegion = game.getWorld().getMediumRegion();
        AsciiTerminalButton mediumRegionButton = new AsciiTerminalButton(asciiTerminal, mediumRegion.getRegionName().name, AsciiProgressHeroes.WINDOW_WIDTH/2 - mediumRegion.getRegionName().name.length()/2, 6, new Color(0x7f7f00ff), Color.WHITE, Color.YELLOW, asciiTerminal.getDefaultCharacterBackgroundColor());
        mediumRegionButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                //TODO adding action
                game.getWorld().setCurrentRegion(mediumRegion);
                game.setScreen(new RegionScreen(game));
            }
        });
        asciiTerminal.addActor(mediumRegionButton);
        getListActor().add(mediumRegionButton);

        // Hard
        Region hardRegion = game.getWorld().getHardRegion();
        AsciiTerminalButton hardRegionButton = new AsciiTerminalButton(asciiTerminal, hardRegion.getRegionName().name, AsciiProgressHeroes.WINDOW_WIDTH/2 - hardRegion.getRegionName().name.length()/2, 9, new Color(0x7f0000ff), Color.WHITE, Color.RED, asciiTerminal.getDefaultCharacterBackgroundColor());
        hardRegionButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                //TODO adding action
                game.getWorld().setCurrentRegion(hardRegion);
                game.setScreen(new RegionScreen(game));
            }
        });
        asciiTerminal.addActor(hardRegionButton);
        getListActor().add(hardRegionButton);
    }
}
