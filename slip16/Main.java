// Q2. Write a program to create a super class Employee (members – name, salary). Derive a sub- class
// Programmer (member – proglanguage). Create object of Programmer and display the details of it.

// Superclass Employee
class Employee {
    // Members of Employee class
    String name;
    double salary;

    // Parameterized constructor for Employee
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Subclass Programmer derived from Employee
class Programmer extends Employee {
    // Additional member specific to Programmer
    String proglanguage;

    // Parameterized constructor for Programmer
    public Programmer(String name, double salary, String proglanguage) {
        // Call to superclass (Employee) constructor
        super(name, salary);
        this.proglanguage = proglanguage;
    }

    // Method to display programmer details
    public void displayProgrammerDetails() {
        // Display employee details
        super.displayEmployeeDetails();
        // Display programmer-specific detail
        System.out.println("Programming Language: " + proglanguage);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an object of Programmer and pass details
        Programmer programmer = new Programmer("John Doe", 75000, "Java");

        // Display the details of the programmer
        programmer.displayProgrammerDetails();
    }
}
