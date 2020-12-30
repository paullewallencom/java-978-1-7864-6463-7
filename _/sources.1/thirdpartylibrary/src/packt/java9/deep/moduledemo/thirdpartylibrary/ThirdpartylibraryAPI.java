package packt.java9.deep.moduledemo.thirdpartylibrary;

import java.lang.System.Logger;
import java.lang.System.LoggerFinder;

public class ThirdpartylibraryAPI {

    Logger LOGGER = LoggerFinder
            .getLoggerFinder()
            .getLogger(ThirdpartylibraryAPI.class.getName(),
                    ThirdpartylibraryAPI.class.getModule());

    public void printHello() {

        LOGGER.log(Logger.Level.ALL, "hello");
    }

}
