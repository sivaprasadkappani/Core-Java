package com.igniquest.corejava.networking;

import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234)) {
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String message = reader.readLine();
            System.out.println("Server message: " + message);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
