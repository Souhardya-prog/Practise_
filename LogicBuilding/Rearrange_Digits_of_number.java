

/*
Write a program which will accept N numbers from the user having at least 3 digits and can contain only
a combination of digits where the digit can be only from 2 to 8 [Do validity checking]. Update each digit
of the number such that all the odd digits will be changed to the next digit in the natural number series
and all the even digits will be changed to the previous digit. Finally display both original and updated
number.
        Example: If the number is 262457
Updated number: 151368
        [Don`t use array / String]
*/
//1. First use Scanner class to input number of terms from the user.
// 2. Then use do-while loop to take the number as input and make sure it has more than 2 digits and
// the digits may only be from 2-8.
//3. Update the number in such a way that all the odd digits are changed to the next Digit on the range, and
// all the even digits will be changed to the previous digit on the range.
//4. Define a global variable updatedNumber.
//5. Make a method updateNumber(int n). Its going to check each digit from right to left, whether it is
// even or odd. If odd then pass the digit to method ifOdd() and if even then pass to a method ifEven().
//6. ifOdd(int digit) will increment the digit by one and start forming updatedNumber.
//7. ifEven(int digit) wil decrement the digit by one and form the updated Number.

import java.util.Scanner;

public class Rearrange_Digits_of_number {
    static int updatedNumber = 0;
    public static void main(String[] args) { // 262457 - 151368
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter number of terms.");
       int n = scanner.nextInt();
        int num;
        for (int i = 0; i <n ; i++) {
            do {
                System.out.println("Enter a number of at least 3 digits and the digits may only be from 2-8.");
                num = scanner.nextInt();
            }while(!checkDigits(num) || num<100);

            System.out.println("Original number: "+num);
            updateNumber(num);
            System.out.println("Updated number: "+updatedNumber);
            updatedNumber = 0;
        }
    }
    static boolean checkDigits(int n){
        while(n>0){
            if(n%10 == 0 || n%10 == 1 || n%10 == 9) return false;
            n/=10;
        }
        return true;
    }
    static int digitCount(int n){
        return (int)Math.log10(n) + 1;
    }


    static void updateNumber(int n){
        //253
        while(n>0){
            int digit = n/(int)Math.pow(10, digitCount(n)-1);
            if(digit%2 == 0){
                ifEven(digit);
            }
            else {
                ifOdd(digit);
            }
            n = n%(int)Math.pow(10, digitCount(n)-1);
        }
    }
    static void ifEven(int digit){
        updatedNumber = updatedNumber * 10 + (digit-1);
    }
    static void ifOdd(int digit){
        updatedNumber = updatedNumber * 10 + (digit+1);
    }
}
