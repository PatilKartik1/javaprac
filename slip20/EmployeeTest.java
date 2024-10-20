// Q2. Create an employee class (id,name,deptname,salary). Define a default and parameterized
// constructor. Use 'this' keyword to initialize instance variables. Keep a count of objects created.
// Create objects using parameterized constructor and display the object count after each object is
// created. Also display the contents of each object.
// [20 Marks]

class Employee {
    private int id;
    private String name;
    private String deptName;
    private double salary;
    private static int objectCount = 0; // Static variable to keep track of object count

    // Default constructor
    public Employee() {
        objectCount++;
    }

    // Parameterized constructor
    public Employee(int id, String name, String deptName, double salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        objectCount++; // Increment count when a new object is created
        displayInfo(); // Display object info
    }

    // Method to display object information
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + deptName);
        System.out.println("Salary: " + salary);
        System.out.println("Total Employees: " + objectCount);
        System.out.println("-----------------------");
    }

    // Static method to get the object count
    public static int getObjectCount() {
        return objectCount;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        // Creating objects using parameterized constructor
        Employee emp1 = new Employee(101, "Alice", "HR", 50000);
        Employee emp2 = new Employee(102, "Bob", "IT", 60000);
        Employee emp3 = new Employee(103, "Charlie", "Finance", 55000);
        
        // Displaying the total number of Employee objects created
        System.out.println("Total Employees Created: " + Employee.getObjectCount());
    }
}
