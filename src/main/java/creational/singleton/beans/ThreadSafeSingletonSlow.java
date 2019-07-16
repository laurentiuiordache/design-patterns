package creational.singleton.beans;

public class ThreadSafeSingletonSlow {

    private static ThreadSafeSingletonSlow instance;

    private ThreadSafeSingletonSlow() {
    }

    public synchronized static ThreadSafeSingletonSlow getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingletonSlow();
        }
        return instance;
    }
}
