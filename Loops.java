import java.io.*;
import java.util.*;

public class Loops{

   public static Scanner input = new Scanner(System.in);
   
   public static void main(String Args[]){
      int s = 0;
      int e = 0;
      int n = 0;
      
      while (!(s < e)){
         System.out.println("Enter the first number:");
         s = input.nextInt();
         System.out.println("Enter the second number:");
         e = input.nextInt();
      }
      
      n = s;
      while (n*n*n < e){
         System.out.print(n + " ");
         System.out.print(n*n + " ");
         System.out.print(n*n*n + " ");
         System.out.println();
         n++;
      }
      
      System.out.println();
      
      for(int r=0; r<5; r++){
         for(int c=0; c<5; c++){
            System.out.print("*");
         }
         System.out.println();     
      }
      
      System.out.println();
      int x = 1;      
      for(int r=0; r<5; r++){
         for(int c=0; c<x; c++){
            System.out.print("*");
            
         }
         x++;
         System.out.println();     
      }
      
      System.out.println();
      x = 1;   
      for(int r=0; r<5; r++){
         for(int z=0; z<(5-r); z++){
               System.out.print(" ");
         }
         for(int c=0; c<x; c++){
            System.out.print("*");
         }
         x++;
         System.out.println();     
      }
   }

}
