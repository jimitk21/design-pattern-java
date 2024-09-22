# Observer Pattern Implementation in Java

This project demonstrates the **Observer Design Pattern** using a `NewsAgency` as the subject and multiple observers, such as `NewsApp` and `NewsChannel`, which get notified when the `NewsAgency` publishes new updates. The pattern decouples the subject and its observers, allowing for flexible and dynamic addition/removal of observers.

## Project Structure

src/ - Source code directory
    Behavioral/ - Main package for the Observer Pattern implementation
        ObserverPattern/ - Package for Observer Pattern classes
            CustomException.java - Custom exception class for handling specific errors
            LoggerUtility.java - Utility class for logging actions and events
            NewsAgency.java - Subject class that notifies observers of news updates
            NewsApp.java - Concrete Observer class representing a news application
            NewsChannel.java - Concrete Observer class representing a news channel
            Observer.java - Interface that defines the Observer contract
            ObserverPatternApp.java - Application entry point and test implementation of the Observer Pattern



### Key Classes

1. **NewsAgency (Subject)**:
    - Manages a list of observers.
    - Notifies all registered observers when there is a new update.

2. **Observer Interface**:
    - Defines a method `update(String message)` that is implemented by observers.

3. **NewsApp & NewsChannel (Observers)**:
    - Implement the `Observer` interface and get notified when `NewsAgency` publishes a new update.
    - Each observer can handle the update (e.g., by displaying it).

4. **LoggerUtility**:
    - Logs the activity of the system to a log file.

5. **CustomException**:
    - A custom exception class for handling specific errors in the Observer Pattern implementation.

## How to Run the Program

### Commands

1. **Compile the Java files**:
   ```bash
   C:\Users\jimit\Desktop\designpatternjava> javac Behavioral/ObserverPattern/*.java

2. **Run the main application**:

  ```bash

	C:\Users\jimit\Desktop\designpatternjava> java Behavioral.ObserverPattern.ObserverPatternApp

Make sure you are in the correct directory (C:\Users\jimit\Desktop\designpatternjava) when running these commands.

**Use Cases**:
1. Breaking News Distribution

    A news agency frequently receives breaking news and needs to distribute it to various outlets like news apps and TV channels.
    The NewsAgency acts as the subject that receives news updates and notifies all its observers, such as NewsApp and NewsChannel.
    When new breaking news is set in NewsAgency, all registered observers are updated immediately, allowing them to display or broadcast the news.

2. Stock Price Updates

    A stock exchange tracks changes in stock prices and notifies investors and traders about price changes.
    The stock exchange can act as the subject, and multiple observers like trading apps, financial news channels, or individual traders can register to receive updates.
    Whenever a stock price changes, the subject notifies all registered observers, ensuring that they receive the updates in real-time.

Logging

All major actions, such as adding/removing observers and updating news, are logged in the observer_pattern_logs.log file located in the root directory.