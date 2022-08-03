package ml.spmc.java2roblox.api.instance;

import java.awt.*;

public class Instance {

    private final Part part;

    public Instance(PartList type) {
        part = new Part(type);
    }

    public Part getPart() {
        return part;
    }

}

class Part {

    private final PartList type;
    private String name;
    private float transparency;
    private Color color;

    Part(PartList type) {
        this.type = type;
    }

    void setName(String name) {
        this.name = name;
    }

    void setTransparency(float transparency) {
        this.transparency = transparency;
    }

    void setColor(Color color) {
        this.color = color;
    }

    String getName() {
        return name;
    }

    float getTransparency() {
        return transparency;
    }

    public Color getColor() {
        return color;
    }

}

enum PartList {
    CYLINDER,
    BLOCK,
    SPHERE,
    TRUSS
}