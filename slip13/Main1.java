// Q2. Write a class Student with attributes roll no, name, age and course. Initialize values through
// parameterized constructor. If age of student is not in between 15 and 21 then generate userdefined exception ―Age Not Within The Range

// User-defined exception class
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Student class with attributes
class Student {
    private int roll_no;
    private String name;
    private int age;
    private String course;

    // Parameterized constructor
    public Student(int roll_no, String name, int age, String course) throws AgeNotWithinRangeException {
        this.roll_no = roll_no;
        this.name = name;
        this.course = course;
        // Check if age is within the valid range
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age Not Within The Range");
        }
        this.age = age;
    }

    // Display student information
    public void displayStudentInfo() {
        System.out.println("Roll No: " + roll_no);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

// Main class to test the functionality
public class Main1 {
    public static void main(String[] args) {
        try {
            // Creating a student object with valid age
            Student student1 = new Student(101, "John Doe", 18, "Computer Science");
            student1.displayStudentInfo();
            
            // Attempting to create a student with invalid age
            Student student2 = new Student(102, "Jane Doe", 22, "Mathematics");
        } catch (AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
