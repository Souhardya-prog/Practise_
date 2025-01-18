//Program to print the sum of even numbers and product of odd numbers among 'n' numbers.
import java .util.Scanner;
public class EvenSum_OddProduct
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of numbers");
        int n = sc.nextInt ();
        int sum=0;
        int prod = 1;
        if(n>0){
          for(int i =1; i <=n; i++){//n no of terms will be accepted
              System.out.println("Enter Number");
              int a = sc.nextInt ();
              if(a%2 ==0){
                sum = sum + a;
              }
              else{
                prod = prod * a;
              }
          }
          System.out.println("Sum of all even numbers="+sum);
          System.out.println("Product of all odd numbers="+prod);
          
        }
    }
}
