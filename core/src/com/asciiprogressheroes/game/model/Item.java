package com.asciiprogressheroes.game.model;

/**
 * Created by Julien on 07/05/2017.
 */
public class Item {
    private int bonusHp;
    private int bonusStrength;
    private int bonusDexterity;
    private int bonusIntelligence;
    private int bonusConstitution;
    private int bonusLuck;

    public int getBonusHp() {
        return bonusHp;
    }

    public void setBonusHp(int bonusHp) {
        this.bonusHp = bonusHp;
    }

    public int getBonusStrength() {
        return bonusStrength;
    }

    public void setBonusStrength(int bonusStrength) {
        this.bonusStrength = bonusStrength;
    }

    public int getBonusDexterity() {
        return bonusDexterity;
    }

    public void setBonusDexterity(int bonusDexterity) {
        this.bonusDexterity = bonusDexterity;
    }

    public int getBonusIntelligence() {
        return bonusIntelligence;
    }

    public void setBonusIntelligence(int bonusIntelligence) {
        this.bonusIntelligence = bonusIntelligence;
    }

    public int getBonusConstitution() {
        return bonusConstitution;
    }

    public void setBonusConstitution(int bonusConstitution) {
        this.bonusConstitution = bonusConstitution;
    }

    public int getBonusLuck() {
        return bonusLuck;
    }

    public void setBonusLuck(int bonusLuck) {
        this.bonusLuck = bonusLuck;
    }
}
