package com.igniquest.corejava.io;

public class StylishMessage {
    private Message message;

    public StylishMessage(Message message) {
        this.message = message;
    }

    public String getMessage() {
        String originalMessage = message.getMessage();
        String stylishMessage = "\n**************************" +
        		"\n  " + originalMessage + 
                                "\n**************************";
        return stylishMessage;
    }

   
}
