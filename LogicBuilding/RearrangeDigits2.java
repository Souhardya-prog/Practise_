//This program is supposed to rearrange the digits of a number in such a way that odd and even digits come in
// alternate sequential order.
// E.g. - Input-248931. Output-
import java.util.Scanner;

public class RearrangeDigits2 {
    static int oddCurrentNumber;
    static int evenCurrentNumber;
    static int currentNumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter a positive number of at least 3 digits");
            n = scanner.nextInt();
        } while (n < 100);
        oddCurrentNumber = n;
        evenCurrentNumber = n;
        currentNumber = n;
        int digitCount = numberOfDigits(n);
        long rearranged = 0;

        boolean oddActive = false;
        for (int i = 0; i < digitCount; i++) {
            if (i % 2 == 0) {
                int oddDigit = getOddDigits(oddCurrentNumber);
                if (oddDigit != -1) {
                    rearranged = rearranged *10 + oddDigit;
                }
            }
            else {
                if(currentNumber != 0){
                    int evenDigit = getEvenDigits(evenCurrentNumber);
                    if (evenDigit != -1) {
                    rearranged = rearranged * 10 + evenDigit;
                    }
                }
                else{
                    int oddDigit = getOddDigits(oddCurrentNumber);
                    if (oddDigit != -1) {
                        rearranged = rearranged *10 + oddDigit;
                    }
                }
            }
        }
        System.out.println("The rearranged number is: " + rearranged);
    }

    static int numberOfDigits(int a) {
        return (int) Math.log10(a) + 1;
    }

    static int getOddDigits(int a) {
        while (a > 0) {
            int digit = (int) (a / Math.pow(10, numberOfDigits(a) - 1));
            if (digit % 2 != 0) {
                oddCurrentNumber = (int) (a % Math.pow(10, numberOfDigits(a) - 1));
                currentNumber=(int) (a % Math.pow(10, numberOfDigits(a) - 1));
                return digit;
            }

            a = (int) (a % Math.pow(10, numberOfDigits(a) - 1));
        }

        return -1;
    }

    static int getEvenDigits(int a) {
        while (a > 0) {
            int digit = (int) (a / Math.pow(10, numberOfDigits(a) - 1));
            if (digit % 2 == 0) {
                evenCurrentNumber = (int) (a % Math.pow(10, numberOfDigits(a) - 1));
                currentNumber = (int) (a % Math.pow(10, numberOfDigits(a) - 1));
                return digit;
            }
            if(ifnextdigitisZero(a)){
                return 0;
            }

            a = (int) (a % Math.pow(10, numberOfDigits(a) - 1));
        }
        return -1;
    }
    static boolean ifnextdigitisZero(int a){//The problem is with the value of a.
        int digits = numberOfDigits(a);
        for (int i = 1; i <= digits-1; i++) {
            if(i == digits-1 && a%10 == 0){
                return true;
            }
            a/=10;
        }
        return false;
    }
}

