public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverseInt(1534236499));
    }
    static int reverseInt(int x){
        boolean isNegative = false;
        if(x<0){
            x= Math.abs(x);
            isNegative = true;
        }
        int digits = (int) Math.log10(x) +1;
        long newInt=0;
        for (int i = digits; i > 0; i--) {
            newInt = ((int)Math.pow(10, i-1)) *  (x%10) + (newInt);
            x/=10;
            if (newInt > Integer.MAX_VALUE) {
                return 0;
            }
        }
        if(isNegative){newInt = -newInt;}
        if (newInt < Integer.MIN_VALUE || newInt > Integer.MAX_VALUE) {
            return 0;
        }
        return (int)newInt;
    }
}
