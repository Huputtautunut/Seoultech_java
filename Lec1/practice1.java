package Lec1;
//import scanner to read user inputs
import java.util.Scanner;

public class practice1 {

    //loop that calculates numbers until all number in int are calculated
    public static int practice1(int num) {
        int result = 1;
        while (num > 0) {
            int digit = num % 10;
            result *= digit;
            num /= 10;
        }
        return result;
    }

//main class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ask user
        System.out.print("Enter an integer between 0 and 1000: ");
        int num = scanner.nextInt();

        if (num >= 0 && num <= 1000) {
            int result = practice1(num);
            System.out.println("The multiplication of all digits in " + num + " is " + result);
        } else {
            System.out.println("Invalid input. Please enter an integer between 0 and 1000.");
        }

        scanner.close();
    }
}
