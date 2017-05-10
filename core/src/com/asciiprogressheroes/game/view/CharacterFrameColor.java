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
                Color tempPoisonColor  = getPoisonColor();
                currentBorderColor = getHitColor(tempPoisonColor);
            }
            else {
                currentBorderColor = getHitColor(BORDER_DEFAULT_COLOR);
            }
        }
        else if(currentPoisonTime > 0f) {
            currentBorderColor = getPoisonColor();
        }
        else {
            currentBorderColor = BORDER_DEFAULT_COLOR;
        }
    }

    private Color getHitColor(Color otherColor) {
        return interpolate(otherColor, BORDER_HIT_COLOR, currentHitTime / AsciiProgressHeroes.COMBAT_TICK);
    }

    private Color getPoisonColor() {
        return interpolate(BORDER_DEFAULT_COLOR, BORDER_POISON_COLOR, currentPoisonTime > AsciiProgressHeroes.COMBAT_TICK ? 1.0f : currentPoisonTime / AsciiProgressHeroes.COMBAT_TICK);
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

    private Color interpolate(Color colorA, Color colorB, float bAmount) {
        float aAmount = 1.0f - bAmount;
        float red = colorA.r * aAmount + colorB.r * bAmount;
        float green = colorA.g * aAmount + colorB.g * bAmount;
        float blue = colorA.b * aAmount + colorB.b * bAmount;
        return new Color(red, green, blue, 1);
    }
}
