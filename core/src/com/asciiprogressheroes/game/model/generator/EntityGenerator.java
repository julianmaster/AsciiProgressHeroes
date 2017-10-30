package com.asciiprogressheroes.game.model.generator;

import com.asciiprogressheroes.game.model.*;

import java.util.Random;

/**
 * Created by Julien on 11/05/2017.
 */
public class EntityGenerator {

    private static final Random rand = new Random();

    /*
     * World
     */

    public static World newWorld() {
        World world = new World(newPlayer());
        return world;
    }




    /*
     * Player
     */

    public static Player newPlayer() {
        Player player = new Player(newBasicPlayerWeapon());
        player.setStrength(5);
        player.setDexterity(5);
        player.setIntelligence(5);
        player.setConstitution(5);
        player.setLuck(5);
        player.setCurrentHp(player.getMaxHp());
        return player;
    }





    /*
     * Enemies
     */

    public static Enemy newRandomEnemy() {
        int index = rand.nextInt(EnemyName.values().length);
        Enemy enemy = new Enemy(newBasicEnemyWeapon(), EnemyName.values()[index].name());
        return enemy;
    }

    public static Enemy newEasyEnemy() {
        int index = rand.nextInt(EnemyName.values().length);
        Enemy enemy = new Enemy(newBasicEnemyWeapon(), EnemyName.values()[index].name());
        return enemy;
    }




    /*
     * Weapons
     */

    public static Weapon newBasicPlayerWeapon() {
        Weapon weapon = new Weapon();

        weapon.setMinDegat(2);
        weapon.setMaxDegat(4);

        return weapon;
    }

    public static Weapon newBasicEnemyWeapon() {
        Weapon weapon = new Weapon();

        weapon.setMinDegat(1);
        weapon.setMaxDegat(3);

        return weapon;
    }
}
