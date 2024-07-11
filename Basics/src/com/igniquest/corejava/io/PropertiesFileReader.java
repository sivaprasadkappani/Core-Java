package com.igniquest.corejava.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileReader {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try (InputStream input = new FileInputStream("config.properties")) {
            // Load the properties file
            properties.load(input);

            // Get the property values
            String dbUrl = properties.getProperty("database.url");
            String dbUsername = properties.getProperty("database.username");
            String dbPassword = properties.getProperty("database.password");
            String serverPort = properties.getProperty("server.port");

            // Print the property values
            System.out.println("Database URL: " + dbUrl);
            System.out.println("Database Username: " + dbUsername);
            System.out.println("Database Password: " + dbPassword);
            System.out.println("Server Port: " + serverPort);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
