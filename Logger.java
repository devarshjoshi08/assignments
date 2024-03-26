public class Logger {
    private static Logger instance;
    private String log;

    // Private constrocter
    private Logger() {
        this.log = "";
    }

    // Public method for get intence from singletonjava
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to log messages
    public void logMessage(String message) {
        this.log += message + "\n";
    }

    // Method to get the log content
    public String getLog() {
        return this.log;
    }
}
