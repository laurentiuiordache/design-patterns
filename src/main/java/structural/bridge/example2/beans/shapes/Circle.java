package structural.bridge.example2.beans.shapes;

import structural.bridge.example2.beans.colors.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
