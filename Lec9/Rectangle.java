// Rectangle.java
public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    // Default constructor
    public Rectangle() {
        this(1.0, 1.0, "white", 1.0);
    }

    // Construct a rectangle with specified width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Construct a rectangle with specified width, height, color, and filled status
    public Rectangle(double width, double height, String color, double weight) {
        this.width = width;
        this.height = height;
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }

    // Setter method for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter method for height
    public double getHeight() {
        return height;
    }

    // Setter method for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Implement abstract method getArea
    @Override
    public double getArea() {
        return width * height;
    }

    // Implement abstract method getPerimeter
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Override toString method
    @Override
    public String toString() {
        return "[Rectangle] width: " + width + ", height: " + height;
    }
}

