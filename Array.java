import java.io.*;
import java.util.*;

public class Array{

   public static void getInfo(int[] nums)throws IOException
   {
      Scanner input=new Scanner(System.in);
      for (int i=0; i<nums.length; i++)
      {
         System.out.print("Enter a number to add to the array: ");
         nums[i]=input.nextInt();
      }
   }
   
   public static void average(int[] nums)
   {
      int total = 0;
      for (int i=0; i<nums.length; i++)
      {
         total += nums[i];
      }
      total /= nums.length;
      System.out.println("The average is " + total);
   }
   
   
   public static void show(int[] nums)
   {
      for (int i=0; i<nums.length; i++)
      {
         System.out.print(nums[i] + " ");
      }	
      System.out.println();
      System.out.println("Size of array: " + nums.length);
   }
   
   public static void main(String argv[])throws IOException
   {  
      int[] list = new int[10];				//user built array
      getInfo(list);
      average(list);
      show(list);
   }
}