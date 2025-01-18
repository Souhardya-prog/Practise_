import java.util.Scanner;

// find sum up to n terms of (1^2 + 3^4) - (1^2 + 3^4 + 5^6) + (1^2 + 3^4 + 5^6 + 7^8)... to n terms
public class Series_Sum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = scanner.nextInt();
        int sum = 0;
        int base;
        int power;
        int sign = -1;
        int currentNumber;
        for (int i = 1; i <=n ; i++) {
            base = 1;
            power = 2;
            currentNumber= 0;
            for (int j = 1; j <= i+1 ; j++) {
                currentNumber += (int) Math.pow(base, power)*(int)(Math.pow(sign, i+1));
                base+=2;
                power+=2;
            }
            sum += currentNumber;
        }
        System.out.println(sum);
    }
}