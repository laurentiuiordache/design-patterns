package structural.proxy.beans;


import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

public class TwitterServiceImpl implements TwitterService {
    private static final String TWITTER_CONSUMER_KEY = "X5CcIMgRMRMwlXcEjwh8bUB9z";
    private static final String TWITTER_SECRET_KEY = "6Pzq6jNnfVlzy6FjDsDo90mWfLRZtRiqBV5EN76NepHSiTtHjU";
    private static final String TWITTER_ACCESS_TOKEN = "1013524525202407424-Q7sTjHv1v4BVw6nRRZx6KSBFiJCDrm";
    private static final String TWITTER_ACCESS_TOKEN_SECRET = "W47yvOn5oKTo3DKQxoUAr3LfJMNKsjRil1dexTtqR4Wjd";

    @Override
    public String getTimeline(String screenName) {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(TWITTER_CONSUMER_KEY)
                .setOAuthConsumerSecret(TWITTER_SECRET_KEY)
                .setOAuthAccessToken(TWITTER_ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        StringBuilder builder = new StringBuilder();
        try {
            Query query = new Query(screenName);
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    builder.append("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                    builder.append("\n");
                }
            } while ((query = result.nextQuery()) != null);

        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
        }
        return builder.toString();
    }
    @Override
    public void postToTimeline(String screenName, String message) {
        System.out.println("Post");
    }
}
