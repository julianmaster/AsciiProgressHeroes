package com.asciiprogressheroes.game.model;

public enum RegionDifficulty {
    EASY(new RegionName[]{RegionName.GRASSLANDS, RegionName.STEPPES, RegionName.FORESTS, RegionName.GROTTOS}, 3, 1),
    MEDIUM(new RegionName[]{RegionName.MOUNTAINS, RegionName.MINES, RegionName.RUINS, RegionName.TEMPLES}, 4, 2),
    HARD(new RegionName[]{RegionName.FORTRESS, RegionName.CATACOMBS, RegionName.CASTLES, RegionName.CRYPTS}, 4, 4);

    public RegionName[] regionNames;
    public int randomCount;
    public int offsetCount;

    RegionDifficulty(RegionName[] regionNames, int randomCount, int offsetCount) {
        this.regionNames = regionNames;
        this.randomCount = randomCount;
        this.offsetCount = offsetCount;
    }
}
