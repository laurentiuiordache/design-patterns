package creational.abstractFactory;

import creational.abstractFactory.beans.*;
import creational.abstractFactory.factory.ComputerFactory;
import creational.abstractFactory.factory.PCFactory;
import creational.abstractFactory.factory.ServerFactory;

public class Main {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory(){
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "1 TB", "2.5Gh"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("32Gb","10TB","2.9 Gh"));

        System.out.println(pc);
        System.out.println(server);
    }
}
