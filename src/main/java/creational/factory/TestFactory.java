package creational.factory;

import creational.factory.beans.Computer;
import creational.factory.factory.ComputerFactory;
import creational.factory.factory.ComputerType;

public class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.createComputer(ComputerType.PC, "2 GB", "1 TB", "2.5 GHz");
        Computer server = ComputerFactory.createComputer(ComputerType.SERVER, "16 GB", "10 TB", "3.4 GHz");
        Computer superComputer = ComputerFactory.createComputer(ComputerType.SUPERCOMPUTER, "32 GB", "100 TB", "4.5 GHz");

        System.out.println(pc);
        System.out.println(server);
        System.out.println(superComputer);
    }
}
