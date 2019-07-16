package structural.bridge.example1;

import structural.bridge.example1.beans.BlueCircle;
import structural.bridge.example1.beans.Circle;
import structural.bridge.example1.beans.RedSquare;
import structural.bridge.example1.beans.Square;

public class TestBridge {
    public static void main(String[] args) {
        Circle circle = new BlueCircle();
        Square square = new RedSquare();

        circle.applyColor();
        square.applyColor();
    }
}
