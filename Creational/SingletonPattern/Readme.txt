# Singleton Pattern Implementation in Java

This project demonstrates the **Singleton Design Pattern** using a `DatabaseConnection` class. The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it.

## Project Structure

src/ - Source code directory
    Creational/ - Main package for the Singleton Pattern implementation
        SingletonPattern/ - Package for Singleton Pattern classes
            DatabaseConnection.java - Class implementing the Singleton pattern for database connections
            SingletonPatternDemo.java - Application entry point demonstrating the Singleton pattern

### Key Classes

1. **DatabaseConnection**:
    - Implements the Singleton Pattern.
    - Provides a global access point to the single instance of the database connection.
    - Contains methods for database operations, such as executing queries.

2. **SingletonPatternDemo**:
    - Entry point of the application that demonstrates the usage of the Singleton Pattern by creating instances of `DatabaseConnection` and verifying they are the same.

## How to Run the Program

### Commands

1. **Compile the Java files**:
   ```bash
   C:\Users\jimit\Desktop\designpatternjava> javac Creational/SingletonPattern/*.java

2. **Run the main application**:
   ```bash
	C:\Users\jimit\Desktop\designpatternjava> java Creational.SingletonPattern.SingletonPatternDemo

Make sure you are in the correct directory (C:\Users\jimit\Desktop\designpatternjava) when running these commands.

Use Cases

    Database Connections:
        The Singleton Pattern is commonly used to manage database connections, ensuring that only one connection is active at a time, which helps prevent resource wastage and connection conflicts.

    Logging:
        A logging utility can be implemented as a singleton to ensure that all parts of an application share the same logging instance, facilitating consistent logging behavior and configuration.

Logging

All major actions, such as instance creation and query execution, are logged, allowing you to monitor the behavior of the application.