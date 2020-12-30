package logger;

import java.lang.System.Logger;
import java.lang.System.LoggerFinder;
import java.lang.reflect.Module;

public class SystemOutLoggerFinder extends LoggerFinder {

  @Override
  public Logger getLogger(String name, Module module) {
    return new SystemOutLogger();
  }

}