public class LoggerTest {
    public static void main(String[] args) {
        // singleton intence for logger
        Logger logger = Logger.getInstance();

        // Log mesage nakhya
        logger.logMessage("Ready");
        logger.logMessage("Steady");
        logger.logMessage("Poo");

        // get karine log content print karva
        String logContent = logger.getLog();
        System.out.println("Log Content:");
        System.out.println(logContent);
    }
}
