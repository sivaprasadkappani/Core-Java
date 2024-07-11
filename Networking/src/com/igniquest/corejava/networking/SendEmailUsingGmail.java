package com.igniquest.corejava.networking;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*; 

public class SendEmailUsingGmail {

    public static void main(String[] args) {
        // Gmail SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        // Sender's email credentials
        final String username = "skappaniyil@gmail.com"; // replace with your Gmail address
        final String password = "zxMN!@09"; // replace with your Gmail password or app-specific password

        // Create a session with authenticator
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Create a new email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username)); // Set sender's email
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("skappaniyil@example.com")); // Set recipient's email
            message.setSubject("Test Email from Java Program"); // Set email subject
            message.setText("Hello, this is a test email sent from a Java program using Gmail SMTP server."); // Set email body

            // Send the email
            Transport.send(message);

            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
