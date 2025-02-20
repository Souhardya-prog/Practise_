// n1 = 1234. Increasing number.
// n2 = 9876. Decreasing number.
//n3 = 492847. Neither

// 1. Take number of terms as input.
// 2. Create 2 global variables Decreasing and Increasing(both int).
// 3. Take the number as input first pass it to Descending(int n) then to Ascending(int n).
// 4. Descending will rearrange number in descending order and store it in Decreasing while Ascending will do the opposite.
// 5. If the original matches with Decreasing then it is a decreasing number and so on.

import java.util.Scanner;

public class check_if_number_is_Increasing_or_Decreasing {
    static int Decreasing;
    static int Increasing;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of numbers.");
        int n = scanner.nextInt();

        for (int i = 0; i <n ; i++) {
            int num;
            do{
                System.out.println("Enter a number of at least 3 digits.");
                num = scanner.nextInt();
            }while(num<100);
            Descending(num);
            Ascending(num);
            if(num == Increasing){
                System.out.println("Increasing number");
            }
            else if (num == Decreasing ) {
                System.out.println("Decreasing number");
            }
            else{
                System.out.println("Neither decreasing nor increasing.");
            }
        }
    }
    static void Descending(int n){
        int D = 0;
        for (int j = 9; j >= 0; j--) {
            // Logic of this is that we are checking if any digit of the number is equal to 9.
            // if yes then start forming the new number with 9. This way we check if each digit is equal to
            // the range from 9-0 and rearrange the number in descending order.
            int k = n;
            while(k>0){
                if(k%10 == j) {
                    D = D * 10 + (k % 10);
                }
                k/=10;
            }
        }
        Decreasing = D;
    }
    static void Ascending(int n){
        int copy = n;
        Increasing = 0;
        for (int i = 0; i <=9 ; i++) {
            while(copy>0){
                if(copy%10 == i){
                    Increasing = Increasing*10 + copy%10;
                }
                copy/=10;
            }
            copy = n;
        }
//        System.out.println(Increasing);
    }
}
