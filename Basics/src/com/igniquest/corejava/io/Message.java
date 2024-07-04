package com.igniquest.corejava.io;

public class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return "Message: " + message;
    }
 }
