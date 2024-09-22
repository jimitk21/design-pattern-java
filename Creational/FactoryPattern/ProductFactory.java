package Creational.FactoryPattern;

import java.util.logging.Logger;

// Factory class
public class ProductFactory {

    private static final Logger LOGGER = Logger.getLogger(ProductFactory.class.getName());

    public static Product getProduct(String type) {
        if (type == null || type.trim().isEmpty()) {
            LOGGER.warning("Product type cannot be null or empty.");
            throw new IllegalArgumentException("Product type cannot be null or empty.");
        }

        switch (type.toUpperCase()) {
            case "PHONE":
                return new Phone();
            case "LAPTOP":
                return new Laptop();
            default:
                LOGGER.warning("Unknown product type: " + type);
                throw new IllegalArgumentException("Unknown product type: " + type);
        }
    }
}
