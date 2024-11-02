package FinalProject.data;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    // Private constructor prevents instantiation from other classes
    private DatabaseConnection() {
        connect();
    }

    // Public method to provide access to the single instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    private void connect() {
        System.out.println("Connecting to the database...");
        // Simulate connecting to a database
    }

    public void disconnect() {
        System.out.println("Disconnecting from the database...");
        // Simulate disconnecting from a database
    }
}