package com.igniquest.corejava.networking;

import java.io.*;
import java.net.*;

public class SimpleTextServer {
    private static final int PORT = 12345; // Define the port the server will listen on

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        
        try {
            // Create a ServerSocket to listen on the defined port
            serverSocket = new ServerSocket(PORT);
            System.out.println("Server is running...");
            Integer messageId = 0;

            while (true) { // Continuously listen for client connections
                Socket clientSocket = null;
                PrintWriter out = null;
                try {
                    // Accept a client connection
                	System.out.println("Waiting for client connection...");
                    clientSocket = serverSocket.accept();
                    System.out.println("Client connected: " + clientSocket.getInetAddress());

                    // Send a text message to the client
                    out = new PrintWriter(clientSocket.getOutputStream(), true);
                    String message = "Message to client [Message ID : " + messageId + "]";
                    out.println(message);
                    messageId++;  
                    System.out.println("Sent to client: " + message);

                } catch (IOException e) {
                    System.err.println("Failed to communicate with client.");
                    e.printStackTrace();
                } finally {
                    // Close the client socket and PrintWriter in the finally block
                    if (out != null) {
                        out.close();
                    }
                    if (clientSocket != null) {
                        try {
                            clientSocket.close();
                        } catch (IOException e) {
                            System.err.println("Failed to close client socket.");
                            e.printStackTrace();
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Could not start the server on port " + PORT);
            e.printStackTrace();
        } finally {
            // Ensure the ServerSocket is closed in the finally block
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    System.err.println("Failed to close server socket.");
                    e.printStackTrace();
                }
            }
        }
    }
}
