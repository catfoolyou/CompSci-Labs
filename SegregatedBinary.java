import java.util.*;
public class SegregatedBinary{

   public static int[] buildArray(){
      int[] arr = new int[(int)(Math.random() * 10) + 10];
      for(int i=0; i<arr.length; i++){
         if(Math.random() > 0.5){
            arr[i] = 0;
         }
         else{
            arr[i] = 1;
         }
      }
      return arr;
   }
   
   public static void printArray(int[] arr){
      System.out.print("[ ");
      for(int i=0; i<arr.length; i++){
         System.out.print(arr[i] + " ");
      }
      System.out.println("]\n");
   }
   
   public static int countZeros(int[] arr){
      int zero = 0;
      for(int i=0; i<arr.length; i++){
         if(arr[i] == 0){
            zero++;
         }
      }
      return zero;
   }
   
   public static int[] rearrange(int[] arr){
      int[] sorted = new int[arr.length];
      int one = arr.length - countZeros(arr);
      for(int i=arr.length-1; i>one; i--){
         sorted[i] = 1;
      }
      return sorted;
   }

   public static void printNumOfEach(int[] arr){
      int zero = 0;
      int one = 0;
      for(int i=0; i<arr.length; i++){
         if(arr[i] == 0){
            zero++;
         }
         if(arr[i] == 1){
            one++;
         }
      }
      System.out.println("Zeros: " + zero);
      System.out.println("Ones: " + one);
   }

   public static void main(String[] args){
      int[] arr = buildArray();
      int[] rearranged = rearrange(arr);
      System.out.println("Original array:");
      printArray(arr);
      printNumOfEach(arr);
      System.out.println("\nSegregated array:");
      printArray(rearranged);
   }
}