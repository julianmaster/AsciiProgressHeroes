package com.asciiprogressheroes.game.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Julien on 27/05/2017.
 */
public class Region {
    private RegionName regionName;
    private LinkedList<Enemy> enemies;

    public Region(RegionName regionName, LinkedList<Enemy> enemies) {
        this.regionName = regionName;
        this.enemies = enemies;
    }

    public RegionName getRegionName() {
        return regionName;
    }

    public LinkedList<Enemy> getEnemies() {
        return enemies;
    }
}
