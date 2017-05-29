package com.asciiprogressheroes.game.model.generator;

import com.asciiprogressheroes.game.model.Region;
import com.asciiprogressheroes.game.model.RegionName;

import java.util.Random;

/**
 * Created by Julien on 27/05/2017.
 */
public class RegionGenerator {

    private static Random rand = new Random();
    private static RegionName[] easyRegionName = new RegionName[]{RegionName.LANDS, RegionName.STEPPES, RegionName.FORESTS, RegionName.GROTTOS};
    private static RegionName[] mediumRegionName = new RegionName[]{RegionName.MOUNTAINS, RegionName.MINES, RegionName.RUINS, RegionName.TEMPLES};
    private static RegionName[] hardRegionName = new RegionName[]{RegionName.FORTRESS, RegionName.CATACOMBS, RegionName.CASTLES, RegionName.CRYPTS};

    public static Region newEasyRegion(int level) {
        int regionIndex = rand.nextInt(easyRegionName.length);

        if(easyRegionName[regionIndex] == RegionName.LANDS) {

        }
        else if(easyRegionName[regionIndex] == RegionName.STEPPES) {

        }
        else if(easyRegionName[regionIndex] == RegionName.FORESTS) {

        }
        else {

        }

        return null;
    }

    public static Region newMediumRegion(int level) {

        return null;
    }

    public static Region newHardRegion(int level) {

        return null;
    }
}
