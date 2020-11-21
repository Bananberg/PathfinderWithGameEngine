package com.pathfinder;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;


public class GameEntity implements Drawable {
    float x, y;
    float width, height;

    @Override
    public void drawShape(ShapeRenderer shapeRenderer) {
        shapeRenderer.setColor(Color.PINK);
        shapeRenderer.rect(x, y, width, height);
    }
}
