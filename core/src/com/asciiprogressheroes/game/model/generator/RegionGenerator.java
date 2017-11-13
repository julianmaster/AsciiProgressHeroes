package com.asciiprogressheroes.game.model.generator;

import com.asciiprogressheroes.game.model.Enemy;
import com.asciiprogressheroes.game.model.Region;
import com.asciiprogressheroes.game.model.RegionDifficulty;
import com.asciiprogressheroes.game.model.RegionName;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Julien on 27/05/2017.
 */
public class RegionGenerator {

    private static Random rand = new Random();

    public static Region newRegion(RegionDifficulty regionDifficulty, int level) {
        int regionIndex = rand.nextInt(regionDifficulty.regionNames.length);

        int ennemiesCount = rand.nextInt(regionDifficulty.randomCount) + regionDifficulty.offsetCount;

        LinkedList<Enemy> ennemies = new LinkedList<>();
        for(int i = 0; i < ennemiesCount; i++) {
            ennemies.add(EntityGenerator.newEasyEnemy(level, regionDifficulty.regionNames[regionIndex]));
        }

        return new Region(regionDifficulty.regionNames[regionIndex], ennemies);
    }
}
