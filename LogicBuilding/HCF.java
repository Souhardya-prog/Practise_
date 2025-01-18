//HCF
import java.util.*;
public class HCF
{ 
    public static void main(String args[])
    { 
        int HCF = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt ();
        System.out.println("Enter second number");
        int b = sc.nextInt ();
        int min = Math.min (a, b);//finding minimum of the two
        int max = Math.max (a, b);//finding maximum of the two
        for (int i = min;i >=1;i--){//HCF is always < or = the min number.
            if(min % i ==0 && max % i==0){//If true then HCF = value of i and control goes out of the loop, if false then loop reiterates.
                HCF = i;
                System.out.println ("HCF of"+min+ "and" +max+ "="+HCF);
                break;
            }
        }  
    }
}
/*import java.util.Scanner;
public class HCF
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the two numbers");
        int n1 =sc.nextInt ();
        int n2 =sc.nextInt ();
        int max = Math.max (n1, n2);
        int min = Math.min (n1, n2);
        int HCF =0;
        for( int i = max; i>= 1; i--){
            if (max % i==0 && min % i==0){
                HCF =i;
                break;
            }
        }
        System.out.println("HCF of "+min+" and "+max+" is "+HCF);
    }
}*/
