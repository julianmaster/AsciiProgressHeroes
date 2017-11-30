package com.asciiprogressheroes.game.model.generator;

import com.asciiprogressheroes.game.model.Enemy;
import com.asciiprogressheroes.game.model.Region;
import com.asciiprogressheroes.game.model.RegionDifficulty;

import java.util.LinkedList;
import java.util.Random;

/**
 * Created by Julien on 27/05/2017.
 */
public class RegionGenerator {

    private static Random rand = new Random();

    public static Region newRegion(RegionDifficulty regionDifficulty, int level) {
        int regionIndex = rand.nextInt(regionDifficulty.regionNames.length);

        int ennemiesCount = rand.nextInt(regionDifficulty.randomEnemyCount) + regionDifficulty.offsetEnemyCount;

        LinkedList<Enemy> ennemies = new LinkedList<>();
        for(int i = 0; i < ennemiesCount; i++) {
            ennemies.add(EntityGenerator.newEnemy(level, regionDifficulty.regionNames[regionIndex]));
        }

        return new Region(regionDifficulty.regionNames[regionIndex], ennemies);
    }
}
