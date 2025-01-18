//program to print no.of digits a program has
import java.util.Scanner;
public class Digits_no
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt ();
        int c=0;
        int copy=n;//We are making copy because we do not want to
                   //change the original number 'n'.
        while(copy>0){
            c++;
            copy = copy/10;
        }
        System.out.println("Number of digits = "+c);
        
        
        
        
        /*Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt ();
        int c=1;
        for (int i = 10; i<= n; i=i*10){
            c++;
        }
        System.out.println("no.of digits="+c);
        */
    }
}

