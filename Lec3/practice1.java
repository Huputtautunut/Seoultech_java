import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (isPalindrome(number))
            System.out.println(number + " is a palindrome.");
        else
            System.out.println(number + " is not a palindrome.");
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }
        return reversedNumber;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
