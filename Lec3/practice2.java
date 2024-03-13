public class practice2 {
    public static void main(String[] args) {
        int count = 0;
        int number = 13; // Start from 13 because single-digit emirps don't qualify

        System.out.println("First 120 Emirps:");
        while (count < 120) {
            if (isEmirp(number)) {
                System.out.print(number + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println(); // Print a new line after every 10 numbers
                }
            }
            number++;
        }
    }

    public static boolean isEmirp(int number) {
        return isPrime(number) && isPrime(reverse(number)) && number != reverse(number);
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }
        return reversedNumber;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
