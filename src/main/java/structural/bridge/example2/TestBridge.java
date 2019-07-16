package structural.bridge.example2;

import structural.bridge.example2.beans.colors.*;
import structural.bridge.example2.beans.shapes.*;

public class TestBridge {

    public static void main(String[] args) {
        Color blue = new Blue();
        Color red = new Red();
        Color green = new Green();

        Shape square = new Square(blue);
        Shape circle = new Circle(red);
        Shape rectangle = new Rectangle(green);

        square.applyColor();
        circle.applyColor();
        rectangle.applyColor();

    }
}
