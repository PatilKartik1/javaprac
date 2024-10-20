// Q2. Define an interface “Operation” which has methods area(),volume(). Define a constant PI
// having value 3.142. Create a class circle (member – radius) which implements this interface.
// Calculate and display the area and volume.

interface Operation {
    // Constant PI
    double PI = 3.142;

    // Abstract methods
    double area();
    double volume();
}

// Class Circle implements Operation interface
class Circle implements Operation {
    private double radius;

    // Constructor to initialize radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of circle
    public double area() {
        return PI * radius * radius;
    }

    // Method to calculate volume (not applicable for circle, returns 0)
    public double volume() {
        return 0;  // Volume is not applicable for a 2D shape like a circle
    }

    // Method to display area and volume
    public void display() {
        System.out.println("Area of Circle: " + area());
        System.out.println("Volume of Circle: " + volume());
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Circle with radius 5
        Circle circle = new Circle(5);
        
        // Display the area and volume
        circle.display();
    }
}
