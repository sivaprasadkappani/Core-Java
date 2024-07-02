package com.igniquest.corejava.using.object;

public class SystemExample {

    public static void main(String[] args) {
        // Print Java version
        String javaVersion = System.getProperty("java.version");
        System.out.println("Java Version: " + javaVersion);

        // Print Operating System name
        String osName = System.getProperty("os.name");
        System.out.println("Operating System: " + osName);

        // Print environment variable
        String homeDirectory = System.getenv("HOME");
        System.out.println("Home Directory: " + homeDirectory);
    }
}
