package com.asciiprogressheroes.game.view;

import com.asciiprogressheroes.game.AsciiProgressHeroes;
import com.asciiprogressheroes.game.model.Enemy;
import com.asciiprogressheroes.game.model.Player;
import com.badlogic.gdx.graphics.Color;

public class LandScreen extends CommonScreen {

    private CharacterFrameColor playerColor = new CharacterFrameColor();
    private CharacterFrameColor enemyColor = new CharacterFrameColor();

    public LandScreen(final AsciiProgressHeroes game) {
        super(game);
    }

    @Override
    public void render(float delta) {
        final Player player = game.getWorld().getPlayer();
        final Enemy enemy = game.getWorld().getCurrentRegion().getEnemies().peekFirst();

        // TODO make the automatic combat at speed time

        // Show player informations
        drawBorder(false, playerColor.getCurrentBorderColor());
        asciiTerminal.writeString(1, 0, "Character", playerColor.getCurrentTitleColor());

        // Experience
        asciiTerminal.writeString(1, 1, "Level "+player.getLevel(), Color.YELLOW);
        int currentExtStep = player.getExperienceFromLastStep();
        int ExpStep = player.getNeedExperienceForLevelUp();
        int maxExp = AsciiProgressHeroes.WINDOW_WIDTH/2 - 2;
        int currentExp = (int)((float)currentExtStep / (float)ExpStep * (float)maxExp);
        for(int i = 0; i < maxExp; i++) {
            char c = asciiTerminal.getCell(i+1, 1).data;
            asciiTerminal.write(i+1, 1, c, Color.YELLOW, i < currentExp ? Global.PROGRESS_BAR_COLOR : Color.BLACK);
        }

        // HP
        asciiTerminal.writeString(1, 2, "HP "+String.valueOf(player.getCurrentHp())+"/"+String.valueOf(player.getMaxHp()), Color.RED, Global.HP_BAR_COLOR);
        int maxLife = AsciiProgressHeroes.WINDOW_WIDTH/2 - 2;
        int currentLife = (int)((float)player.getCurrentHp() / (float)player.getMaxHp() * (float)maxLife);
        for(int i = 0; i < maxLife; i++) {
            char c = asciiTerminal.getCell(i+1, 2).data;
            asciiTerminal.write(i+1, 2, c, Color.RED, i < currentLife ? Global.HP_BAR_COLOR : Color.BLACK);
        }

        // Show
        drawBorder(true, Color.WHITE);
    }
}
