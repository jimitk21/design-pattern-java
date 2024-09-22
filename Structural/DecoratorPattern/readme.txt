**Decorator Pattern Implementation in Java**

This project demonstrates the Decorator Design Pattern using a coffee shop scenario, allowing you to add various enhancements (like milk and sugar) to a basic coffee without modifying its structure. This pattern promotes flexibility and the ability to extend functionalities dynamically.

**Project Structure**

src/ - Source code directory
    Structural/ - Main package for the Decorator Pattern implementation
        DecoratorPattern/ - Package for Decorator Pattern classes
            Coffee.java - Component interface for coffee
            BasicCoffee.java - Concrete component class representing basic coffee
            CoffeeDecorator.java - Abstract decorator class for adding functionalities
            MilkDecorator.java - Concrete decorator class for adding milk to coffee
            SugarDecorator.java - Concrete decorator class for adding sugar to coffee
            DecoratorPatternDemo.java - Application entry point to demonstrate the pattern

**Key Classes**

    Coffee (Component Interface):
        Defines methods for getting the description and cost of a coffee.

    BasicCoffee (Concrete Component):
        Implements the Coffee interface and represents a basic coffee.

    CoffeeDecorator (Abstract Decorator):
        Implements the Coffee interface and contains a reference to a Coffee object, providing default implementations for the methods.

    MilkDecorator (Concrete Decorator):
        Extends CoffeeDecorator to add milk functionality to the coffee.

    SugarDecorator (Concrete Decorator):
        Extends CoffeeDecorator to add sugar functionality to the coffee.

    DecoratorPatternDemo (Application Entry Point):
        Demonstrates the use of the Decorator Pattern by creating different types of coffee and displaying their descriptions and costs.

**How to Run the Program**
**Commands**

  1) ** Compile the Java files**:

    ```bash

	javac Structural/DecoratorPattern/*.java

2) **Run the main application**:

```bash

    java Structural.DecoratorPattern.DecoratorPatternDemo

Make sure you are in the correct directory when running these commands.

**Use Cases**

    Coffee Customization:
        In a coffee shop, customers can customize their coffee orders by adding ingredients like milk or sugar. Using the Decorator Pattern, different decorators can be combined to create a personalized coffee order without altering the base coffee class.

    Dynamic Feature Addition:
        The Decorator Pattern allows adding new functionality at runtime. For example, if a new ingredient (like whipped cream) is introduced, a new decorator can be created without changing the existing codebase.