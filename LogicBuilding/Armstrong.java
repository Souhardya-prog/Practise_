//Wap a program to check if it is an armstrong number
import java.util.Scanner;
public class Armstrong
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt ();//IMP: Declaring 'n' as double would lead to logical error*
        int copy =n;
        int c=1;
        for (int i = 10; i<= n; i=i*10){
            c++;
        }
        double a = 0;
        double sum=0.0;
        for (int i =1; i <=c;i++){
            a= n%10;
            sum = sum + Math.pow(a, c);
            n=n/10;//* if 'n' is declared as double then, the next value of n after n/10 would have decimals.Therefore value of n would be more than desired value.
        }
        if(copy==sum){
            System.out.println(+copy+" is an Armstrong number");
        }
        else
            System.out.println(+copy+"is not an Armstrong number");
    }
}    

