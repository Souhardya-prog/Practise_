//Program to find the frequency of a digit in a number n.
import java.util.Scanner;
public class Frequency
{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        long n = sc.nextLong ();
        int di = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        int counter7 = 0;
        int counter8 = 0;
        int counter9 = 0;
        int counter0 = 0;
        for(int i = 1; i <=n; n=n/10){
            di = (int)(n%10);
            switch (di){
                case 1: counter1= counter1 + 1;
                break;
                case 2: counter2 = counter2 + 1;
                break;
                case 3: counter3 = counter3 + 1;
                break;
                case 4: counter4 = counter4 + 1;
                break;
                case 5: counter5 = counter5 + 1;
                break;
                case 6: counter6 = counter6 + 1;
                break;
                case 7: counter7 = counter7 + 1;
                break;
                case 8: counter8 = counter8 + 1;
                break;
                case 9: counter9 = counter9 + 1;
                break;
                case 0: counter0 = counter0 + 1;
            }
        }
            System.out.println("Frequncy of 1: "+counter1);
            System.out.println("Frequncy of 2: "+counter2);
            System.out.println("Frequncy of 3: "+counter3);
            System.out.println("Frequncy of 4: "+counter4);
            System.out.println("Frequncy of 5: "+counter5);
            System.out.println("Frequncy of 6: "+counter6);
            System.out.println("Frequncy of 7: "+counter7);
            System.out.println("Frequncy of 8: "+counter8);
            System.out.println("Frequncy of 9: "+counter9);
            System.out.println("Frequncy of 0: "+counter0);
    }
}