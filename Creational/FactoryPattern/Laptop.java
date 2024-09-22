package Creational.FactoryPattern;

// Concrete Product 2
public class Laptop implements Product {
    @Override
    public void create() {
        System.out.println("Laptop created.");
    }
}
