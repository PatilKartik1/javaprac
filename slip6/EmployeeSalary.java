// Q2. Write a program which define class Employee with data member as id, name and salary Store
// the information of 'n' employees and Display the name of employee having maximum salary (Use
// array of object).
// [20 Marks]

import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    // Constructor to initialize Employee object
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        Employee[] employees = new Employee[n];

        // Accepting employee details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter ID for employee " + (i + 1) + ": ");
            int id = scanner.nextInt();
            System.out.print("Enter name for employee " + (i + 1) + ": ");
            String name = scanner.next();
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            double salary = scanner.nextDouble();

            employees[i] = new Employee(id, name, salary);
        }

        // Finding the employee with the maximum salary
        Employee maxSalaryEmployee = employees[0];
        for (Employee emp : employees) {
            if (emp.salary > maxSalaryEmployee.salary) {
                maxSalaryEmployee = emp;
            }
        }

        // Displaying the name of the employee with the maximum salary
        System.out.println("Employee with the maximum salary: " + maxSalaryEmployee.name);
        scanner.close();
    }
}
