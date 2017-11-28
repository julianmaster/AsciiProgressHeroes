package com.asciiprogressheroes.game.view;

import com.asciiprogressheroes.game.AsciiProgressHeroes;
import com.asciiprogressheroes.game.model.Enemy;
import com.asciiprogressheroes.game.model.Player;
import com.asciiprogressheroes.game.model.Weapon;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;

import java.util.Random;

/**
 * Created by Julien on 10/05/2017.
 */
public class RegionScreen extends CommonScreen {

    private Random rand = new Random();
    private Float currentTickValue = 0f;
    private boolean playerNextTurn = true;

    public RegionScreen(final AsciiProgressHeroes game) {
        super(game);
    }

    @Override
    public void render(float delta) {
        // Player
        final Player player = game.getWorld().getPlayer();
        drawBorder(false, Color.DARK_GRAY);
        asciiTerminal.writeString(1, 0, "Character", Color.WHITE);

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

        // Attack
        asciiTerminal.writeString(1, 4, "Dmg: "+player.getWeapon().getMinDegat()+"-"+player.getWeapon().getMaxDegat(), Color.WHITE);







        // Enemy
        Enemy currentEnemy = game.getWorld().getCurrentEnemy();
        drawBorder(true, Color.DARK_GRAY);
        String enemyName = currentEnemy.getName().name;
        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH - 1 - enemyName.length(), 0, enemyName, Color.WHITE);

        // Enemy experience
        String enemyLevel = "Level "+currentEnemy.getLevel();
        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH - 1 - enemyLevel.length(), 1, enemyLevel, Color.YELLOW);

        // Enemy HP
        String enemyHP = "HP "+String.valueOf(currentEnemy.getCurrentHp())+"/"+String.valueOf(currentEnemy.getMaxHp());
        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH - 1 - enemyHP.length(), 2, enemyHP, Color.RED, Global.HP_BAR_COLOR);
        int enemyMaxLife = AsciiProgressHeroes.WINDOW_WIDTH/2 - 2;
        int enemyCurrentLife = (int)((float)currentEnemy.getCurrentHp() / (float)currentEnemy.getMaxHp() * (float)maxLife);
        for(int i = 0; i < maxLife; i++) {
            char c = asciiTerminal.getCell(AsciiProgressHeroes.WINDOW_WIDTH - 2 - i, 2).data;
            asciiTerminal.write(AsciiProgressHeroes.WINDOW_WIDTH - 2 - i, 2, c, Color.RED, i < enemyCurrentLife ? Global.HP_BAR_COLOR : Color.BLACK);
        }

        // Enemy attack
        String enemyWeapon = "Dmg: "+currentEnemy.getWeapon().getMinDegat()+"-"+currentEnemy.getWeapon().getMaxDegat();
        asciiTerminal.writeString(AsciiProgressHeroes.WINDOW_WIDTH - 1 - enemyWeapon.length(), 4, enemyWeapon, Color.WHITE);







        // Update
        currentTickValue += delta;
        if(currentTickValue >= Global.TICK_DURATION) {
            currentTickValue -= Global.TICK_DURATION;

            if(playerNextTurn) {
                int degat = rand.nextInt(player.getWeapon().getMaxDegat() - player.getWeapon().getMinDegat() + 1) +player.getWeapon().getMinDegat();
                currentEnemy.setCurrentHp(currentEnemy.getCurrentHp() - degat);
                if(currentEnemy.getCurrentHp() <= 0) {
                    game.getWorld().deleteCurrentEnemy();
                }
            }
            else {
                int degat = rand.nextInt(currentEnemy.getWeapon().getMaxDegat() - currentEnemy.getWeapon().getMinDegat() + 1) +currentEnemy.getWeapon().getMinDegat();
                player.setCurrentHp(player.getCurrentHp() - degat);
                if(player.getCurrentHp() <= 0) {
                    game.setScreen(new CityScreen(game));
                }
            }

            playerNextTurn = !playerNextTurn;

            if(game.getWorld().getCurrentEnemy() == null) {
                game.setScreen(new CityScreen(game));
            }
        }
    }

    @Override
    public void show() {

    }
}
