// TestClass.java
public class TestClass {
    // Main method
    public static void main(String[] args) {
        // Create two circles and two rectangles
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(4);
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(1, 2);

        // Find the larger circle
        Circle largerCircle = (Circle) GeometricObjectComparable.max(circle1, circle2);
        System.out.println("The larger circle's area is " + largerCircle.getArea());
        System.out.println("Details of the larger circle: " + largerCircle);

        // Find the larger rectangle
        Rectangle largerRectangle = (Rectangle) GeometricObjectComparable.max(rectangle1, rectangle2);
        System.out.println("The larger rectangle's area is " + largerRectangle.getArea());
        System.out.println("Details of the larger rectangle: " + largerRectangle);
    }
}
