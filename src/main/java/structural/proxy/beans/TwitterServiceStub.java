package structural.proxy.beans;

public class TwitterServiceStub implements TwitterService {

    @Override
    public String getTimeline(String screenName) {
        return "Fake text from timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        System.out.println("POST");
    }
}
