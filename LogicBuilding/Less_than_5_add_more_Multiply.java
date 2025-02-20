import java.util.Scanner;

// 1. Use Scanner class to input the number.
// 2. Create two global variables sum and product.
// 3. Create a method to extract digits and check if less than five then increment sum var, else multiply product.
public class Less_than_5_add_more_Multiply {
    static int sum = 0;
    static int product = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number.");
        int n = scanner.nextInt();

        extractDigits(n);

        n = product * (int)Math.pow(10, getDigitCount(sum)) + sum;
        System.out.println("Rearranged number: "+n);
    }
    static int getDigitCount(int n){
        return (int)Math.log10(n) + 1;
    }

    static void extractDigits(int n){
        while(n>0){
            if (n%10 < 5) {
                sum += n%10;
            } else {
                product *= n%10;
            }
            n/=10;
        }
    }
}
