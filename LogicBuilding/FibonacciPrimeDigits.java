import java.util.Scanner;

public class FibonacciPrimeDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept number of terms (n) from user
        System.out.println("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        // Initial Fibonacci numbers
        int a = 0, b = 1;

        // Print the Fibonacci series
        System.out.print("Fibonacci series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        System.out.println();

        // Reinitialize Fibonacci numbers for checking prime digits
        a = 0;
        b = 1;

        // Print Fibonacci terms with at least one prime digit
        System.out.print("Fibonacci terms having at least one prime digit: ");
        for (int i = 1; i <= n; i++) {
            if (hasPrimeDigit(a)) {
                System.out.print(a + " ");
            }
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }

    // Function to check if a number has at least one prime digit (2, 3, 5, 7)
    public static boolean hasPrimeDigit(int num) {
        // Check each digit of the number
        while (num > 0) {
            int digit = num % 10;  // Get the last digit
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                return true;  // Found a prime digit
            }
            num /= 10;  // Remove the last digit
        }
        return false;  // No prime digit found
    }
}

