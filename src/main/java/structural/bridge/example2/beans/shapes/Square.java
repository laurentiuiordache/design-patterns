package structural.bridge.example2.beans.shapes;

import structural.bridge.example2.beans.colors.Color;

public class Square extends Shape {

    public Square(Color color){
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
