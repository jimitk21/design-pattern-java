package Behavioral.StrategyPattern;

import java.util.Scanner;
import java.util.logging.Logger;

public class StrategyPatternApp {
    private static final Logger logger = LoggerUtility.getLogger();
    
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.println("Choose payment method: 1. Credit Card 2. UPI 3. Exit");
                int choice = scanner.nextInt();
                if (choice == 3) {
                    logger.info("Exiting application.");
                    break;
                }

                System.out.println("Enter payment amount:");
                int amount = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter cardholder name and card number:");
                        String name = scanner.next();
                        String cardNumber = scanner.next();
                        paymentContext.setPaymentStrategy(new CreditCardPayment(name, cardNumber));
                        break;
                    case 2:
                        System.out.println("Enter UPI ID:");
                        String upiId = scanner.next();
                        paymentContext.setPaymentStrategy(new UpiPayment(upiId));
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid choice.");
                }
                
                paymentContext.executePayment(amount);
                
            } catch (Exception e) {
                logger.severe("Error occurred: " + e.getMessage());
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}
