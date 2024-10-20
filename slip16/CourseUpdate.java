// Q2. Write a JDBC program to update number_of_students of “BCA Science” to 1000. Create a
// table Course (Code,name, department,number_of_students) in PostgreSQL database. Insertvalues
// in the table.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class CourseUpdate {
    public static void main(String[] args) {
        // JDBC URL, username and password for PostgreSQL
        String jdbcURL = "jdbc:postgresql://localhost:5432/your_database";
        String username = "your_username";
        String password = "your_password";

        // SQL queries
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Course (" +
                                "Code INT PRIMARY KEY, " +
                                "name VARCHAR(100), " +
                                "department VARCHAR(100), " +
                                "number_of_students INT)";
        
        String insertDataSQL = "INSERT INTO Course (Code, name, department, number_of_students) VALUES " +
                               "(101, 'BCA', 'Science', 900), " +
                               "(102, 'MCA', 'Science', 800), " +
                               "(103, 'MBA', 'Management', 700)";
        
        String updateSQL = "UPDATE Course SET number_of_students = 1000 WHERE name = 'BCA' AND department = 'Science'";

        try {
            // Step 1: Establish a connection to the database
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            
            // Step 2: Create the Course table
            statement.execute(createTableSQL);
            System.out.println("Course table created successfully.");

            // Step 3: Insert values into the table
            statement.executeUpdate(insertDataSQL);
            System.out.println("Initial data inserted into the Course table.");

            // Step 4: Update the number_of_students for "BCA Science"
            PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Update successful. Rows affected: " + rowsAffected);

            // Step 5: Close the connection
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
