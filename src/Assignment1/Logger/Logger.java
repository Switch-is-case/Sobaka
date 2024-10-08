package Assignment1.Logger;

public class Logger {
        // this code is private static variable to hold the single instance of the Assignment1.Logger.Assignment1.Logger
        private static Logger instance;

        // this code is private constructor to prevent instantiation from outside
        private Logger() {}

        // this code is public static method to provide access to the single instance
        public static Logger getInstance() {
            if (instance == null) { // if object is not created
                instance = new Logger(); // to create a new object
            }
            return instance; // to return a created object
        }

        // this Method to log messages
        public void LogToConsole(String message) {
            System.out.println("Log message: " + message);
        }
}

