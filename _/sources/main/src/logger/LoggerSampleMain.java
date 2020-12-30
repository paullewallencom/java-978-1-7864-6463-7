package logger;

public class LoggerSampleMain {

  private static System.Logger LOGGER = System.getLogger(LoggerSampleMain.class.getName());

  public static void main(String[] args) {
    LOGGER.log(System.Logger.Level.DEBUG,"This is a debug log message");
  }
}
