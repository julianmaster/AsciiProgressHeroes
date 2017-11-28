package com.asciiprogressheroes.game.model;

/**
 * Created by Julien on 13/05/2017.
 */
public class Enemy extends Entity {
    private EnemyName name;

    public Enemy(Weapon basicWeapon, EnemyName name) {
        super(basicWeapon);
        this.name = name;
    }

    public EnemyName getName() {
        return name;
    }
}
