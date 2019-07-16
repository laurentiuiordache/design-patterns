package behavioral.observer.beans;

public class TabletClient extends Observer {

    public TabletClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessate(String message) {
        this.subject.setState(message + " - sent from tablet");
    }

    @Override
    void update() {
        System.out.println("Tablet stream " + subject.getState());
    }
}
