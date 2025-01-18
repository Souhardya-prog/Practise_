//program to print digits of number 'n'.
import java.util.*;
public class PrintDigits
{
    public static void main (String args[])
    {
        int d=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt ();
        for(; n>0; n = n /10){
            d = n % 10;
            System.out.println(+d);
       }
    }    
}

