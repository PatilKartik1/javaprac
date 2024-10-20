// Q2. Write a program to create a super class Employee (members – name, salary). Derive a sub- class
// as Developer (member – projectname). Create object of Developer and display the detailsof it

// Superclass Employee
class Employee {
    String name;
    double salary;

    // Constructor for Employee
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

// Subclass Developer
class Developer extends Employee {
    String projectName;

    // Constructor for Developer
    public Developer(String name, double salary, String projectName) {
        super(name, salary); // Calls the constructor of Employee
        this.projectName = projectName;
    }

    // Method to display developer details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Project Name: " + projectName);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of Developer
        Developer dev = new Developer("John Doe", 75000, "AI Project");

        // Displaying the details of Developer
        dev.displayDetails();
    }
}
