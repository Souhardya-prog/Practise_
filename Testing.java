class MathUtility{
    static void calculate(){
        System.out.println("Thanks for calling");
    }
}
public class Testing {
    public static void main(String[] args) {
        new MathUtility().calculate();// option b
        MathUtility.calculate();// option c
    }
}
