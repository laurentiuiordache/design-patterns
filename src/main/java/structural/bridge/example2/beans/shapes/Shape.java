package structural.bridge.example2.beans.shapes;

import structural.bridge.example2.beans.colors.Color;

public abstract class Shape {
    protected Color color;

    public Shape(Color color){
        this.color = color;
    }

    abstract public void applyColor();
}
