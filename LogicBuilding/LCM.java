//LCM
import java.util.*;
public class LCM
{
    public static void main(String args[])
    {
        int LCM = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt ();
        System.out.println("enter second number");
        int b = sc.nextInt ();
        int min = Math.min(a,b);//Minimum of the two
        int max = Math.max(a,b);//Maximum of the two
        for(int i= max; i<= (max*min);i++){  //Value of LCM can be any where between Max and (Max * Min);LCM>= Max and <= Max * Min
          if(i % max ==0 && i % min ==0){
              LCM = i;
              break;
          }
        }
        System.out.println("LCM of"+max+"and"+min+"is"+LCM);
    }
}

