package Creational.SingletonPattern;

public class DatabaseConnection {
    // A private static variable to hold the single instance
    private static DatabaseConnection instance;

    // Private constructor to restrict instantiation from outside
    private DatabaseConnection() {
        System.out.println("Database connected.");
    }

    // Public static method to provide access to the single instance
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Example method
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}
