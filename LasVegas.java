import java.io.*;
import java.util.*;
import java.util.Random;

public class LasVegas{

   public static void getInfo(String[] names)
   {
      Scanner input=new Scanner(System.in);
      for (int i=0; i<names.length; i++)
      {
         System.out.print("Enter a name: ");
         names[i]=input.nextLine();
      }
   }
   
   public static void winner(String[] names)
   {
      Scanner input = new Scanner(System.in);
      Random rand = new Random();
      int winner = rand.nextInt(5);
      System.out.println("\nThe winner for the Las Vegas trip is " + names[winner] + "!\n");
      int money = rand.nextInt(500);
      
      while (true){      
         System.out.println("Ok " + names[winner] + ", pick a number between 2 and 12");
         int choice = input.nextInt();    
         int one = rand.nextInt(12);
         if (one < 1 || one > 6){
            one = 1;
         }
         int two = rand.nextInt(12);
         if (two < 1 || two > 6){
            two = 1;
         }
         System.out.println("You rolled a " + one + " and a " + two + ". "); 
         if (one == choice || two == choice){
            System.out.println("You won 5 bucks!");
            money += 5;
           
         }
         else{
            System.out.println("You lost 5 bucks. What an idiot.");
            money -= 5;
         }
      }
   }
   
   public static void main(String argv[])
   {  
      String[] list = new String[5];				//user built array
      getInfo(list);
      winner(list);
      
   }

}