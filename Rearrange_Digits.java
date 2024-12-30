//This program is supposed to rearrange the digits in such a way that either the odd digits come first or the even digits.
import java.util.Scanner;

public class Rearrange_Digits{
    static int evenNum;
    static int oddNum;
    static boolean isNegative = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = scanner.nextInt();
        if(n < 0){
            isNegative = true;
            n = Math.abs(n);
        }
        int digitCount = getDigitCount(n);
        for (int i = 0; i < digitCount; i++) {
            if(getDigits(n) % 2 == 0){
                formEvenNum(getDigits(n));
            }
            else{
                formOddNum((getDigits(n)));
            }
            n = n%(int)Math.pow(10, getDigitCount(n) - 1);
        }
        showRearrangedNumber();
    }
    static int getDigitCount(int n){
        return (n == 0) ? 1 : (int)Math.log10(n) + 1;
    }
    static int getDigits(int n){
        return n/(int)Math.pow(10, getDigitCount(n) - 1);
    }
    static void formEvenNum(int evenDigit){
        evenNum = evenNum *10 + evenDigit;
    }
    static void formOddNum(int oddDigit){
        oddNum = oddNum *10 + oddDigit;
    }
    static void showRearrangedNumber(){
//        oddNum, evenNum.
        long Rearranged;
        if(isNegative){
            Rearranged = (int) (evenNum * Math.pow(10, getDigitCount(oddNum)) + oddNum);
            if(Rearranged>Integer.MAX_VALUE || Rearranged<Integer.MIN_VALUE){
                System.out.println("Rearranged number with even digits placed first is out the integer range: ");
            }
            else{
                System.out.println("Rearranged number with even digits placed first: "+ -Rearranged);
            }

            Rearranged = (int) (oddNum * Math.pow(10, getDigitCount(evenNum)) + evenNum);
            if(Rearranged>Integer.MAX_VALUE || Rearranged<Integer.MIN_VALUE){
                System.out.println("Rearranged number with even digits placed first is out the integer range: ");
            }
            else{
                System.out.println("Rearranged number with even digits placed first: "+ -Rearranged);
            }
        }
        else{
            Rearranged = (int) (evenNum * Math.pow(10, getDigitCount(oddNum)) + oddNum);
            if(Rearranged>Integer.MAX_VALUE || Rearranged<Integer.MIN_VALUE){
                System.out.println("Rearranged number with even digits placed first is out the integer range: ");
            }
            else{
                System.out.println("Rearranged number with even digits placed first: "+Rearranged);
            }

            Rearranged = (int) (oddNum * Math.pow(10, getDigitCount(evenNum)) + evenNum);
            if(Rearranged>Integer.MAX_VALUE || Rearranged<Integer.MIN_VALUE){
                System.out.println("Rearranged number with even digits placed first is out the integer range: ");
            }
            else{
                System.out.println("Rearranged number with odd digits placed first: "+Rearranged);
            }
        }
    }
}
//This code works well for non-zero containing numbers, but if the numbers contain zero it does not give correct result. Below is the code to tackle this issue using string From ChatGPT.

/*

import java.util.Scanner;

public class Rearrange_Digits {
    static String evenNum = "";
    static String oddNum = "";
    static boolean isNegative = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = scanner.nextInt();
        if (n < 0) {
            isNegative = true;
            n = Math.abs(n);
        }
        int digitCount = getDigitCount(n);
        for (int i = 0; i < digitCount; i++) {
            int digit = getMostSignificantDigit(n);
            if (digit % 2 == 0) {
                formEvenNum(digit);
            } else {
                formOddNum(digit);
            }
            n = removeMostSignificantDigit(n);
        }
        showRearrangedNumber();
    }

    static int getDigitCount(int n) {
        return (n == 0) ? 1 : (int)Math.log10(n) + 1;
    }

    static int getMostSignificantDigit(int n) {
        return n / (int)Math.pow(10, getDigitCount(n) - 1);
    }

    static int removeMostSignificantDigit(int n) {
        return n % (int)Math.pow(10, getDigitCount(n) - 1);
    }

    static void formEvenNum(int evenDigit) {
        evenNum += evenDigit;
    }

    static void formOddNum(int oddDigit) {
        oddNum += oddDigit;
    }

    static void showRearrangedNumber() {
        try {
            long rearranged;

            if (isNegative) {
                rearranged = Long.parseLong(evenNum + oddNum);
                System.out.println("Rearranged number with even digits placed first: " + -rearranged);

                rearranged = Long.parseLong(oddNum + evenNum);
                System.out.println("Rearranged number with odd digits placed first: " + -rearranged);
            } else {
                rearranged = Long.parseLong(evenNum + oddNum);
                System.out.println("Rearranged number with even digits placed first: " + rearranged);

                rearranged = Long.parseLong(oddNum + evenNum);
                System.out.println("Rearranged number with odd digits placed first: " + rearranged);
            }
        } catch (NumberFormatException e) {
            System.out.println("Rearranged number is out of the integer range.");
        }
    }
}
*/
