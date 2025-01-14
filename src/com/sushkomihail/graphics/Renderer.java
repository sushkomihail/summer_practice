package com.sushkomihail.graphics;

import java.awt.*;
import java.util.ArrayList;

public class Renderer {
    private final ArrayList<RenderObject> renderObjects = new ArrayList<>();

    public void addRenderObject(RenderObject renderObject) {
        renderObjects.add(renderObject);
    }

    public void removeRenderObject(RenderObject renderObject) {
        renderObjects.remove(renderObject);
    }

    public void clear() {
        renderObjects.clear();
    }

    public void render(Graphics2D graphics) {
        ArrayList<RenderObject> renderObjectsCopy = new ArrayList<>(renderObjects);

        for (RenderObject renderObject : renderObjectsCopy) {
            renderObject.render(graphics);
        }
    }
}
