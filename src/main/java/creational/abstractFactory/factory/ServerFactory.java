package creational.abstractFactory.factory;

import creational.abstractFactory.beans.Computer;
import creational.abstractFactory.beans.Server;

public class ServerFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory() {

    }

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer(){
        return new Server(ram, hdd, cpu);
    }

}
