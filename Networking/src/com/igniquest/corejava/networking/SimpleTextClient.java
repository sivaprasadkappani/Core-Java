package com.igniquest.corejava.networking;

import java.io.*;
import java.net.*;

public class SimpleTextClient {
    private static final String SERVER_ADDRESS = "localhost"; // The server address to connect to
    private static final int PORT = 12345; // The port the server is listening on

    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader in = null;

        try {
            // Connect to the server
            socket = new Socket(SERVER_ADDRESS, PORT);
            System.out.println("Connected to the server at " + SERVER_ADDRESS + ":" + PORT);
            
            InputStream inputStream = socket.getInputStream();
            // Get the input stream to read the message from the server
            in = new BufferedReader(new InputStreamReader( inputStream ));

            // Read and display the message from the server
            String message = in.readLine();
            System.out.println("Message from server: " + message);

        } catch (IOException e) {
            System.err.println("Unable to connect to the server at " + SERVER_ADDRESS + ":" + PORT);
            e.printStackTrace();
        } finally {
            // Ensure resources are closed in the finally block
            try {
                if (in != null) {
                    in.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing resources");
                e.printStackTrace();
            }
        }
    }
}
