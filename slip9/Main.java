// Q2. Define a "Point" class having members — x,y(coordinates). Define default constructor and
// parameterized constructors. Define subclass "Point3D" with member as z (coordinate). Write
// display method to show the details of Point.
// [20 Marks]

// Base class Point
class Point {
    protected int x;
    protected int y;

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

    // Display method for Point
    public void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

// Subclass Point3D
class Point3D extends Point {
    private int z;

    // Default constructor
    public Point3D() {
        super(); // Calls the default constructor of Point
        this.z = 0;
    }

    // Parameterized constructor
    public Point3D(int x, int y, int z) {
        super(x, y); // Calls the parameterized constructor of Point
        this.z = z;
    }

    // Display method for Point3D
    @Override
    public void display() {
        super.display(); // Calls the display method of Point
        System.out.println("Point3D coordinates: (" + x + ", " + y + ", " + z + ")");
    }
}

// Main class to test the Point and Point3D classes
public class Main {
    public static void main(String[] args) {
        Point p = new Point(3, 4);
        p.display();

        Point3D p3d = new Point3D(5, 6, 7);
        p3d.display();
    }
}
