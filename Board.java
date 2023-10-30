import java.util.*;
import java.io.*;

public class Board{
   public Board(){}
   
   public static int spin(){
      return (int)(Math.random() * 6) + 1;
   }

   public static int getNewLocation(int location, int spin){
      if(location == 1){
         System.out.println("Congratulations, you landed on a ladder taking you from " + location + " to " + 38);
         return 38;
      }
      if(location == 4){
         System.out.println("Congratulations, you landed on a ladder taking you from " + location + " to " + 14);
         return 14;
      }
      if(location == 9){
         System.out.println("Congratulations, you landed on a ladder taking you from " + location + " to " + 31);
         return 31;
      }
      if(location == 16){
         System.out.println("Uh oh! You landed on a chute taking you from " + location + " to " + 6);
         return 6;
      }
      if(location == 21){
         System.out.println("Congratulations, you landed on a ladder taking you from " + location + " to " + 42);
         return 42;
      }
      if(location == 28){
         System.out.println("Congratulations, you landed on a ladder taking you from " + location + " to " + 84);
         return 84;
      }
      if(location == 36){
         System.out.println("Congratulations, you landed on a ladder taking you from " + location + " to " + 44);
         return 44;
      }
      if(location == 47){
         System.out.println("Uh oh! You landed on a chute taking you from " + location + " to " + 26);
         return 26;
      }
      if(location == 49){
         System.out.println("Uh oh! You landed on a chute taking you from " + location + " to " + 11);
         return 11;
      }
      if(location == 51){
         System.out.println("Congratulations, you landed on a ladder taking you from " + location + " to " + 67);
         return 67;
      }
      if(location == 56){
         System.out.println("Uh oh! You landed on a chute taking you from " + location + " to " + 53);
         return 53;
      }
      if(location == 62){
         System.out.println("Uh oh! You landed on a chute taking you from " + location + " to " + 19);
         return 19;
      }
      if(location == 64){
         System.out.println("Uh oh! You landed on a chute taking you from " + location + " to " + 60);
         return 60;
      }
      if(location == 71){
         System.out.println("Congratulations, you landed on a ladder taking you from " + location + " to " + 91);
         return 91;
      }
      if(location == 80){
         System.out.println("Congratulations, you landed on a ladder taking you from " + location + " to " + 100);
         return 100;
      }
      if(location == 87){
         System.out.println("Uh oh! You landed on a chute taking you from " + location + " to " + 24);
         return 24;
      }
      if(location == 93){
         System.out.println("Uh oh! You landed on a chute taking you from " + location + " to " + 73);
         return 73;
      }
      if(location == 95){
         System.out.println("Uh oh! You landed on a chute taking you from " + location + " to " + 75);
         return 73;
      }
      if(location == 98){
         System.out.println("Uh oh! You landed on a chute taking you from " + location + " to " + 78);
         return 73;
      }
      else{
         int newLocation = location + spin;
         while(newLocation > 100){
            newLocation --;
         }
         System.out.println("You advance from " + location + " to " + newLocation);
         return newLocation;
      }
   }
}