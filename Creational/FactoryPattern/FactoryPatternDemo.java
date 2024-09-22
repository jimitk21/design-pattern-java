package Creational.FactoryPattern;

import java.util.logging.Logger;

public class FactoryPatternDemo {

    private static final Logger LOGGER = Logger.getLogger(FactoryPatternDemo.class.getName());

    public static void main(String[] args) {
        try {
            // Create products using the factory
            Product phone = ProductFactory.getProduct("PHONE");
            phone.create();

            Product laptop = ProductFactory.getProduct("LAPTOP");
            laptop.create();
        } catch (IllegalArgumentException e) {
            LOGGER.severe("Error occurred: " + e.getMessage());
        }
    }
}
