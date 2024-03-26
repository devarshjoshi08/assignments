public class LoggerTest {
    public static void main(String[] args) {
        // Get the singleton instance of Logger
        Logger logger = Logger.getInstance();

        // Log messages
        logger.logMessage("Ready");
        logger.logMessage("Steady");
        logger.logMessage("Poo");

        // Get and print the log content
        String logContent = logger.getLog();
        System.out.println("Log Content:");
        System.out.println(logContent);
    }
}
