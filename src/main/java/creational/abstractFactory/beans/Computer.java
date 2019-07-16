package creational.abstractFactory.beans;

public abstract class Computer {

    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "Instance: " + this.getClass() + ",RAM: " + this.getRAM() + ", HDD: " + this.getHDD() + ", CPU: " + this.getCPU();
    }
}
