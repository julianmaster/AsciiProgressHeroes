package com.asciiprogressheroes.game.model;

/**
 * Created by Julien on 13/05/2017.
 */
public class Enemy extends Entity {
    private String name;

    public Enemy(Weapon basicWeapon, String name) {
        super(basicWeapon);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
