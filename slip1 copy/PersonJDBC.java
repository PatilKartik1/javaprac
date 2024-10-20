// Q2. Write a JDBC program to display all the details of the Person table in proper format on the
// screen. Create and insert values in Person table with fields as PID, name, gender, birth year in
// [20 MarQs]
// PostgreSQL database.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class PersonJDBC {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:postgresql://localhost:5432/yourDatabase";
        String user = "yourUsername";
        String password = "yourPassword";

        try {
            // Step 1: Establish a connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Step 2: Create a statement object to execute SQL queries
            Statement stmt = conn.createStatement();

            // Step 3: Create the 'Person' table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Person (" +
                    "PID INT PRIMARY KEY," +
                    "name VARCHAR(100)," +
                    "gender CHAR(1)," +
                    "birth_year INT)";
            stmt.executeUpdate(createTableSQL);

            // Step 4: Insert values into 'Person' table
            String insertSQL = "INSERT INTO Person (PID, name, gender, birth_year) VALUES " +
                    "(1, 'Alice', 'F', 1990), " +
                    "(2, 'Bob', 'M', 1985), " +
                    "(3, 'Charlie', 'M', 1992);";
            stmt.executeUpdate(insertSQL);

            // Step 5: Retrieve and display all details from 'Person' table
            String query = "SELECT * FROM Person";
            ResultSet rs = stmt.executeQuery(query);

            // Step 6: Display the result in a formatted manner
            System.out.printf("%-5s %-15s %-10s %-10s\n", "PID", "Name", "Gender", "Birth Year");
            while (rs.next()) {
                int pid = rs.getInt("PID");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                int birthYear = rs.getInt("birth_year");

                System.out.printf("%-5d %-15s %-10s %-10d\n", pid, name, gender, birthYear);
            }

            // Step 7: Close connections
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
