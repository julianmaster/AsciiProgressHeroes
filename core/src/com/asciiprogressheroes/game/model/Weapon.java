package com.asciiprogressheroes.game.model;

/**
 * Created by Julien on 07/05/2017.
 */
public class Weapon extends Item {

    private int minDegat;
    private int maxDegat;

    public int getMinDegat() {
        return minDegat;
    }

    public void setMinDegat(int minDegat) {
        this.minDegat = minDegat;
    }

    public int getMaxDegat() {
        return maxDegat;
    }

    public void setMaxDegat(int maxDegat) {
        this.maxDegat = maxDegat;
    }
}
