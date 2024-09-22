package Behavioral.StrategyPattern;

import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class LoggerUtility {
    private static Logger logger = null;

    public static Logger getLogger() {
        if (logger == null) {
            try {
                logger = Logger.getLogger("PaymentLogger");
                FileHandler fileHandler = new FileHandler("payment_logs.log", true);
                logger.addHandler(fileHandler);
                SimpleFormatter formatter = new SimpleFormatter();
                fileHandler.setFormatter(formatter);
            } catch (Exception e) {
                System.err.println("Failed to initialize logger: " + e.getMessage());
            }
        }
        return logger;
    }
}
