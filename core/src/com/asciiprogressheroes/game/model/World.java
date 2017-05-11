package com.asciiprogressheroes.game.model;

/**
 * Created by Julien on 08/05/2017.
 */
public class World {
    private Player player;

    public World(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
