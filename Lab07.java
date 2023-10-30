import java.io.*;				//lets us prepare for an IOException from getting input from the keyboard
import java.util.*;
public class Lab07
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);   //this object allows us to get input from the keyboard
      String filename, type;						   //these will store the name of the map to load and the name of the climber type to use
      int avenue;										   //this will store the avenue to start on
   
      System.out.println("What robot world would you like to load?"); //mountain1, mountain2, mountain3, step1, step2, step3, hill1, hill2, hill3
      filename = input.nextLine();							
   			
      System.out.println("What type of climber do you want to use?"); //Climber, HillClimber or StepClimber?
      type = input.nextLine();		
      							
      System.out.println("What avenue to start on?");						
      System.out.println("8 for a Climber, 10 for a HillClimber or 12 for a StepClimber");
      avenue = input.nextInt();
      
      World.readWorld(filename);
      World.setSize(17, 15);
      World.setSpeed(10);
      
      if(type.equals("Climber"))
      {
         Mountain.explore(new Climber(avenue));
      }
      else 
         if(type.equals("HillClimber"))
         {
            Mountain.explore(new HillClimber(avenue));
         }
         else 
            if(type.equals("StepClimber"))
            {
               Mountain.explore(new StepClimber(avenue));
            }
            else
            {
               System.out.println("Invalid robot type.");
            }
   }
}