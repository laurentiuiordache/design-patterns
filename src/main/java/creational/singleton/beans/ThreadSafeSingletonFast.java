package creational.singleton.beans;

public class ThreadSafeSingletonFast {

    private static ThreadSafeSingletonFast instance;

    private ThreadSafeSingletonFast() {
    }

    public static ThreadSafeSingletonFast getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingletonFast.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingletonFast();
                }
            }
        }
        return instance;
    }

}
