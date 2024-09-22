package Creational.FactoryPattern;

// Concrete Product 1
public class Phone implements Product {
    @Override
    public void create() {
        System.out.println("Phone created.");
    }
}
