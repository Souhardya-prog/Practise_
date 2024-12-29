import java.util.Scanner;

public class ReverseInteger{
    public static void main(String[] args) {
        //12345: 54321.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = scanner.nextInt();
        System.out.println("original number: "+n);
        int copy = n;
        if(n<0){
            n = Math.abs(n);
        }
        int digitCount = digitCount(n);
        int digit;
        int newNum = 0;
        for (int i = 0; i <digitCount ; i++) {
            digit = extractDigit(n);
            newNum = newNum *10 + digit;
            n/=10;
        }
        if (copy<0) {
            System.out.println("Reversed number: "+ -newNum);
        } else {
            System.out.println("Reversed number: "+newNum);
        }
    }
    static int digitCount(int n){
        return (int)Math.log10(n)+1;
    }
    static int extractDigit(int n){
        return n%10;
    }
}
