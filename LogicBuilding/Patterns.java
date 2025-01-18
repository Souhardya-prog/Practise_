/*Write a program to draw the given pattern using user`s choice. The details of the class and its members are
given below.
Class Name: Patterns
Methods:
i) Pat1(int r): to display the pattern 1 upto r number of rows.
        ii) Pat2(int r,char ch): to display the pattern 2 upto r number of rows and ch as the character to print.
iii) static void menu(): create the menu driven program to implement the above logic by calling
the method s depending on  user’schoice.
        Pattern 1:  Pat1(5)                               Pattern 2: Pat2(5,’&’)
        1 * * * *                                         &4&2&
        * 2 * * *                                         4&2&
        * * 3 * *                                         &2&
        * * * 4 *                                         2&
        * * * * 5                                         &

        */




import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        System.out.println("Which pattern do you want?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for pattern1 and 2 for pattern2");
        byte choice = scanner.nextByte();
        Patterns ob = new Patterns();
        switch(choice){
            case 1:
                System.out.println("Enter number of terms");
                int r1 = scanner.nextInt();
                ob.pat1(r1);
            break;
            case 2:
                System.out.println("Enter number of terms");
                int r2 = scanner.nextInt();
                System.out.println("Enter character");
                scanner.nextLine();
                char ch = scanner.nextLine().charAt(0);
                ob.pat2(r2, ch);
        }
    }
    void pat1(int r){ /*1 * * * *
                        * 2 * * *
                        * * 3 * *
                        * * * 4 *
                        * * * * 5
                        */
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if(i==j){
                    System.out.print(i+" ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void pat2(int r, char ch){  /*&4&2&
                                  4&2&
                                  &2&
                                  2&
                                  &*/
        for (int i = 0; i < r; i++) {
            // Inner loop for columns
            for (int j = 0; j < r - i; j++) {
                if (j % 2 == 0) {
                    System.out.print(ch); // Print the special character
                } else {
                    if ((j / 2) % 2 == 0) {
                        System.out.print("4"); // Print 4 for even pairs
                    } else {
                        System.out.print("2"); // Print 2 for odd pairs
                    }
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
