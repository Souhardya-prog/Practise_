package Arrays;
import java.util.Random;
public class SortArray {
    static Random random = new Random();
    public static void main(String[] args) {
//        int []arr = {2, 1, 9, 0};
//        sortArray(arr);
        int []arr;
        insertionSort();
    }
    static void sortArray(int []arr){
//              This algorithm is a variation of Selection Sort where each element is compared with every other element,
        //      and swaps are made to sort the array in ascending order. This approach ensures that the smallest elements
        //      "bubble up" to their correct positions, though it is not the most efficient sorting method for large arrays
        //      due to its O(n^2) time complexity. For larger datasets, more efficient algorithms like Quick Sort or Merge Sort
        //      are preferred.
        System.out.println("Original Array: ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        int temp=0;
        for (int i = 0; i <arr.length-1 ; i++) {//Nested loops required.
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[i]){// for j = 1: swapping arr[i] and arr[i+1], for j=2: swap arr[i] whose value is now
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted Array: ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void insertionSort(){
        int []arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = random.nextInt(100);
            System.out.print(arr[i]+" ");
        }


        //My version aka the Overcomplicated version.
        /*for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for (int k = i; k >0 ; k--) {
                if(arr[k-1] > temp){
                    arr[k] = arr[k-1];
                    if(k-1 == 0){
                        arr[k-1] = temp;
                        break;
                    }
                }
                if(k-1 == 0){
                    arr[k] = temp;
                    break;
                }
                if(arr[k-1] <= temp){
                    arr[k] = temp;
                    break;
                }
            }
        }*/

        // Sample array {8, 2, 7, 1}
        // {8, 8, 7, 1} temp = 2;
        // {2, 8, 7, 1}

        // {2, 8, 8, 1} temp = 7
        // {2, 7, 8, 1}

        //{2, 7, 8, 8}  temp = 1
        //{2, 7, 7, 8}  temp = 1
        //{2, 2, 7, 8}  temp = 1
//        {1, 2, 7, 8}
        //The simple version
        for (int i = 1; i < arr.length; i++) {//Starting from second element and comparing it to the first element
            int temp = arr[i];
            int j = i;

            while (j > 0 && arr[j - 1] > temp) {/*While loop is better for this purpose. keep running the
                 loop as long as (till the end of the array is reached AND the previous element is greater than the current.)*/
                
                arr[j] = arr[j - 1];// assigns the value of the current index to the value of the previous element.
                j--;// decrements j by 1. to ensure that current index is assigned with the value of the previous element.
            }
            arr[j] = temp;// if while loop condition is false then no change, otherwise j will be decremented by 1.
        }

        System.out.println();
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
