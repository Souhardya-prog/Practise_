package Arrays;
//Write a Java program to reverse an array
public class Array_Reversal
{
    public static void main(String args[])
    {
        int arr[] = {10, 3, 7, 90};
        ReverseArray(arr);
    }
    static void ReverseArray(int []arr){
        int n = Math.floorDiv(arr.length, 2);// Finding greatest integer of a divisin. Greatest integer of 2.5 is 2, of 2 is 2;
        int temp;// temporary box
        for (int i = 0; i < n ; i++) {
            temp = arr[i];// we are first putting arr[i] in a empty box.
            arr[i]  = arr[arr.length - i - 1];// Then we are putting arr[l-i-1] in arr[i] box
            arr[arr.length - i - 1]= temp;//Finally putting arr[i] from temp box to arr[l-i-1] box
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}