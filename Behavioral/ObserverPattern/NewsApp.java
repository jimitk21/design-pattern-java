package Behavioral.ObserverPattern;

import java.util.logging.Logger;

public class NewsApp implements Observer {
    private static final Logger logger = LoggerUtility.getLogger();
    private String appName;

    public NewsApp(String appName) {
        if (appName == null || appName.isEmpty()) {
            throw new IllegalArgumentException("App name cannot be null or empty.");
        }
        this.appName = appName;
    }

    @Override
    public void update(String message) {
        System.out.println(appName + " received news update: " + message);
        logger.info(appName + " received news update.");
    }
}
