# Factory Pattern Implementation in Java

This project demonstrates the **Factory Design Pattern** using a `ProductFactory` to create different types of products, such as `Phone` and `Laptop`. The Factory Pattern promotes loose coupling by providing a way to instantiate objects without exposing the instantiation logic to the client.

## Project Structure

src/ - Source code directory
    Creational/ - Main package for the Factory Pattern implementation
        FactoryPattern/ - Package for Factory Pattern classes
            Product.java - Interface defining the contract for products
            Phone.java - Concrete product class representing a phone
            Laptop.java - Concrete product class representing a laptop
            ProductFactory.java - Factory class responsible for creating product instances
            FactoryPatternDemo.java - Application entry point and test implementation of the Factory Pattern

### Key Classes

1. **Product (Interface)**:
    - Defines the `create()` method that must be implemented by all concrete products.

2. **Phone & Laptop (Concrete Products)**:
    - Implement the `Product` interface and provide specific implementations for the `create()` method.

3. **ProductFactory**:
    - Responsible for creating product instances based on the provided type.
    - Uses a method to handle product creation, centralizing instantiation logic.

4. **FactoryPatternDemo**:
    - Entry point of the application that demonstrates the usage of the Factory Pattern by creating products.

## How to Run the Program

### Commands

1. **Compile the Java files**:
   ```bash
   C:\Users\jimit\Desktop\designpatternjava> javac Creational/FactoryPattern/*.java

2. **Run the main application**:

   ```bash
   
    C:\Users\jimit\Desktop\designpatternjava> java Creational.FactoryPattern.FactoryPatternDemo

Make sure you are in the correct directory (C:\Users\jimit\Desktop\designpatternjava) when running these commands.

Use Cases

    E-Commerce Platforms:
        An e-commerce application can use the Factory Pattern to create different types of products (e.g., electronics, clothing) dynamically based on user selections without hardcoding the product types.

    Game Development:
        In a game, different types of characters or items can be created using the Factory Pattern, allowing developers to add new types of characters/items easily without modifying existing code.

Logging

All major actions, such as product creation and error handling, are logged using Java's logging framework, ensuring that the application behavior can be monitored.