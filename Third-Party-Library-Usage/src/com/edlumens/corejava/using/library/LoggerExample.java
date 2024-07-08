package com.edlumens.corejava.using.library;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample {
    // Create a logger instance
    private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());

    public static void main(String[] args) {
        // Set the logging level to INFO
        logger.setLevel(Level.INFO);

        // Log messages of different levels
        logger.info("This is an info message");
        logger.warning("This is a warning message");
        logger.severe("This is a severe message");

        // Log a message with a custom level
        logger.log(Level.CONFIG, "This is a config level message");
    }
}
