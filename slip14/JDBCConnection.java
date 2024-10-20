// Q1. Write a program to create JDBC connection. On successful connection with database display
// appropriate message to user.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static void main(String[] args) {
        // Database URL, username, and password
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase"; // Replace with your database URL
        String username = "root"; // Replace with your MySQL username
        String password = "password"; // Replace with your MySQL password

        Connection connection = null;
        try {
            // Load MySQL JDBC Driver (automatically loads in JDBC 4.0+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            connection = DriverManager.getConnection(jdbcUrl, username, password);

            if (connection != null) {
                System.out.println("Connection Established successfully.");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close(); // Close connection after use
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
