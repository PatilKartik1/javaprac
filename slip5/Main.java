// Q2. Define a "Point" class having members — x,y (coordinates). Define default constructor and
// parameterized constructors. Define subclass "ColorPoint" with member as color. Write display
// method to display the details of Point.
// [20 Marks]

// Base class Point
class Point {
    private int x;  // x-coordinate
    private int y;  // y-coordinate

    // Default constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to display point details
    public void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

// Subclass ColorPoint
class ColorPoint extends Point {
    private String color; // Color of the point

    // Parameterized constructor
    public ColorPoint(int x, int y, String color) {
        super(x, y); // Call to the constructor of Point class
        this.color = color;
    }

    // Overriding display method to include color
    @Override
    public void display() {
        super.display(); // Call the display method of Point
        System.out.println("Color: " + color);
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        Point point = new Point(3, 4);
        point.display(); // Display details of Point

        ColorPoint colorPoint = new ColorPoint(5, 6, "Red");
        colorPoint.display(); // Display details of ColorPoint
    }
}
