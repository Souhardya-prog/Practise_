public class PatternPrinter {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Outer loop for rows
        for (int i = 0; i < n; i++) {
            // Inner loop for columns
            for (int j = 0; j < n - i; j++) {
                if (j % 2 == 0) {
                    System.out.print("&"); // Print the special character
                } else {
                    if ((j / 2) % 2 == 0) {
                        System.out.print("4"); // Print 4 for even pairs
                    } else {
                        System.out.print("2"); // Print 2 for odd pairs
                    }
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
