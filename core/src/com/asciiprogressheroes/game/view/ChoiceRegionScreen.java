package com.asciiprogressheroes.game.view;

import com.asciiprogressheroes.game.AsciiProgressHeroes;
import com.badlogic.gdx.graphics.Color;

/**
 * Created by Julien on 25/05/2017.
 */
public class ChoiceRegionScreen extends CommonScreen {

    public Integer landPosition = 0;
    public Integer enemiesNumber = 1;

    public ChoiceRegionScreen(AsciiProgressHeroes game) {
        super(game);
    }

    @Override
    public void render(float delta) {
        String title = "Go to land";
        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH/2 - title.length()/2, 1, title, Color.WHITE);


        // Easy




        // Medium
        String labelLand = "Land";
        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH/2 - labelLand.length()/2, 3, labelLand, Color.WHITE);
        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH/2, 4, landPosition.toString(), Color.WHITE);





        // Difficult













//        String labelEnemies = "Number of enemies";
//        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH/2 - labelEnemies.length()/2, 6, labelEnemies, Color.WHITE);
//        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH/2, 7, enemiesNumber.toString(), Color.WHITE);
    }
}
