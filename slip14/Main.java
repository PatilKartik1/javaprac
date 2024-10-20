// Q2. Define an interface “Operation” which has methods area(),volume(). Define a constant PI
// having a value 3.142. Create a class cylinder (members – radius, height) which implements this
// interface. Calculate and display the area and volume.

interface Operation {
    // Define constant PI
    double PI = 3.142;

    // Abstract methods for area and volume
    double area();
    double volume();
}

// Class Cylinder that implements the Operation interface
class Cylinder implements Operation {
    private double radius;
    private double height;

    // Constructor to initialize radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Calculate and return the surface area of the cylinder
    @Override
    public double area() {
        return 2 * PI * radius * (radius + height);
    }

    // Calculate and return the volume of the cylinder
    @Override
    public double volume() {
        return PI * radius * radius * height;
    }

    // Method to display the results
    public void display() {
        System.out.println("Surface Area of Cylinder: " + area());
        System.out.println("Volume of Cylinder: " + volume());
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create an instance of Cylinder with radius and height
        Cylinder cylinder = new Cylinder(5, 10);
        cylinder.display(); // Display area and volume
    }
}
