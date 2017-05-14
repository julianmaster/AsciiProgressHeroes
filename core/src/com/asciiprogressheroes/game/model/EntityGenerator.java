package com.asciiprogressheroes.game.model;

import com.asciiprogressheroes.game.model.Player;
import com.asciiprogressheroes.game.model.Weapon;
import com.asciiprogressheroes.game.model.World;

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
        return player;
    }





    /*
     * Enemies
     */

    public static Enemy newEnemy() {
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
