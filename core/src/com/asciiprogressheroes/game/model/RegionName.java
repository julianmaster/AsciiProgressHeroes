package com.asciiprogressheroes.game.model;

/**
 * Created by Julien on 26/05/2017.
 */
public enum RegionName {
    LANDS("Lands"),
    STEPPES("Steppes"),
    FORESTS("Forests"),
    GROTTOS("Grottos"),
    MOUNTAINS("Mountains"),
    MINES("Mines"),
    RUINS("Ruins"),
    TEMPLES("Temples"),
    FORTRESS("Fortress"),
    CATACOMBS("Catacombs"),
    CASTLES("Castles"),
    CRYPTS("Crypts");

    public String name;

    RegionName(String name) {
        this.name = name;
    }
}
