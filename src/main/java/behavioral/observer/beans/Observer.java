package behavioral.observer.beans;

public abstract class Observer {
    protected Subject subject;

    abstract void update();
}
