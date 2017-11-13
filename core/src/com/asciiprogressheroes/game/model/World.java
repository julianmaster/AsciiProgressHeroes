package com.asciiprogressheroes.game.model;

import com.asciiprogressheroes.game.model.generator.EntityGenerator;
import com.asciiprogressheroes.game.model.generator.RegionGenerator;

import java.util.LinkedList;

/**
 * Created by Julien on 08/05/2017.
 */
public class World {
    private Player player;

    private Region currentRegion;

    private boolean generateRegion = true;

    private Region easyRegion;
    private Region mediumRegion;
    private Region hardRegion;

    public World(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public Region getCurrentRegion() {
        return currentRegion;
    }

    public void setCurrentRegion(Region currentRegion) {
        this.currentRegion = currentRegion;
    }

    public boolean isGenerateRegion() {
        return generateRegion;
    }

    public void setGenerateRegion(boolean generateRegion) {
        this.generateRegion = generateRegion;
    }

    public Region getEasyRegion() {
        return easyRegion;
    }

    public Region getMediumRegion() {
        return mediumRegion;
    }

    public Region getHardRegion() {
        return hardRegion;
    }

    public Enemy getCurrentEnemy() {
        return currentRegion.getEnemies().peekFirst();
    }

    public Enemy deleteCurrentEnemy() {
        return currentRegion.getEnemies().pollFirst();
    }

    public void generateRegions() {
        easyRegion = RegionGenerator.newRegion(RegionDifficulty.EASY, player.getLevel());
        mediumRegion = RegionGenerator.newRegion(RegionDifficulty.MEDIUM, player.getLevel());
        hardRegion = RegionGenerator.newRegion(RegionDifficulty.HARD, player.getLevel());
    }
}
