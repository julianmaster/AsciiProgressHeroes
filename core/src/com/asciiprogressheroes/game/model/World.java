package com.asciiprogressheroes.game.model;

/**
 * Created by Julien on 08/05/2017.
 */
public class World {
    private Player player;

    public static World newWorld() {
        return new World(new Player());
    }

    public static World loadWorld() {
        //TODO Load world from bytecode
        return null;
    }

    private World(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
