import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coefficients of the linear equation (ax + by = e):");
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        System.out.print("Enter d: ");
        double d = input.nextDouble();
        System.out.print("Enter e: ");
        double e = input.nextDouble();
        System.out.print("Enter f: ");
        double f = input.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (!equation.isSolvable()) {
            System.out.println("The equation has no solution.");
        } else {
            System.out.println("Solution for the equation:");
            System.out.println("x = " + equation.getX());
            System.out.println("y = " + equation.getY());
        }
        
        input.close();
    }
}
