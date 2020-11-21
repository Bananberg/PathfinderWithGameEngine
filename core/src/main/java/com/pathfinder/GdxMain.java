package com.pathfinder;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.ArrayList;
import java.util.List;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class GdxMain extends ApplicationAdapter {

    private ShapeRenderer shapeRenderer;

    List<Drawable> drawableList;

    @Override
    public void create() {
        shapeRenderer = new ShapeRenderer();
        drawableList = new ArrayList<>();
        // create a Rectangle to logically represent the bucket
        GameEntity entity = new GameEntity();
        entity.x = 800.0f / 2 - 64.0f / 2; // center the bucket horizontally
        entity.y = 200; // bottom left corner of the bucket is 20 pixels above the bottom screen edge
        entity.width = 64 * 3;
        entity.height = 64 * 3;

        drawableList.add(entity);
    }

    @Override
    public void render() {
        drawShapes();
    }

    private void drawShapes() {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);

        drawableList.forEach(d -> d.drawShape(shapeRenderer));

        shapeRenderer.end();
    }


    @Override
    public void dispose() {
        super.dispose();
    }
}