import java.util.Scanner;

public class Recursion_sumofDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scanner.nextInt();

        System.out.println(Recursive_digitSum(n));
        System.out.println(DigitSumUsingRecursion(n));
    }

    static int Recursive_digitSum(int n) {
        if(n==0){
            return 0;
        }
        return  n%10 + Recursive_digitSum(n/10);
    }


    static int DigitSumUsingRecursion(int x){
        if(x/10 == 0){
            return x%10;
        }
        return (x%10)  + DigitSumUsingRecursion(x/10);
    }
}
