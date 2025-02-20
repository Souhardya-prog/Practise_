import java.util.Scanner;

public class Rearrange_in_Ascending_Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        checkforLeadingZeroes(n);
    }
    static int ascending(int n){
        int copy = n;
        int Increasing = 0;
        for (int i = 0; i <=9 ; i++) {
            while(copy>0){
                if(copy%10 == i){
                    Increasing = Increasing*10 + copy%10;
                }
                copy/=10;
            }
            copy = n;
        }
        return Increasing;
    }
    static void checkforLeadingZeroes(int n){
        int copy = n;
        while(n>0){
            if(n%10 == 0){
                tackleLeadingZeroes(copy);
                System.exit(0);
            }
            n/=10;
        }
//        System.out.println(ascending(copy));
    }
    static void tackleLeadingZeroes(int n){
        int smallestNonZero = getsmallestNonZero(n);
        int zeroCount = getZeroCount(n);

        int firstPart = smallestNonZero * (int)Math.pow(10, zeroCount);
        int secondPart = ascending(n) - firstPart;

        int finalNumber = firstPart * (int)Math.pow(10, getDigitCount(secondPart)) + secondPart;
        System.out.println(finalNumber);
    }
    static int getsmallestNonZero(int n){
        int smallest = 9;
        while(n>0){
            if(n%10 <= smallest && n%10 != 0){
                if(n%10 == smallest){
                    smallest = smallest * 10 + n%10;
                }
                else{
                    smallest = n%10;
                }
            }
            n/=10;
        }
        return smallest;
    }
    static int getZeroCount(int n){
        int count = 0;
        while(n>0){
            if(n%10 == 0){
                count++;
            }
            n/=10;
        }
        return count;
    }
    static int getDigitCount(int n){
        return (int)Math.log10(n) + 1;
    }
}

