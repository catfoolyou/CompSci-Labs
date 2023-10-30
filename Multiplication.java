import java.util.*;

public class Multiplication{
   public static void main(String[] args){      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number (0 to exit):");
      
      int num = input.nextInt();
      int times = Math.abs(num);
      
      while(num != 0){
         for(int i = 0; i <= times; i++){
            System.out.println(i + " * " + num + " = " + (num * i));
         }
         
         System.out.println("Enter a number (0 to exit):");
         num = input.nextInt();
         times = Math.abs(num);
      }
   }
}