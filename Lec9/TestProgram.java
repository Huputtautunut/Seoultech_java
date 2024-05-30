public class TestProgram {
    public static void main(String[] args) {
        // Create an array of GeometricObjectComparable objects
        GeometricObject[] objects = {
                new Square(2),
                new Circle(5),
                new Square(5),
                new Rectangle(3, 4),
                new Square(4.5)
        };

        // Loop through the array and display area, invoke howToColor if Colorable
        for (GeometricObject obj : objects) {
            System.out.println("Area is " + obj.getArea());
            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
        }
    }
}