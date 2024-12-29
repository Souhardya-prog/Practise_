import java.util.Scanner;

public class Character {
    static boolean demo(char ch){
        if ((int)ch >= 97 && (int)ch <=122) {
            return true;
        } else {
            return false;
        }
    }
    static void demo(char ch , char st){
        if (st=='u'|| st=='U') {
            if ((int)ch >=97 && (int)ch <=122){
                ch = (char)((int)ch - 32);
            } else if ((int) ch  >=65 && ch <= 90) {
                ch = ch;
            }
            else {System.out.println("Invalid first argument. \n Please enter small or capital alphabets");}
        } else {
            if ((int)ch >=97 && (int)ch <=122){
                ch = ch;
            } else if ((int) ch  >=65 && ch <= 90) {
                ch = (char)((int)ch + 32);
            } else {System.out.println("Invalid first argument. \n Please enter small or capital alphabets");}
        }
        System.out.println("The new updated character: "+ch);
    }
    static void demo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter of the english alphabet");
        char ch = scanner.nextLine().charAt(0);
        if ((int)ch >= 97 && (int)ch <= 122) {
            System.out.println("Lower case");
        } else if((int) ch  >=65 && ch <= 90){
            System.out.println("Upper case");
        }
        else{System.out.println("Invalid first argument. \n Please enter small or capital alphabets");}
    }
    public static void main(String[] args) {
        System.out.println(demo('s'));
        demo('S', 'x');
        demo();
    }
}
