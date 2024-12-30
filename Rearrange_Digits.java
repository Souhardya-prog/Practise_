import java.util.Scanner;

public class Rearrange_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive number");
        int n = scanner.nextInt();
        int ODC=0, EDC=0;
        int odd=0, even=0;
        int digitsCount = (int)Math.log10(n) +1;
        int digits = 0;
        for (int i = 1; i <=digitsCount ; i++) {
            digits = (n/(int)Math.pow(10, digitsCount-i))%10;
            if(digits%2!=0){
                odd= odd*10 + digits;
                ODC++;
            }if(digits%2==0){
                even= even*10 + digits;
                EDC++;
            }
        }
        System.out.println("Original number: "+n);
        n= even*(int)Math.pow(10, ODC) + odd;
        System.out.println("Even digits kept first: "+n);
        n=odd*(int)Math.pow(10, EDC) + even;
        System.out.println("Odd digits kept first: "+n);
    }
}
