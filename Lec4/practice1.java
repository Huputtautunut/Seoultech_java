import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();
        
        int[] list = new int[n];
        System.out.print("Enter the list elements: ");
        for (int i = 0; i < n; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Discard non-integer input
            }
            list[i] = scanner.nextInt();
        }
        
        int pivotIndex = partition(list);
        
        System.out.println("After partitioning:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
    
    public static int partition(int[] list) {
        int pivot = list[0];
        int low = 1;
        int high = list.length - 1;
        
        while (high > low) {
            while (low <= high && list[low] <= pivot) {
                low++;
            }
            
            while (low <= high && list[high] > pivot) {
                high--;
            }
            
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        
        while (high >= 0 && list[high] >= pivot) {
            high--;
        }
        
        if (high != 0) {
            list[0] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return 0;
        }
    }
}
