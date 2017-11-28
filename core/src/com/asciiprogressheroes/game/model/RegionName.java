package com.asciiprogressheroes.game.model;

/**
 * Created by Julien on 26/05/2017.
 */
public enum RegionName {
    GRASSLANDS("grasslands", new EnemyName[]{
            EnemyName.GOBLIN,
            EnemyName.BANDIT,
            EnemyName.GNOLL,
            EnemyName.COBRA,
            EnemyName.RABBIT
    }),
    STEPPES("Steppes", new EnemyName[]{
            EnemyName.GOBLIN,
            EnemyName.BANDIT,
            EnemyName.GNOLL,
            EnemyName.TROLL,
            EnemyName.BEAR,
            EnemyName.CENTAUR,
            EnemyName.OGRE,
            EnemyName.RABBIT,
            EnemyName.DWARF
    }),
    FORESTS("Forests", new EnemyName[]{
            EnemyName.WEREWOLF,
            EnemyName.SPIDER,
            EnemyName.RAT,
            EnemyName.BASILISK,
            EnemyName.TROLL,
            EnemyName.RABBIT
    }),
    GROTTOS("Grottos", new EnemyName[]{
            EnemyName.RAT,
            EnemyName.GOBLIN,
            EnemyName.SKELETON,
            EnemyName.SPIDER,
            EnemyName.TROLL,
            EnemyName.WEREWOLF,
            EnemyName.GNOLL,
            EnemyName.GOLEM,
            EnemyName.ZOMBIE,
            EnemyName.BAT,
            EnemyName.BIGFOOT,
            EnemyName.OGRE
    }),
    MOUNTAINS("Mountains", new EnemyName[]{
            EnemyName.SKELETON,
            EnemyName.TROLL,
            EnemyName.WEREWOLF,
            EnemyName.GOLEM,
            EnemyName.BIGFOOT,
            EnemyName.OGRE,
            EnemyName.YETI,
            EnemyName.DWARF,
            EnemyName.BEAR,
            EnemyName.BANDIT,
            EnemyName.VULTURE
    }),
    MINES("Mines", new EnemyName[]{
            EnemyName.RAT,
            EnemyName.GOBLIN,
            EnemyName.BANDIT,
            EnemyName.GHOST,
            EnemyName.GHOUL,
            EnemyName.SUCUBE,
            EnemyName.ZOMBIE,
            EnemyName.WEREWOLF,
            EnemyName.BAT,
            EnemyName.GNOLL,
            EnemyName.GOLEM,
            EnemyName.COBRA,
            EnemyName.SCORPION,
            EnemyName.BANSHEE,
            EnemyName.OGRE,
            EnemyName.MIMIC
    }),
    RUINS("Ruins", new EnemyName[]{
            EnemyName.GHOST,
            EnemyName.GHOUL,
            EnemyName.SUCUBE,
            EnemyName.ZOMBIE,
            EnemyName.WEREWOLF,
            EnemyName.GNOLL,
            EnemyName.GOLEM,
            EnemyName.BANSHEE,
            EnemyName.OGRE,
            EnemyName.SKELETON,
            EnemyName.WITCH
    }),
    TEMPLES("Temples", new EnemyName[]{

    }),
    FORTRESS("Fortress", new EnemyName[]{

    }),
    CATACOMBS("Catacombs", new EnemyName[]{
            EnemyName.MIMIC,
            EnemyName.SPIDER,
            EnemyName.SUCUBE,
            EnemyName.BAT,
            EnemyName.SKELETON,
            EnemyName.WITCH,
            EnemyName.ZOMBIE,
            EnemyName.GHOST,
            EnemyName.GHOUL,
            EnemyName.DEMON,
            EnemyName.VAMPIRE
    }),
    CASTLES("Castles", new EnemyName[]{
            EnemyName.SKELETON,
            EnemyName.WITCH,
            EnemyName.ZOMBIE,
            EnemyName.GHOST,
            EnemyName.GHOUL,
            EnemyName.VAMPIRE,
            EnemyName.BANSHEE,
            EnemyName.DEMON
    }),
    CRYPTS("Crypts", new EnemyName[]{
            EnemyName.CERBERUS,
            EnemyName.HYDRA,
            EnemyName.CYCLOPS,
            EnemyName.ELEMENTAL,
            EnemyName.DRAGON,
            EnemyName.SUCUBE,
            EnemyName.TITAN,
            EnemyName.VALKYRIE
    });

    public String name;
    public EnemyName[] enemyNames;

    RegionName(String name, EnemyName[] enemyNames) {
        this.name = name;
        this.enemyNames = enemyNames;
    }
}
