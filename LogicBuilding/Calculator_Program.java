import java.util.*;
public class Calculator_Program
{
    double sum = 0;
    double product = 0.0;
    double quotient = 0.0;
    double minus = 0.0;
    double Sum(double a, double b){
        sum =  (a+b);
        return (sum);
    }
    double Product(double a, double b){
        product = a*b;
        return (product);
    }
    double Quotient(double a, double b){
        quotient = a/b;
        return (quotient);
    }
    double Minus(double a, double b){
        minus = a-b;
        return (minus);
    }
    public static void main(String args[])
    {
        Calculator_Program ob = new Calculator_Program();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 2 numbers");
        double x = sc.nextDouble ();//1st number
        double y = sc.nextDouble ();//2nd number
        sc.nextLine();
        System.out.println("Enter: '+' for sum");
        System.out.println("       '-' for 1st no - 2nd no");                              
        System.out.println("       '*' for product");        
        System.out.println("       '/' for 1st no / 2nd no");
        char choice = sc.nextLine().charAt(0);
        switch (choice){
            case '+': System.out.println("sum of "+x+ " and "+y+" is "+ob.Sum(x, y)); 
            break;
            case '-': System.out.println("minus of "+x+ " and "+y+" is "+ob.Minus(x, y));
            break;
            case '*': System.out.println("product of "+x+ " and "+y+" is "+ob.Product(x, y));
            break;
            case '/': System.out.println("quotient of "+x+ " and "+y+" is "+ob.Quotient(x, y)); 
            break;
            default:System.out.println("INVALID");
        }
    }
}