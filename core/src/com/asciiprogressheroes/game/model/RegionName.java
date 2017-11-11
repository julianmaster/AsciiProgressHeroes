package com.asciiprogressheroes.game.model;

/**
 * Created by Julien on 26/05/2017.
 */
public enum RegionName {
    GRASSLANDS("grasslands", new EnemyName[]{EnemyName.GOBLIN, EnemyName.BANDIT, EnemyName.GNOLL}),
    STEPPES("Steppes", new EnemyName[]{EnemyName.GOBLIN, EnemyName.BANDIT, EnemyName.GNOLL}),
    FORESTS("Forests", new EnemyName[]{}),
    GROTTOS("Grottos", new EnemyName[]{}),
    MOUNTAINS("Mountains", new EnemyName[]{}),
    MINES("Mines", new EnemyName[]{}),
    RUINS("Ruins", new EnemyName[]{}),
    TEMPLES("Temples", new EnemyName[]{}),
    FORTRESS("Fortress", new EnemyName[]{}),
    CATACOMBS("Catacombs", new EnemyName[]{}),
    CASTLES("Castles", new EnemyName[]{}),
    CRYPTS("Crypts", new EnemyName[]{});

    public String name;
    public EnemyName[] enemyNames;

    RegionName(String name, EnemyName[] enemyNames) {
        this.name = name;
        this.enemyNames = enemyNames;
    }
}
