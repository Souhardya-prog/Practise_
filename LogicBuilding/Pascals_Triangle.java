/*
import java.util.Scanner;

public class Pascals_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int n = scanner.nextInt();
        int num=0;
        for (int i = 0; i <n ; i++) {
            //Printing the spaces
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }

            num= (int)Math.pow(11, i);

            //Now creating a loop to print each digit of the number side by side
            for (int j = 0; j <=i ; j++) {
                System.out.print(getfirstdigit(num, getNumberofDigits(num))+"  ");
                num = updateNumber(num);
            }
            System.out.println();
        }
    }
    public static int getfirstdigit(int n, int numberofdigits){
        int f = (int)(n/Math.pow(10, (numberofdigits-1)));
        return f;
    }
    public static int getNumberofDigits(int n){
        int count =0;
        while (n>0){
            n/=10;
            count++;
        }
        return count;
    }
    public static int updateNumber(int n){
        int updatedNumber = (int)(n%Math.pow(10, getNumberofDigits(n)-1));
        return updatedNumber;
    }
}

*/

import java.util.Scanner;

public class Pascals_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int n = scanner.nextInt();

        // Create an array to store the triangle
        int[][] triangle = new int[n][];

        // Build the triangle
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1]; // Allocate space for row i
            triangle[i][0] = 1; // First element is always 1
            triangle[i][i] = 1; // Last element is always 1

            // Fill in the interior values
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // Print the triangle
        for (int i = 0; i < n; i++) {
            // Print leading spaces for formatting
            for (int j = n; j > i + 1; j--) {
                System.out.print("  ");
            }
            // Print the values in the current row
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + "  ");
            }
            System.out.println(); // New line after each row
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
