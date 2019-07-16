package creational.singleton.beans;

public class StaticBlockSingleton {

    private static final StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception ex) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
