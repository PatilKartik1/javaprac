// Q2. Write a JDBC program to insert the records into the table Employee (ID, name, salary) using
// PreparedStatement interface. Accept details of Employees from user. [20 Marks]

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEmployee {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database"; // Change database URL
        String user = "your_username"; // Change to your database username
        String password = "your_password"; // Change to your database password

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        String sql = "INSERT INTO Employee (ID, name, salary) VALUES (?, ?, ?)";
        
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
             
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setDouble(3, salary);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " record(s) inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
