package Behavioral.ObserverPattern;

import java.util.logging.Logger;

public class ObserverPatternApp {
    private static final Logger logger = LoggerUtility.getLogger();

    public static void main(String[] args) {
        logger.info("Starting ObserverPatternApp...");

        NewsAgency agency = new NewsAgency();

        NewsChannel channelAajTak = new NewsChannel("Aaj Tak");
        NewsApp appInshorts = new NewsApp("Inshorts");

        agency.addObserver(channelAajTak);
        agency.addObserver(appInshorts);

        // Sending news updates
        agency.setLatestNews("Chandrayaan-3 successfully lands on the moon!");
        agency.setLatestNews("India wins the Cricket World Cup!");

        logger.info("ObserverPatternApp finished execution.");
    }
}
