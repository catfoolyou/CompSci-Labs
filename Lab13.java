import java.io.*;				//lets us prepare for an IOException from getting input from the keyboard
import java.util.*;

public class Lab13{

   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);//this object allows us to get input from the keyboard
      System.out.println("What robot world would you like to load?");//map1, map2 or map3
      String filename = input.nextLine();
      
      World.readWorld(filename);
      World.setSize(8, 8);
      World.setSpeed(10);
        
      Pirate karel = new Pirate();
      int totalBeepers = 0;
      int pileCount = 0;
      
      while(pileCount != 5){
         karel.approachPile();
         pileCount = karel.countBeepersInPile();
         totalBeepers = totalBeepers + pileCount;
         
         if(pileCount != 5){
            karel.turnAppropriately(pileCount);
         }
      }
      System.out.println("Total beepers: " + totalBeepers);
   }
}