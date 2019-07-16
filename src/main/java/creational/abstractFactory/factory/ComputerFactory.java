package creational.abstractFactory.factory;

import creational.abstractFactory.beans.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory abstractFactory) {
        return abstractFactory.createComputer();
    }
}
