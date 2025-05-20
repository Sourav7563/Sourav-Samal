import java.util.*;

public class MultiplesCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        // Read input numbers from the user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Map to store counts of multiples
        Map<Integer, Integer> multiplesCount = new LinkedHashMap<>();

        // Initialize the map for keys 1 to 9
        for (int i = 1; i <= 9; i++) {
            multiplesCount.put(i, 0);
        }

        // Count how many numbers are divisible by each from 1 to 9
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    multiplesCount.put(i, multiplesCount.get(i) + 1);
                }
            }
        }

        // Display the result
        System.out.println("Output:");
        System.out.println(multiplesCount);

        scanner.close();
    }
}
