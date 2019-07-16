package creational.builder;

import creational.builder.beans.Computer;

public class BulderTest {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("1TB", "4GB").build();
    }
}
