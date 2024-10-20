// Q2. Write a class Student with attributes roll no, name, age and course. Initialize values through
// parameterized constructor. If student's roll no of is not in between 13001 to 13080 thengenerate
// user- defined exception ―Rollno is Not Within The Range.

// User-defined exception class
class RollNoNotWithinRangeException extends Exception {
    public RollNoNotWithinRangeException(String message) {
        super(message);
    }
}

// Student class with attributes rollNo, name, age, and course
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Parameterized constructor
    public Student(int rollNo, String name, int age, String course) throws RollNoNotWithinRangeException {
        // Check if roll number is within range
        if (rollNo < 13001 || rollNo > 13080) {
            throw new RollNoNotWithinRangeException("Rollno is Not Within The Range");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student details
    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

// Main class to test the Student class
public class Main1 {
    public static void main(String[] args) {
        try {
            // Create a Student object with valid roll number
            Student student = new Student(13005, "John Doe", 20, "Computer Science");
            student.display();
        } catch (RollNoNotWithinRangeException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Create a Student object with invalid roll number
            Student student = new Student(12999, "Jane Doe", 19, "Mathematics");
            student.display();
        } catch (RollNoNotWithinRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
