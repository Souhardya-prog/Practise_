/*WAP to accept a positive integer. Add the digits less than or equal to 5, multiply the digits greater than 5. Using
the sum and the product reform the number and display it.*/

import java.util.Scanner;

public class Less_than_5_Add_more_Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter a positive number");
            n = scanner.nextInt();
        }while(n<0);
        int sum = 0;
        int prod = 1;
        while(n>0){
            if(getDigits(n)<=5){
                sum+=getDigits(n);
            }
            else{
                prod*=getDigits(n);
            }
            n/=10;
        }
        n = sum * (int)Math.pow(10, digitCount(prod)) + prod;
        System.out.println("The rearranged number is: "+n);
    }
    static int digitCount(int n){
        return (int)Math.log10(n)+1;
    }
    static int getDigits(int n){
        return n%10;
    }
}
