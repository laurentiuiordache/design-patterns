package behavioral.observer;

import behavioral.observer.beans.MessageStream;
import behavioral.observer.beans.PhoneClient;
import behavioral.observer.beans.Subject;
import behavioral.observer.beans.TabletClient;

public class TestObserver {
    public static void main(String[] args) {
        Subject subject = new MessageStream();

        PhoneClient phoneClient1 = new PhoneClient(subject);
        PhoneClient phoneClient2 = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient1.addMessage("Phone client 1 - Here is a new message!");
        phoneClient2.addMessage("Phone client 2 - ok");
        tabletClient.addMessate("Tablet client - Hy there");

        subject.detach(phoneClient1);
        subject.notifyObservers();
    }
}
