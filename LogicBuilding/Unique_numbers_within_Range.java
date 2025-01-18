/*Write a program to print all the unique digit numbers within lower and upper range taken from user.
A unique digit number is a positive  integer  (without leading zeros) with no duplicate digits.
For example  7, 135, 214 are unique digit numbers.*/

//1. first create a method getDigits(). pass the number to this method, the method will extract each digit
// of the number.
//2. Create a method compareWithOtherDigits(). Pass each digit of the number from left to right, also pass
// the rest of the number to this method. The method compare the current digit to the rest of the number.
//3. Create a field isUnique, set to true.
//3. If the current digit matches with any other digit of the rest of the number then isUnique = false.
//4. After the entire process of comparing each digit with the rest of the number the control will come back
// to the loop in the main method.
//5. check in the loop that if isUnique is true then print the number else continue to the next Number.

import java.util.Scanner;

public class Unique_numbers_within_Range {
    static int digit = -1;
    static boolean isUnique = true;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lower limit");
        int n1 = scanner.nextInt();
        System.out.println("Enter upper limit");
        int n2 = scanner.nextInt();
        int LL = Math.min(n1, n2);
        int UL = Math.max(n1, n2);
        for (int i = LL; i <= UL; i++) {
            getDigits(i);
            if(isUnique){
                System.out.println(i+" is a unique number.");
            }
            isUnique = true;
        }
    }
    static void getDigits(int n){
        int digit;
        while(n>0){
            digit = n%10;
            n/=10;
            compareWithOtherDigits(digit, n);
        }
    }
    static void compareWithOtherDigits(int currentDigit, int num){
        while(num>0){
            if(currentDigit == num%10){
                isUnique = false;
            }
            num/=10;
        }
    }
}



/*
int copy = i;
            while(copy>0){
isUnique(copy);
                if(!isUnique){
        break;
        }
copy/=10;
        }
        if(isUnique){
        System.out.println(+i+" is a unique digit number.");
            }
digit = -1;
isUnique = true;*/
