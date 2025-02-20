//Program to print armstrongs within given range
import java.util.Scanner;
public class Armstrongs_Range
{
    int Lr = 0;
    int Ur = 0;
     void AcceptRange(){
        Scanner sc = new Scanner (System.in);
        do{
            System.out.println("Enter two numbers");
            int x = sc.nextInt ();
            int y = sc.nextInt ();
            Lr = Math.min(x , y);
            Ur = Math.max(x, y);
            if(!((Lr > 999 && Lr <= 9999) && (Ur > 99999 && Ur <= 999999)))
              System.out.println("Invalid try again");
        }while(!((Lr > 999 && Lr <= 9999) && (Ur > 99999 && Ur <= 999999)));
        System.out.println("Upper range = "+Ur+" Lower range = "+Lr);
    }
    static int DigitCount(int a){//No call
        int c=0;
        while(a>0){
            a++;
            a = a/10;
        }
        return(c);
    }
     void ArmstrongCheck(){
        int i=Lr;
        while(i<=Ur){
             int Arm = 0;
            int DCount = DigitCount(i); //Gives digitcount of 'i'.
            int copy = i;
            while(copy>0){
                int D = copy % 10; // Extracting the digits directly from here and not creating separate method.
                Arm = (int)Math.pow(D, DCount) + Arm;
                copy/=10;
            }
            if(Arm == i){
                System.out.println(+Arm+" is an Armstrong number ");
            }
            i++;
        }
    }
    public static void main(String args[]){
        Armstrongs_Range ob = new Armstrongs_Range();
        ob.AcceptRange();
        ob.ArmstrongCheck();
    }
}