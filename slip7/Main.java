// Q2. Define a class student having rollno, name and percentage. Define Default and
// parameterized constructor. Accept the 5 student details and display it. (Use this keyword).
// [20 Marks]

import java.util.Scanner;

class Student {
    private int rollno;
    private String name;
    private double percentage;

    // Default constructor
    public Student() {
        this.rollno = 0;
        this.name = "Unknown";
        this.percentage = 0.0;
    }

    // Parameterized constructor
    public Student(int rollno, String name, double percentage) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
    }

    // Method to display student details
    public void display() {
        System.out.println("Roll No: " + rollno + ", Name: " + name + ", Percentage: " + percentage);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        // Accepting details of 5 students
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rollno = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Percentage: ");
            double percentage = scanner.nextDouble();

            // Using parameterized constructor
            students[i] = new Student(rollno, name, percentage);
        }

        // Displaying student details
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.display();
        }

        scanner.close();
    }
}
