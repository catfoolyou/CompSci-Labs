import java.io.*;				//lets us prepare for an IOException from getting input from the keyboard
import java.util.*;

public class Lab10{

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);//this object allows us to get input from the keyboard
      String filename, type;						//these will store the name of the map to load and the name of the racer type to use
            
      System.out.println("What robot world would you like to load?");
      filename = input.nextLine();
         
      World.readWorld(filename); //maze 1 - 3
      World.setSize(10, 10);
      World.setSpeed(10);
      
      Athlete temp = new Athlete();
      
      while(!temp.onABeeper()){
         if(temp.rightIsClear() && !temp.frontIsClear() && !temp.leftIsClear()){
            temp.turnRight();
            temp.move();
         }
         else if(temp.leftIsClear()){
            temp.turnLeft();
            temp.move();
         }
         else if(temp.frontIsClear() && !temp.leftIsClear()){
            temp.move();
         }
         else{
            temp.turnAround();
         }
      }
   }
}