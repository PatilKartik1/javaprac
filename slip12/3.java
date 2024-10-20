// Q2. Create an abstract class Shape with methods area & volume. Derive a class Cylinder (radius,
// height). Calculate area and volume. [20 Marks]


// Abstract class Shape
abstract class Shape {
    // Abstract methods for area and volume
    abstract double calcArea();
    abstract double calcVolume();
}

// Derived class Cylinder
class Cylinder extends Shape {
    private double radius;
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Override calcArea method
    @Override
    double calcArea() {
        return 2 * Math.PI * radius * (radius + height); // Surface area formula
    }

    // Override calcVolume method
    @Override
    double calcVolume() {
        return Math.PI * radius * radius * height; // Volume formula
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("Area: " + cylinder.calcArea());
        System.out.println("Volume: " + cylinder.calcVolume());
    }
}
