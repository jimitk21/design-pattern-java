package Behavioral.ObserverPattern;

import java.util.logging.Logger;

public class NewsChannel implements Observer {
    private static final Logger logger = LoggerUtility.getLogger();
    private String channelName;

    public NewsChannel(String channelName) {
        if (channelName == null || channelName.isEmpty()) {
            throw new IllegalArgumentException("Channel name cannot be null or empty.");
        }
        this.channelName = channelName;
    }

    @Override
    public void update(String message) {
        System.out.println(channelName + " received news update: " + message);
        logger.info(channelName + " received news update.");
    }
}
