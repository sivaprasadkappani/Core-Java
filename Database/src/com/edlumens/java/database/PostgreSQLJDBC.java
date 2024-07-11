package com.edlumens.java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSQLJDBC {

    // JDBC URL, username and password of PostgreSQL server
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "vb$MN96";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Establish connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println( "connection :"  + connection );

            // Create statement
            statement = connection.createStatement();
            System.out.println( "statement :"  + statement );

            // Execute query
            String query = "SELECT * FROM public.department";
            resultSet = statement.executeQuery(query);
            System.out.println( "resultSet :"  + resultSet );

            // Process the result set
            while (resultSet.next()) {
                int departmentId = resultSet.getInt("department_id");
                String location = resultSet.getString("location");
                String name = resultSet.getString("name");

                System.out.println("Department ID: " + departmentId);
                System.out.println("Location: " + location);
                System.out.println("Name: " + name);
                System.out.println("-------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
