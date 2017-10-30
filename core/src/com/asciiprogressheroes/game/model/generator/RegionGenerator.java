package com.asciiprogressheroes.game.model.generator;

import com.asciiprogressheroes.game.model.Region;
import com.asciiprogressheroes.game.model.RegionName;

import java.util.Random;

/**
 * Created by Julien on 27/05/2017.
 */
public class RegionGenerator {

    private static Random rand = new Random();
    private static RegionName[] easyRegionName = new RegionName[]{RegionName.GRASSLANDS, RegionName.STEPPES, RegionName.FORESTS, RegionName.GROTTOS};
    private static RegionName[] mediumRegionName = new RegionName[]{RegionName.MOUNTAINS, RegionName.MINES, RegionName.RUINS, RegionName.TEMPLES};
    private static RegionName[] hardRegionName = new RegionName[]{RegionName.FORTRESS, RegionName.CATACOMBS, RegionName.CASTLES, RegionName.CRYPTS};

    public static Region newEasyRegion(int level) {
        int regionIndex = rand.nextInt(easyRegionName.length);

        int ennemies = rand.nextInt(3) + 1;
        // GRASSLANDS
        if(easyRegionName[regionIndex] == RegionName.GRASSLANDS) {
            for(int i = 0; i < ennemies; i++) {

            }
        }
        // STEPPES
        else if(easyRegionName[regionIndex] == RegionName.STEPPES) {
            for(int i = 0; i < ennemies; i++) {

            }
        }
        // FORESTS
        else if(easyRegionName[regionIndex] == RegionName.FORESTS) {
            for(int i = 0; i < ennemies; i++) {

            }
        }
        // GROTTOS
        else {
            for(int i = 0; i < ennemies; i++) {

            }
        }

        return null;
    }

    public static Region newMediumRegion(int level) {

        int ennemies = rand.nextInt(4) + 2;

        return null;
    }

    public static Region newHardRegion(int level) {

        int ennemies = rand.nextInt(4) + 4;

        return null;
    }
}
