package logger;

import java.util.ResourceBundle;
import static java.text.MessageFormat.format;

public class SystemOutLogger implements System.Logger {

  @Override
  public String getName() {
    return "SystemOut";
  }

  @Override
  public boolean isLoggable(Level level) {
    return true;
  }

  @Override
  public void log(Level level, ResourceBundle bundle, String msg, Throwable thrown) {
    System.out.printf("SystemOut logger says on %s: \"%s\" with \"%s\"%n", level, msg, thrown);
  }

  @Override
  public void log(Level level, ResourceBundle bundle, String format, Object... params) {
    System.out.printf("SystemOut logger says on %s: \"%s\"%n", level, format(format, params));
  }
}
