import java.util.Scanner;
public class DigitEven_Sum_Odd_product
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt ();
        int copy = n;
        int di=0; int even =0; int odd = 0;
        for(;copy > 0; copy = copy /10){
            di = copy % 10;
            if (di % 2==0){
                even = di + even;
            }
            else{
                odd = di + odd;
            }
        }
        System.out.println("Sum of even digits: "+even+" sum of odd digits: "+odd);
    }
}