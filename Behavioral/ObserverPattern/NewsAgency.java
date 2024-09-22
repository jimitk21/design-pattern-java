package Behavioral.ObserverPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class NewsAgency {
    private static final Logger logger = LoggerUtility.getLogger();
    private List<Observer> observers = new ArrayList<>();
    private String latestNews;

    public void addObserver(Observer observer) {
        if (observer == null) {
            throw new IllegalArgumentException("Observer cannot be null.");
        }
        observers.add(observer);
        logger.info(observer.getClass().getSimpleName() + " added to the list of observers.");
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
        logger.info(observer.getClass().getSimpleName() + " removed from the list of observers.");
    }

    public void setLatestNews(String news) {
        if (news == null || news.isEmpty()) {
            throw new IllegalArgumentException("News cannot be null or empty.");
        }
        this.latestNews = news;
        logger.info("Latest news set: " + news);
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestNews);
        }
        logger.info("Notified all observers.");
    }
}
