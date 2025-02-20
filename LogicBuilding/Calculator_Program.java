import java.util.*;
public class Calculator_Program
{
    // We make separate methods to add, subtract, multiply and divide two numbers.
    double sum(double a, double b){
        return (a+b);
    }
    double product(double a, double b){
        return (a*b);
    }
    double quotient(double a, double b){
        return (a/b);
    }
    double minus(double a, double b){
        return (a-b);
    }
    public static void main(String args[])
    {
        Calculator_Program ob = new Calculator_Program();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 2 numbers");
        double x = sc.nextDouble ();//1st number
        double y = sc.nextDouble ();//2nd number
        sc.nextLine();// VERY IMP. find out why?
        System.out.println("Enter: '+' for sum");
        System.out.println("       '-' for 1st no - 2nd no");                              
        System.out.println("       '*' for product");        
        System.out.println("       '/' for 1st no / 2nd no");
        char choice = sc.nextLine().charAt(0);
        switch (choice){
            case '+': System.out.println("sum of "+x+ " and "+y+" is "+ob.sum(x, y));
            break;
            case '-': System.out.println("difference of "+x+ " and "+y+" is "+ob.minus(x, y));
            break;
            case '*': System.out.println("product of "+x+ " and "+y+" is "+ob.product(x, y));
            break;
            case '/': System.out.println("quotient of "+x+ " and "+y+" is "+ob.quotient(x, y));
            break;
            default:System.out.println("INVALID");
        }
    }
}