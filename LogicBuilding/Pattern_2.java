/*
Q18	Write a program to take the  number of lines (n) from the user  to print the following pattern given below.
        for n=5.
         1
       2  4
     3  6   9
  4   8  12  16
5  10  15  20  25
*/
//1. First use scanner class to input number of rows from the user.
//2. create an outer for-loop from 1 to n(inclusive).
//3. Within the outer loop first create a loop to print out the spaces in each row.
//4. Create a variable numbers within the scope of the outer-loop. Initialize to 0.
//5. Then create another inner-loop within the outer loop to print out the numbers by using the expression (numbers+=i).
import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms.");
        int n = scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            int numbers = 0;
            for (int j = i; j <n ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                numbers +=i;
                System.out.print(numbers);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

}
