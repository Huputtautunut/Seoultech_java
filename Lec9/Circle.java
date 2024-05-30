// Circle.java
public class Circle extends GeometricObject {
    protected double radius;

    // Default constructor
    public Circle() {
        this(1.0, "white", 1.0);
    }

    // Construct circle with specified radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Construct a circle with specified radius, color, and filled status
    public Circle(double radius, String color, double weight) {

        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implement abstract method getArea
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Implement abstract method getPerimeter
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override toString method
    @Override
    public String toString() {
        return "[Circle] radius = " + radius;
    }
}
