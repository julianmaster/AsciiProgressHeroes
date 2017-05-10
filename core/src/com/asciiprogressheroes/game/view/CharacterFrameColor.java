package com.asciiprogressheroes.game.view;

import com.asciiprogressheroes.game.AsciiProgressHeroes;
import com.badlogic.gdx.graphics.Color;

/**
 * Created by jmaitr03 on 10/05/2017.
 */
public class CharacterFrameColor {
    private Color BORDER_DEFAULT_COLOR = Color.DARK_GRAY;
    private Color BORDER_HIT_COLOR = new Color(0x8f0000ff);
    private Color BORDER_POISON_COLOR = new Color(0x008f00ff);

    private Color TITLE_DEFAULT_COLOR = Color.WHITE;
    private Color TITLE_HIT_COLOR = Color.RED;
    private Color TITLE_POISON_COLOR = Color.GREEN;

    private float currentHitTime = 0;
    private float currentPoisonTime = 0;
    private Color currentBorderColor = BORDER_DEFAULT_COLOR;
    private Color currentTitleColor = TITLE_DEFAULT_COLOR;

    public void update(float delta) {
        currentHitTime -= delta;
        if(currentHitTime < 0f) {
            currentHitTime = 0f;
        }

        currentPoisonTime -= delta;
        if(currentPoisonTime < 0f) {
            currentPoisonTime = 0f;
        }

        if(currentHitTime > 0f) {
            if(currentPoisonTime > currentHitTime) {
                // Border color
                Color tempBorderPoisonColor  = getPoisonColor(BORDER_DEFAULT_COLOR, BORDER_POISON_COLOR);
                currentBorderColor = getHitColor(tempBorderPoisonColor, BORDER_HIT_COLOR);
                // Title color
                Color tempTitlePoisonColor  = getPoisonColor(TITLE_DEFAULT_COLOR, TITLE_POISON_COLOR);
                currentTitleColor = getHitColor(tempTitlePoisonColor, TITLE_HIT_COLOR);
            }
            else {
                // Border color
                currentBorderColor = getHitColor(BORDER_DEFAULT_COLOR, BORDER_HIT_COLOR);
                // Title color
                currentTitleColor = getHitColor(TITLE_DEFAULT_COLOR, TITLE_HIT_COLOR);
            }
        }
        else if(currentPoisonTime > 0f) {
            // Border color
            currentBorderColor = getPoisonColor(BORDER_DEFAULT_COLOR, BORDER_POISON_COLOR);
            // Title color
            currentTitleColor = getPoisonColor(TITLE_DEFAULT_COLOR, TITLE_POISON_COLOR);
        }
        else {
            // Border color
            currentBorderColor = BORDER_DEFAULT_COLOR;
            // Title color
            currentTitleColor = TITLE_DEFAULT_COLOR;
        }
    }

    private Color getHitColor(Color otherColor, Color hitColor) {
        return interpolate(otherColor, hitColor, currentHitTime / AsciiProgressHeroes.COMBAT_TICK);
    }

    private Color getPoisonColor(Color defaultColor, Color poisonColor) {
        return interpolate(defaultColor, poisonColor, currentPoisonTime > AsciiProgressHeroes.COMBAT_TICK ? 1.0f : currentPoisonTime / AsciiProgressHeroes.COMBAT_TICK);
    }

    public void hit() {
        currentHitTime = AsciiProgressHeroes.COMBAT_TICK;
    }

    public void poison(int nbTick) {
        currentPoisonTime = AsciiProgressHeroes.COMBAT_TICK * nbTick;
    }

    public Color getCurrentBorderColor() {
        return currentBorderColor;
    }

    public Color getCurrentTitleColor() {
        return currentTitleColor;
    }

    private Color interpolate(Color colorA, Color colorB, float bAmount) {
        float aAmount = 1.0f - bAmount;
        float red = colorA.r * aAmount + colorB.r * bAmount;
        float green = colorA.g * aAmount + colorB.g * bAmount;
        float blue = colorA.b * aAmount + colorB.b * bAmount;
        return new Color(red, green, blue, 1);
    }
}
