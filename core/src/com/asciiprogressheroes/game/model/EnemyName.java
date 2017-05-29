package com.asciiprogressheroes.game.model;

/**
 * Created by Julien on 13/05/2017.
 */
public enum EnemyName {
    RAT("Rat"),
    GOBLIN("Goblin"),
    DWARF("Dwarf"),
    BANDIT("Bandit"),
    BASILISK("Basilisk"),
    GHOST("Ghost"),
    GHOUL("Ghoul"),
    MIMIC("Mimic"),
    SKELETON("Skeleton"),
    SPIDER("Spider"),
    TROLL("Troll"),
    DRAGON("Dragon"),
    WEREWOLF("Werewolf"),
    WITCH("Witch"),
    GNOLL("Gnoll"),
    SUCUBE("Sucube");

    public String name;

    EnemyName(String name) {
        this.name = name;
    }
}
