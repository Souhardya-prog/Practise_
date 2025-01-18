/*Accept a minimum 5 digit number and do the following
 * a) Print the sum of the even positioned digit
 * b) Print the product of odd positioned digit
 * c) Print the composite number (if any ) with the count
 *    Give error message if there is no composite number*/
 import java.util.Scanner;
 public class Digit_position
 {
     public static void mains(String args[]){
         Scanner sc = new Scanner (System.in);
         int n = 0;
         while(n < 10000){
            n = sc.nextInt (); 
            if(n < 10000){
                System.out.println("Enter a number of at least five digits");
            }
         }
     }
 }