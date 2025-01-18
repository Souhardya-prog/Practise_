import java.util.Enumeration;
import java.util.Scanner;

/*
Write a program to take n 3 digit numbers from the user. Display the sum of all the second lowest digit of all
the numbers.
        Example: 674 second lowest digit: 6.
*/
//1. Use Scanner class to take number of terms as input from user
//2. Use a for loop to from 1 to n to take n 3 digit numbers as input.
//3. Use do-while loop within for loop to make sure that the numbers are of three digits.
//4. Use a sum variable in main method to store the sum of all the second lowest digits.
//5. Use a method findSecondLowest(int n) to get the second lowest of each number.
//6. After finding the first, middle, last digits of the number. Find using if statements the second largest
//   digit of the number.

public class Sum_of_second_Lowest_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            int num;
            do{
                System.out.println("Enter a number of three digits");
                num = scanner.nextInt();
            }while(num  <100 || num >999);
            sum+=findSecondLowest(num);
        }
        System.out.println("sum of the second largest digits is: "+sum);
    }
    static int findSecondLowest(int n){
        int last = n%10;
        int middle = (n/10)%10;
        int first = n/100;
         /*
         * e.g:- 674
         * first- 6
         * middle - 7
         * last - 4
         * */
        int secondLargest = 0;
        if((first>=middle || first>= last) && (first <= last || first <= middle)){
            secondLargest = first;
        }
        if((middle>=first || middle>=last) && (middle <= last || middle<=first)){
            secondLargest = middle;
        }
        if((last>=middle || last>=first) && (last <= first|| last<=middle)){
            secondLargest = last;
        }
        return secondLargest;
    }
}
