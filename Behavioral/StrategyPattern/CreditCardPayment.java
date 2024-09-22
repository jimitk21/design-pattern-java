package Behavioral.StrategyPattern;

import java.util.logging.Logger;

public class CreditCardPayment implements PaymentStrategy {
    private static final Logger logger = LoggerUtility.getLogger();
    private String name;

    public CreditCardPayment(String name, String cardNumber) {
        if (name == null || cardNumber == null || cardNumber.length() != 16) {
            throw new IllegalArgumentException("Invalid Credit Card details.");
        }
        this.name = name;
    }

    @Override
    public void pay(int amount) throws CustomException {
        if (amount <= 0) {
            throw new CustomException("Invalid amount for credit card payment.");
        }
        logger.info("Processing Credit Card Payment for " + name);
        System.out.println(amount + " paid using Credit Card by " + name);
    }
}
