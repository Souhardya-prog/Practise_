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
        return (int)Math.log10(n)+1 ;
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
                System.out.println("Rearranged number with even digits placed first: "+Rearranged);
            }
        }
    }
}