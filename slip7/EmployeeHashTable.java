// QI. Create a Hash table containing Employee name and Salary. Display the details of the hash
// table.
// [10 Marks]

import java.util.Hashtable;
import java.util.Scanner;

public class EmployeeHashTable {
    public static void main(String[] args) {
        // Creating a Hashtable to store employee name and salary
        Hashtable<String, Double> employeeTable = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);

        // Accepting number of employees
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double salary = scanner.nextDouble();
            scanner.nextLine();  // Consume the newline character
            
            // Storing details in the hashtable
            employeeTable.put(name, salary);
        }

        // Displaying the details of the hash table
        System.out.println("\nEmployee Details:");
        for (String empName : employeeTable.keySet()) {
            System.out.println("Name: " + empName + ", Salary: " + employeeTable.get(empName));
        }
        
        scanner.close();
    }
}
