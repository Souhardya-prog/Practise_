import java.lang.reflect.Array;
import java.util.Scanner;

public class DigitCount_ofArrayInts {
    static Scanner sc = new Scanner(System.in);
    static int[] Arr;
    public static void main(String[] args) {
        System.out.println("Enter the number of integers");
        int n = sc.nextInt();
        Arr = new int[n];
        assignArray();
        passArrayInts();
    }
    static void assignArray(){
        for(int i = 0; i<Arr.length; i++){
            System.out.println("Enter number");
            int n = sc.nextInt();
            Arr[i]= n;
        }
    }
    static void passArrayInts(){
        for (int i = 0; i<Arr.length; i++){
            System.out.println("Digit count of integerC "+Arr[i]+" is "+findDigitCount(Arr[i]));
        }
    }
    static int findDigitCount(int n){
        if(n==0){
            return n;
        }
        if(n/10==0){
            return 1;
        }
        return 1+findDigitCount(n/10);
    }
}
