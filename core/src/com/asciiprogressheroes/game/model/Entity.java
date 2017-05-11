package com.asciiprogressheroes.game.model;

/**
 * Created by Julien on 30/04/2017.
 */
public class Entity {
    private int baseHp = 100;
    private int currentHp;

    private int level = 1;

    private int strength = 5;
    private int dexterity = 5;
    private int intelligence = 5;
    private int constitution = 5;
    private int luck = 5;

    private Weapon weapon;
    private Weapon basicWeapon;
    private Helmet helmet;
    private Armor armor;

    public Entity(Weapon basicWeapon) {
        this.basicWeapon = basicWeapon;
        currentHp = getMaxHp();
    }

    public int getMaxHp() {
        return baseHp + constitution * level * 5;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Helmet getHelmet() {
        return helmet;
    }

    public void setHelmet(Helmet helmet) {
        this.helmet = helmet;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
