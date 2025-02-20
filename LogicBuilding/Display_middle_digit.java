/*
WAP to accept a positive integer. display the middle digit or digits in the number. Also if more than
 one middle digit is present then also display the sum of the 2 digits.
 */

import java.util.Scanner;

//33758. number of digits = 5. middle digit = 3rd from the left or right. step 1. n% 10^ 3 == 758. step 2. n/10^digitCount -1
// 1. Use Scanner class to input the number.
// 2.
public class Display_middle_digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number.");
        int n = scanner.nextInt();
        getMiddleDigits(n);
    }
    static int getDigitCount(int n){
        return (int)Math.log10(n) + 1;
    }
    static void getMiddleDigits(int n){
        int midPosition;
        int mid1;
        int mid2;
        if(getDigitCount(n)%2 == 0){

        }
        else{
            midPosition =  (getDigitCount(n) + 1) / 2;
        }
    }
}
