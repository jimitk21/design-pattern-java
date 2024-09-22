package Behavioral.StrategyPattern;

import java.util.logging.Logger;

public class UpiPayment implements PaymentStrategy {
    private static final Logger logger = LoggerUtility.getLogger();
    private String upiId;

    public UpiPayment(String upiId) {
        if (upiId == null || !upiId.contains("@")) {
            throw new IllegalArgumentException("Invalid UPI ID.");
        }
        this.upiId = upiId;
    }

    @Override
    public void pay(int amount) throws CustomException {
        if (amount <= 0) {
            throw new CustomException("Invalid amount for UPI payment.");
        }
        logger.info("Processing UPI Payment for " + upiId);
        System.out.println(amount + " paid using UPI (ID: " + upiId + ")");
    }
}
