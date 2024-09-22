# Strategy Pattern Implementation in Java

This project demonstrates the **Strategy Design Pattern** through a payment processing system. It allows users to choose different payment methods, such as credit card and UPI, by dynamically setting the payment strategy at runtime. This pattern promotes flexibility and separation of concerns in payment handling.

## Project Structure

src/ - Source code directory
    Behavioral/ - Main package for the Strategy Pattern implementation
        StrategyPattern/ - Package for Strategy Pattern classes
            CustomException.java - Custom exception class for handling specific errors
            LoggerUtility.java - Utility class for logging actions and events
            PaymentContext.java - Context class that manages payment strategies
            PaymentStrategy.java - Interface defining the payment strategy contract
            CreditCardPayment.java - Concrete strategy class for credit card payments
            UpiPayment.java - Concrete strategy class for UPI payments
            StrategyPatternApp.java - Application entry point and test implementation of the Strategy Pattern


### Key Classes

1. **PaymentContext**:
   - Manages the current payment strategy.
   - Allows setting and executing different payment strategies.

2. **PaymentStrategy Interface**:
   - Defines the method `pay(int amount)` that all concrete payment strategies must implement.

3. **CreditCardPayment**:
   - Implements the `PaymentStrategy` for processing credit card payments.
   - Validates credit card details and processes payments accordingly.

4. **UpiPayment**:
   - Implements the `PaymentStrategy` for processing UPI payments.
   - Validates UPI ID and processes payments.

5. **LoggerUtility**:
   - Logs the activity of the system to a log file for tracking payment processing.

6. **CustomException**:
   - A custom exception class for handling specific errors in the Strategy Pattern implementation.

## How to Run the Program

### Commands

1. **Compile the Java files**:
   ```bash
   C:\Users\jimit\Desktop\designpatternjava> javac Behavioral/StrategyPattern/*.java

2. **Run the main application**:

```bash

	C:\Users\jimit\Desktop\designpatternjava> java Behavioral.StrategyPattern.StrategyPatternApp

Make sure you are in the correct directory (C:\Users\jimit\Desktop\designpatternjava) when running these commands.

Use Cases

    E-commerce Payment Processing:
        An e-commerce platform allows users to pay using different methods such as credit cards and UPI.
        The PaymentContext can switch between CreditCardPayment and UpiPayment strategies based on user selection, processing payments accordingly.

    Subscription Services:
        A subscription service offers various payment options for users to renew their subscriptions.
        Users can choose their preferred payment method, and the application can handle payment processing using the selected strategy, ensuring a seamless experience.

Logging

All major actions, such as setting payment strategies and processing payments, are logged in the payment_logs.log file located in the root directory.
