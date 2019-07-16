package creational.factory.factory;

import creational.factory.beans.Computer;
import creational.factory.beans.PC;
import creational.factory.beans.Server;
import creational.factory.beans.SuperComputer;

public class ComputerFactory {

    public static Computer createComputer(ComputerType type, String ram, String hdd, String cpu) {

        Computer computer = null;
        switch (type) {
            case PC:
                computer = new PC(ram, hdd, cpu);
                break;
            case SERVER:
                computer = new Server(ram, hdd, cpu);
                break;
            case SUPERCOMPUTER:
                computer = new SuperComputer(ram, hdd, cpu);
                break;
        }

        return computer;
    }
}
