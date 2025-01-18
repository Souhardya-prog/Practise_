

 /*Given an integer array nums, move all 0's to the end of it while maintaining the
  *relative order of the non-zero elements.
  */
 import java.util.Scanner;
 public class Move_ZeroesTo_EndOF_Array
 {
     /*public int moveZeroes(int nums[]){

     }*/
     /*public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter number of elements of array");
         int n =sc.nextInt();

         int arr[] = new int[n];
         int length = arr.length;
         System.out.println("Enter the array of "+n+" terms");
         for(int i = 0; i< length; i++){
             arr[i] = sc.nextInt();
         }


         System.out.println("Original array:");
         for(int i = 0; i< length; i++){
             System.out.print(arr[i]+" ");
         }
         //int arr[] = {1, 0, 0, 3, 2, 8};

         //Move the zeroes to the end of the array

         for(int i = 0; i< length; i++){
             if(arr[i] == 0){
                 for(int j = i+1; j< length; j++){
                     if( arr[j] !=0){// if the next term is not 0 then replace the positions of the 0 and the next term(term).
                         arr[i] = arr[j];
                         arr[j] = 0;
                         break;//IMP
                     }
                 }
             }
         }
         System.out.println();
         System.out.println("New array where zeroes are at the end:");
         for(int i = 0; i< length; i++){
             System.out.print(arr[i]+" ");
         }
     }*/






         // Function to move all zeroes to the end of the array
         public static void moveZeroes(int[] nums) {
             int nonZeroIndex = 0; // Pointer to place the next non-zero element

             // Iterate through the array
             for (int i = 0; i < nums.length; i++) {
                 if (nums[i] != 0) {
                     // Swap only if nonZeroIndex is not the current index
                     if (i != nonZeroIndex) {
                         nums[nonZeroIndex] = nums[i];
                         nums[i] = 0;
                     }
                     nonZeroIndex++;
                 }
             }
         }

         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter number of elements of array:");
             int n = sc.nextInt();

             int[] arr = new int[n];
             System.out.println("Enter the array of " + n + " terms:");
             for (int i = 0; i < n; i++) {
                 arr[i] = sc.nextInt();
             }

             System.out.println("Original array:");
             for (int i = 0; i < n; i++) {
                 System.out.print(arr[i] + " ");
             }

             // Move the zeroes to the end of the array
             moveZeroes(arr);

             System.out.println();
             System.out.println("New array where zeroes are at the end:");
             for (int i = 0; i < n; i++) {
                 System.out.print(arr[i] + " ");
             }
         }
     }


