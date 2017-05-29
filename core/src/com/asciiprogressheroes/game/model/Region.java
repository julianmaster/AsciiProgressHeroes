package com.asciiprogressheroes.game.model;

import java.util.List;

/**
 * Created by Julien on 27/05/2017.
 */
public class Region {
    private RegionName regionName;
    private List<Enemy> enemies;

    public Region(RegionName regionName, List<Enemy> enemies) {
        this.regionName = regionName;
        this.enemies = enemies;
    }

    public RegionName getRegionName() {
        return regionName;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }
}
