package structural.proxy.beans;

public interface TwitterService {
    String getTimeline(String screenName);
    void postToTimeline(String screenName, String message);
}
