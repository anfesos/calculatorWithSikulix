package org.examples.calculadora.utils;

import java.io.IOException;
import java.util.logging.*;

public class Loggers {

    private static final Logger LOGGER = Logger.getLogger("Log");

    private Loggers() {
        throw new IllegalStateException("UTILITY_CLASS");
    }

    public static void log(String mensaje) {

        FileHandler fileHandler;
        Handler consoleHandler;

        try {
            fileHandler = new FileHandler("Log4j.log", false);
            consoleHandler = new ConsoleHandler();

            LOGGER.addHandler(consoleHandler);
            LOGGER.addHandler(fileHandler);

            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

            LOGGER.info(mensaje);

            fileHandler.close();
            consoleHandler.close();
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, () -> "Error de escritura de log " + ex);
        }

    }

}
