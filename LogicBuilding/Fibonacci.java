import java.util.Scanner;
public class Fibonacci
{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of terms");
        int n = sc.nextInt ();
        int a =0;
        int b=1;
        int FiboS = 0;
        for(int i =1; i<=n; i++){
            FiboS= (a + b);
            a=b;
            b=FiboS;
        }
        System.out.println("Fibonacci of "+n+" terms is: "+FiboS);
    }
}