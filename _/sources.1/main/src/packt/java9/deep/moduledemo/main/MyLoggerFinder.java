package packt.java9.deep.moduledemo.main;

import java.lang.System.Logger;
import java.lang.System.LoggerFinder;
import java.lang.reflect.Module;

public class MyLoggerFinder extends LoggerFinder {

    private static Logger myLogger = new MyLogger();

    protected MyLoggerFinder(){}

    @Override
    public Logger getLogger(String name, Module module) {
        return myLogger;
    }
}
