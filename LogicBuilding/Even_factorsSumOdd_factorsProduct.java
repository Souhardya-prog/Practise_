/*program to print sum of even factors and product of odd factors of a  
 natural number n */
 import java.util.Scanner;
public class Even_factorsSumOdd_factorsProduct
 {
     public static void main(String args[])
     {
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter the positive number");
         int n = sc.nextInt ();
         int sum = 0;
         int prod = 1;
         int i = 1;
         while(i <= n){
             if (n % i == 0){
                 if(i % 2 == 0){
                     sum = sum + i;
                 }
                 else
                     prod = prod * i;
             }
             i++;
         }
         System.out.println("Sum of all Even factors of"+n+"is"+sum);
         System.out.println("Product of all Odd factors of"+n+"is"+prod);
     }
 }
 
 
 /*//Accept a number and print the even factors and odd factors separately
import java.util.Scanner;
public class EvenFactors_OddFactors
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enetr the number");
      int n = sc.nextInt ();
      System.out.println("Even Factors:");
      for (int i = 1; i <= n/2; i++){
          if (n % i == 0 && i % 2== 0){
              System.out.println(+i);
          }
      }
      System.out.println("Odd Factors");
      for (int i = 1; i <= n/2; i++){
          if (n % i == 0 && i % 2 != 0){
              System.out.println(+i);
          }
      }
    }
}*/

