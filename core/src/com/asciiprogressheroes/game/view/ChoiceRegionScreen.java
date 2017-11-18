package com.asciiprogressheroes.game.view;

import com.asciiprogressheroes.game.AsciiProgressHeroes;
import com.asciiprogressheroes.game.model.Region;
import com.asciiterminal.ui.AsciiTerminalButton;
import com.badlogic.gdx.graphics.Color;

/**
 * Created by Julien on 25/05/2017.
 */
public class ChoiceRegionScreen extends CommonScreen {

    public Integer landPosition = 0;

    public ChoiceRegionScreen(AsciiProgressHeroes game) {
        super(game);

        if(game.getWorld().isGenerateRegion()) {
            game.getWorld().setGenerateRegion(false);
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
        Region mediumRegion = game.getWorld().getMediumRegion();
        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH/2 - medium.length()/2, 5, medium, Color.WHITE);
        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH/2 - mediumRegion.getRegionName().name.length()/2, 6, mediumRegion.getRegionName().name, Color.YELLOW);



        // Hard
        String hard = "Hard";
        Region hardRegion = game.getWorld().getHardRegion();
        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH/2 - hard.length()/2, 8, hard, Color.WHITE);
        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH/2 - hardRegion.getRegionName().name.length()/2, 9, hardRegion.getRegionName().name, Color.RED);








        // TODO : Depend of the intelligence of player
//        String labelEnemies = "Number of enemies";
//        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH/2 - labelEnemies.length()/2, 6, labelEnemies, Color.WHITE);
//        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH/2, 7, enemiesNumber.toString(), Color.WHITE);
    }

    @Override
    public void show() {
        Region easyRegion = game.getWorld().getEasyRegion();
        AsciiTerminalButton easyRegionButton = new AsciiTerminalButton(asciiTerminal, easyRegion.getRegionName().name, AsciiProgressHeroes.WINDOW_WIDTH/2 - easyRegion.getRegionName().name.length()/2, 3, new Color(0x007f00ff), Color.WHITE, Color.GREEN, asciiTerminal.getDefaultCharacterBackgroundColor());
        asciiTerminal.addActor(easyRegionButton);
        getListActor().add(easyRegionButton);
    }
}
