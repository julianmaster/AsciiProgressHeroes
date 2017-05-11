package com.asciiprogressheroes.game;

import com.asciiprogressheroes.game.model.Player;
import com.asciiprogressheroes.game.model.Weapon;
import com.asciiprogressheroes.game.model.World;

/**
 * Created by Julien on 11/05/2017.
 */
public class EntityGenerator {


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








    /*
     * Weapons
     */

    public static Weapon newBasicPlayerWeapon() {
        Weapon weapon = new Weapon();

        weapon.setMinDegat(2);
        weapon.setMaxDegat(4);

        return weapon;
    }
}
