package structural.decorator;

import structural.decorator.beans.DressingDecorator;
import structural.decorator.beans.MeatDecorator;
import structural.decorator.beans.Sandwich;
import structural.decorator.beans.SimpleSandwich;

public class TestDecorator {
    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator( new MeatDecorator( new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}
