// Q2. Create an abstract class Shape with methods area & volume. Derive a class Sphere (radius).
// Calculate and display area and volume.

// Abstract class Shape
abstract class Shape {
    // Abstract methods for area and volume
    abstract double area();
    abstract double volume();
}

// Derived class Sphere
class Sphere extends Shape {
    private double radius;

    // Constructor to initialize the radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Override area method to calculate the surface area of the sphere
    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Override volume method to calculate the volume of the sphere
    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Method to display the area and volume
    public void display() {
        System.out.println("Sphere Radius: " + radius);
        System.out.println("Surface Area: " + area());
        System.out.println("Volume: " + volume());
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Creating a Sphere object with radius 5
        Sphere sphere = new Sphere(5);

        // Displaying the area and volume of the sphere
        sphere.display();
    }
}
