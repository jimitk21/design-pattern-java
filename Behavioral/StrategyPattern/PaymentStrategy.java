package Behavioral.StrategyPattern;

public interface PaymentStrategy {
    void pay(int amount) throws CustomException;
}
