//Print the multiplication table of n upto t terms
import java.util.Scanner;
public class Multiplication_Table
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter the number whose multiplication table is to be found");
      int n = sc.nextInt ();
      System.out.println("Enter the number upto which the table is to be calculated");
      int t = sc.nextInt ();
      int prod = 1;
      for (int i = 1; i <= t; i++){
          prod = n * i;
          System.out.println(n+" * "+i+" = "+prod);
      }
    }
}  


