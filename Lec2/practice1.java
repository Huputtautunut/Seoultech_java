package Lec2;
import java.util.Scanner;


public class practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines (1 to 15): ");
        int n = scanner.nextInt();
        
        if (n < 1 || n > 15) {
            System.out.println("Please enter a number between 1 and 15.");
            return;
        }

        int maxDigits = String.valueOf(n).length();

        for (int i = 1; i <= n; i++) {
            // Printing leading spaces
            for (int j = 1; j <= n - i; j++) {
                for (int k = 0; k < maxDigits + 1; k++) {
                    System.out.print(" ");
                }
            }

            // Printing decreasing sequence
            for (int j = i; j >= 1; j--) {
                System.out.printf("%-" + (maxDigits + 1) + "d", j);
            }

            // Printing increasing sequence
            for (int j = 2; j <= i; j++) {
                System.out.printf("%-" + (maxDigits + 1) + "d", j);
            }

            // Move to the next line
            System.out.println();
        }
    }
}
