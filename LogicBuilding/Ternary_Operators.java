//Ternary operators
import java.util.Scanner;
public class Ternary_Operators
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt ();
        /*if(n%10 ==0)
         System.out.println("divisible by 10");
        else 
         System.out.println("not divisible by 10");*/
         
        //Using Ternary operators
        String Result = "";
        Result = (n%10 == 0) ? "divisible by 10" : "not divisible by 10";
        System.out.println(Result);
    }
}