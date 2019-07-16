package structural.proxy;

import structural.proxy.beans.SecurityProxy;
import structural.proxy.beans.TwitterService;
import structural.proxy.beans.TwitterServiceStub;

public class testProxy {
    public static void main(String[] args) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
        System.out.println(service.getTimeline(null));
        service.postToTimeline("","");
    }
}
