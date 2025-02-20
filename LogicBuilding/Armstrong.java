//Wap a program to check if it is an armstrong number
//1. Take input of the number from the user.
//2.
import java.util.Scanner;
public class Armstrong
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt ();//IMP: Declaring 'n' as double would lead to logical error*
        int copy =n;
        int sum =0;
        for (int i = 0; i <getDigitCount(n) ; i++) {
            sum+= (int) Math.pow(getDigits(copy), getDigitCount(n));
            copy/=10;
        }
        if(sum == n) System.out.println("Armstrong number");
        else System.out.println("Not an armstrong number");
    }

    public static int getDigitCount(int n){
        int c = 0;
        while(n>0){
            c++;
            n/=10;
        }
        return c;
    }
    public static int getDigits(int n){
        return n%10;
    }

}    

