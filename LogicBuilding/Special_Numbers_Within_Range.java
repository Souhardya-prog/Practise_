/*Write a program to print all the special numbers within lower and upper range taken from user.
A special number is a number which equals to sum of the factorial of its digits.
Eg: 145= 1! +4! +5!*/

import java.util.Scanner;

public class Special_Numbers_Within_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Lower range");
        int n1 = scanner.nextInt();
        System.out.println("Enter Upper range");
        int n2 = scanner.nextInt();
        int LR = Math.min(n1, n2);
        int UR = Math.max(n1, n2);
        int sum;
        int copy;
        for(int i = LR; i<= UR; i++){
            copy = i;
            sum = 0;
            while(copy>0){
                sum += factorial(getDigits(copy));
                copy/=10;
            }
            if(sum == i){
                System.out.println(i);
            }
        }

    }
    static int factorial(int n){
        int prod= 1;
        for (int i = n; i >0 ; i--) {
            prod *=i;
        }
        return prod;
    }
    static int getDigits(int n){
        return n%10;
    }
}
