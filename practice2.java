import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for three edges length
        System.out.print("Enter three edges length: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        // Check if the input forms a valid triangle
        if (isValidTriangle(side1, side2, side3)) {
            // Compute the perimeter of the triangle
            double perimeter = computePerimeter(side1, side2, side3);
            System.out.println("The perimeter is " + perimeter);
        } else {
            System.out.println("Invalid input. The input does not form a valid triangle.");
        }

        scanner.close();
    }

    // Function to check if the input forms a valid triangle
    public static boolean isValidTriangle(double side1, double side2, double side3) {
        // Check if the sum of every pair of two edges is greater than the remaining edge
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    // Function to compute the perimeter of the triangle
    public static double computePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }
}
