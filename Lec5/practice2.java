import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the endpoints of the first line segment (x1, y1, x2, y2):");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
                double y2 = input.nextDouble();

        System.out.println("Enter the endpoints of the second line segment (x3, y3, x4, y4):");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        LinearEquation equation = new LinearEquation(y1 - y2, x2 - x1, y3 - y4, x4 - x3, (y1 - y2) * x1 + (x2 - x1) * y1, (y3 - y4) * x3 + (x4 - x3) * y3);

        if (!equation.isSolvable()) {
            System.out.println("The lines are parallel and do not intersect.");
        } else {
            System.out.println("The intersecting point is at (" + equation.getX() + ", " + equation.getY() + ")");
        }

        input.close();
    }
}
