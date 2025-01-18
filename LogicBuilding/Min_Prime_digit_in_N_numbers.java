/*
Write a program that will take N positive number containing at least 3 digits from user and print the sum of
minimum digit which is a prime number from each number. If any of the number does not contain prime digit then
consider the sum of the digits of that number to be the number to be added.
        Example: N=3
Number 1: 567
Number 2: 644
Number 3: 4552
Output: 21 (5+(6+4+4)+2=5+14+2)
*/

import java.util.Scanner;
public class Min_Prime_digit_in_N_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        do{
            System.out.println("Enter number of terms");
            N = scanner.nextInt();
        }while(N<=0);

        int sum = 0;

        for (int i = 0; i <N ; i++) {
            int num;
            do{
                System.out.println("Enter number of at least 3 digits");
                num = scanner.nextInt();
            }while(num<100);
            sum+= getLowestPrime(num);
        }
        System.out.println("Required result is: "+sum);
    }

    static int getLowestPrime(int num) {
        Scanner sc = new Scanner(System.in);
        int D = 0;


        for (int j = 9; j >= 0; j--) {
            for (int k = num; k>0; k /= 10) {
                if (k % 10 == j) {
                    D = D * 10 + (k % 10);
                }
            }
        }
//        System.out.println(D);
        int lowestPrime = 0;
        int primeCount = 0;
        while(D>0){
            if(checkPrime(D%10)){
                primeCount++;
                lowestPrime = D%10;
                break;
            }
            D/=10;
        }
        if(primeCount!=0){
            return lowestPrime;
        }
        return digitSum(num);
    }
    static int digitSum(int n){
        int sum =0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    static boolean checkPrime(int n){
        if(n==1 || n==0)return false;
        for (int i = 2; i <=n/2 ; i++) {

            if(n%i==0)return false;
        }
        return true;
    }
}
