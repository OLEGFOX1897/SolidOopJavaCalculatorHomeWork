import java.io.IOException;
import java.util.logging.*;

/**
 * Класс для логирования
 */
public class BasicLogger {

    private static final Logger logger = Logger.getLogger(Present.class.getName());
    private static BasicLogger instance;

    static BasicLogger getInstance() {
        if (instance == null) {
            try {
                instance = new BasicLogger();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return instance;
        }
        return instance;
    }

    BasicLogger() throws IOException {
        FileHandler fileHandler = new FileHandler("log.txt");
        fileHandler.setFormatter(new SimpleFormatter());
        logger.setUseParentHandlers(true); // убирает log информацию из консоли
        logger.addHandler(fileHandler);
    }

    public void logMessage(String message) {
        logger.info(message);
    }

}
