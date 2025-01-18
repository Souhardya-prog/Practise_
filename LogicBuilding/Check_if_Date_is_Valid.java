/*
Data members:
int day
int mon
int year
Methods:
void accept(): accept day, month and year as input
boolean isLeap(): returns true if it is leap year otherwise false.
boolean isValid(): returns true if date is valid otherwise false.
static void checkDate(): creates object and call methods.
*/



import java.util.Scanner;

public class Check_if_Date_is_Valid {
    int day;
    int mon;
    int year;
    void accept(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day");
        day = scanner.nextByte();
        System.out.println("Enter month");
        mon = scanner.nextByte();
        System.out.println("Enter year");
        year = scanner.nextInt();
    }

    public static void main(String[] args) {
        //creates objects and calls methods
        Check_if_Date_is_Valid ob = new Check_if_Date_is_Valid();
        ob.accept();
        System.out.println(ob.isValid());
    }
    boolean isLeap(){/*In the Gregorian calendar, any year that is evenly divisible by 4 is a leap year. However, years that are
                        evenly divisible by 100 are only leap years if they are also evenly divisible by 400. For example, 1900 was
                        not a leap year because it was evenly divisible by 100 but not by 400.*/
        if(year%4 == 0){
            if(year % 100 ==0){
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    boolean isValid(){
        boolean isLeap = isLeap();
        if(mon>=1 && mon<=12){
            if(mon == 2){
                if(isLeap){
                    if(day >=1 && day<= 29)return true;
                }
                else{
                    if(day >= 1 && day <= 28)return true;
                }
            }
            else{
                switch (mon){
                    case 1, 3, 5, 7, 8, 10, 12: if(day >=1 && day <= 31)return true;
                        break;
                    case 4, 6, 9, 11: if(day >=1 && day <= 30)return true;
                }
            }
        }
        return false;
    }
}
