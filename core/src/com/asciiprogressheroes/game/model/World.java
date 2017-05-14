package com.asciiprogressheroes.game.model;

import java.util.LinkedList;

/**
 * Created by Julien on 08/05/2017.
 */
public class World {
    private Player player;
    private LinkedList<Enemy> enemies = new LinkedList<>();

    public World(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void addEnemy() {
        enemies.add(EntityGenerator.newEnemy());
    }

    public void addEnemies(int numberEnemies) {
        for(int i = 0; i < numberEnemies; i++) {
            addEnemy();
        }
    }

    public Enemy getCurrentEnemy() {
        return enemies.peekFirst();
    }

    public Enemy deleteCurrentEnemy() {
        return enemies.pollFirst();
    }
}
