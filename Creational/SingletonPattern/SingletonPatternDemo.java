package Creational.SingletonPattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Trying to create two instances
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        // Verify if both instances are the same
        System.out.println("Are db1 and db2 the same instance? " + (db1 == db2));

        // Using the singleton instance to execute a query
        db1.query("SELECT * FROM users");
    }
}
