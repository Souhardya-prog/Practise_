//program to display to difference of digits of odd 
//position and even position starting from left.
import java.util.Scanner;
public class Diff_Odd_Even
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number of minimum four digits");
        int n =0;
        do{
            n = sc.nextInt ();
            if(n < 1000)
                System.out.println("Invalid, number should be of atleast four digits"); 
        }while(n < 1000);
        int c = 0;//counter
        for(int i = n; i>=1; i/=10){
            c++;
        }
        System.out.println("digit count: "+c);
        int di = 0;//accumulator
        int odd=0, even = 0;
        int copy = c;
        for(int j = 1; j<=copy; j++){
            di = n/(int)Math.pow(10, (c-1));
            System.out.println("position of "+di+" is "+j);
            if(j % 2 == 0)
                even = even + di;
            else
                odd = odd + di;
            n = n%(int)Math.pow(10, (c-1));
            c--;
        }
        int diff = 0;
        if(even > odd)
            diff = even - odd;
        else 
            diff = odd - even;
        System.out.println("difference of sums of odds and evens is: "+diff);
    }
}