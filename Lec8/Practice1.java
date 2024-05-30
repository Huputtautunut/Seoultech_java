import java.util.Random;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // Create an array with 120 randomly chosen integers
        int[] array = generateRandomArray(120);

        // Prompt the user to enter the index of the array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index: ");
        int index = scanner.nextInt();

        // Display the corresponding element value if the index is within bounds
        if (index >= 0 && index < array.length) {
            System.out.println("Element at index " + index + " is: " + array[index]);
        } else {
            System.out.println("Index out of bound");
        }
    }

    // Method to generate an array with random integers
    private static int[] generateRandomArray(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
}

