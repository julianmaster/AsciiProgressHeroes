package com.asciiprogressheroes.game.model;

/**
 * Created by Julien on 30/04/2017.
 */
public class Player extends Entity {

    private int experience = 0;

    public Player(Weapon basicWeapon) {
        super(basicWeapon);
    }

    public void addExperience(int add) {
        experience += add;
        int step = 100;
        int tempExperience = experience;
        int tempLevel = 1;

        while (true) {
            if(tempExperience >= step) {
                tempLevel++;
                tempExperience -= step;
                step += step/2;
            }
            else {
                this.setLevel(tempLevel);
                return;
            }
        }
    }

    public int getExperienceFromLastStep() {
        int step = 100;
        int tempExperience = experience;

        while (true) {
            if(tempExperience >= step) {
                tempExperience -= step;
                step += step/2;
            }
            else {
                return tempExperience;
            }
        }
    }

    public int getNeedExperienceForLevelUp() {
        int step = 100;
        int tempExperience = experience;

        while (true) {
            if(tempExperience >= step) {
                tempExperience -= step;
                step += step/2;
            }
            else {
                return step;
            }
        }
    }
}
