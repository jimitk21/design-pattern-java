package Behavioral.StrategyPattern;

import java.util.logging.Logger;

public class PaymentContext {
    private static final Logger logger = LoggerUtility.getLogger();
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        if (paymentStrategy == null) {
            throw new IllegalArgumentException("Payment strategy cannot be null.");
        }
        this.paymentStrategy = paymentStrategy;
        logger.info("Payment strategy set: " + paymentStrategy.getClass().getSimpleName());
    }

    public void executePayment(int amount) {
        try {
            if (paymentStrategy == null) {
                throw new CustomException("Payment strategy not set.");
            }
            paymentStrategy.pay(amount);
        } catch (CustomException e) {
            logger.severe("Payment execution failed: " + e.getMessage());
        }
    }
}
