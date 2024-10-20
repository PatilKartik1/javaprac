// Q2. Define a class Student with attributes rollno and name. Define default and parameterized
// constructor. Keep the count of Objects created. Create objects using parameterized constructor and
// Display the object count after each object is created.

class Student {
    // Attributes
    private int rollno;
    private String name;

    // Static variable to keep count of objects created
    private static int objectCount = 0;

    // Default constructor
    public Student() {
        this.rollno = 0;
        this.name = "Unknown";
        objectCount++;
    }

    // Parameterized constructor
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        objectCount++;
    }

    // Method to display the object count
    public static void displayObjectCount() {
        System.out.println("Total number of objects created: " + objectCount);
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("Roll No: " + rollno + ", Name: " + name);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating objects using parameterized constructor
        Student s1 = new Student(1, "John");
        s1.displayStudent();
        Student.displayObjectCount();

        Student s2 = new Student(2, "Emma");
        s2.displayStudent();
        Student.displayObjectCount();

        Student s3 = new Student(3, "Alice");
        s3.displayStudent();
        Student.displayObjectCount();
    }
}
