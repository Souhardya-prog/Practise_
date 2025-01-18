//Wap a program to reverse a number
import java.util.Scanner;
public class ReverseDigits
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        double n = sc.nextDouble ();
        int c=1;
        for (int i = 10; i<= n; i=i*10){
            c++;
        }
        double a=0;
        for (int i =1; i<=c; i++){
           a= n%10;
           System.out.println(+a);
           n=n/10;
        }
    }
} 


