package com.asciiprogressheroes.game.view;

import com.badlogic.gdx.graphics.Color;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Julien on 07/05/2017.
 */
public class RainbowColor {

    public static final int TIME_CHANGE_COLOR = 12;

    private static List<Color> colors = new LinkedList<Color>() {{
        add(Color.RED);
        add(Color.GREEN);
        add(Color.BLUE);
        add(Color.RED);
    }};

    private static Color color = colors.get(0);
    private static float currentTime = 0;

    public static void update(float delta) {
        currentTime += delta;
        currentTime  = currentTime % TIME_CHANGE_COLOR;

        float position = currentTime * (colors.size() - 1) / TIME_CHANGE_COLOR;

        color = interpolate(colors.get((int)position), colors.get((int)position+1), position % 1);
    }

    private static Color interpolate(Color colorA, Color colorB, float bAmount) {
        float aAmount = 1.0f - bAmount;
        float red = colorA.r * aAmount + colorB.r * bAmount;
        float green = colorA.g * aAmount + colorB.g * bAmount;
        float blue = colorA.b * aAmount + colorB.b * bAmount;
        return new Color(red, green, blue, 1);
    }

    public static Color getColor() {
        return color;
    }
}
