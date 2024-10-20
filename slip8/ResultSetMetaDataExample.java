// Q2. Create and insert values to Person table (PID, name, gender, birth_year) in postgreSQL database.
// Write a JDBC program to display information about the ResultSet like number of columns
// available in the ResultSet and SQL type of each column using ResultSetMetaData.
// [20 Marks]

import java.sql.*;

public class ResultSetMetaDataExample {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/your_database";  // Replace with your database name
        String user = "your_username";  // Replace with your PostgreSQL username
        String password = "your_password";  // Replace with your PostgreSQL password

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Establish the connection
            conn = DriverManager.getConnection(url, user, password);

            // Create statement
            stmt = conn.createStatement();

            // Execute a query
            String query = "SELECT * FROM Person";
            rs = stmt.executeQuery(query);

            // Get ResultSetMetaData
            ResultSetMetaData rsMetaData = rs.getMetaData();

            // Get number of columns
            int columnCount = rsMetaData.getColumnCount();
            System.out.println("Number of columns: " + columnCount);

            // Print each column's details
            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Column " + i + ": ");
                System.out.println("Name: " + rsMetaData.getColumnName(i));
                System.out.println("Type: " + rsMetaData.getColumnTypeName(i));
                System.out.println("Display Size: " + rsMetaData.getColumnDisplaySize(i));
                System.out.println("--------------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

//SQL Program

CREATE TABLE Person (
    PID SERIAL PRIMARY KEY,
    name VARCHAR(50),
    gender VARCHAR(10),
    birth_year INT
);

-- Insert values into the Person table
INSERT INTO Person (name, gender, birth_year)
VALUES 
('John Doe', 'Male', 1990),
('Jane Smith', 'Female', 1985),
('Alice Johnson', 'Female', 1992);

