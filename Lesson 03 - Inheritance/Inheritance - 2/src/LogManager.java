public class LogManager {
    public void log(int logType) {
        if (logType == 1) {
           System.out.println("Database is logged");
        } else if (logType == 2) {
            System.out.println("File is logged");
        } else {
            System.out.println("Email sent");
        }
    }
}
