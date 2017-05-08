package com.asciiprogressheroes.game.view;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Actor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Julien on 07/05/2017.
 */
public abstract class CommonScreen implements Screen {

    private List<Actor> listActor = new ArrayList<>();

    @Override
    public void hide() {
        for(Actor actor : listActor) {
            actor.remove();
        }
    }

    public List<Actor> getListActor() {
        return listActor;
    }
}
