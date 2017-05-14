package com.asciiprogressheroes.game.view;

import com.asciiprogressheroes.game.AsciiProgressHeroes;
import com.asciiprogressheroes.game.model.Player;
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
        // Player
        final Player player = game.getWorld().getPlayer();
        drawBorder(false, Color.DARK_GRAY);
        asciiTerminal.writeString(1, 0, "Character", Color.WHITE);

        // Experience
        Color progressBarColor = new Color(0x777700ff);
        asciiTerminal.writeString(1, 1, "Level "+player.getLevel(), Color.YELLOW);
        int currentExtStep = player.getExperienceFromLastStep();
        int ExpStep = player.getNeedExperienceForLevelUp();
        int maxExp = AsciiProgressHeroes.WINDOW_WIDTH/2 - 2;
        int currentExp = (int)((float)currentExtStep / (float)ExpStep * (float)maxExp);
        for(int i = 0; i < maxExp; i++) {
            char c = asciiTerminal.getCell(i+1, 1).data;
            asciiTerminal.write(i+1, 1, c, Color.YELLOW, i < currentExp ? progressBarColor : Color.BLACK);
        }

        // HP
        Color hpBarColor = new Color(0x770000ff);
        asciiTerminal.writeString(1, 2, "HP "+String.valueOf(player.getCurrentHp())+"/"+String.valueOf(player.getMaxHp()), Color.RED, hpBarColor);
        int maxLife = AsciiProgressHeroes.WINDOW_WIDTH/2 - 2;
        int currentLife = (int)((float)player.getCurrentHp() / (float)player.getMaxHp() * (float)maxLife);
        for(int i = 0; i < maxLife; i++) {
            char c = asciiTerminal.getCell(i+1, 2).data;
            asciiTerminal.write(i+1, 2, c, Color.RED, i < currentLife ? hpBarColor : Color.BLACK);
        }




        // Enemy
        drawBorder(true, Color.DARK_GRAY);









        // Update
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
