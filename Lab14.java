import java.io.*;				//lets us prepare for an IOException from getting input from the keyboard
import java.util.*;

public class Lab14{

   public static void checkForBeepers(Athlete temp){
   while (true){
      boolean validPath = false;
      if(!temp.onABeeper() && validPath == false){
         temp.turnAround();
         temp.move();
         temp.turnAround();
      }
      temp.turnLeft();
      temp.move();
      if(temp.onABeeper()){
         validPath = true;
         break;
      }
      if(!temp.onABeeper() && validPath == false){
         temp.turnAround();
         temp.move();
         temp.turnAround();
      }
      temp.turnAround();
      temp.move();
      if(temp.onABeeper()){
         validPath = true;
         break;
      }
      if(!temp.onABeeper() && validPath == false){
         temp.turnAround();
         temp.move();
         temp.turnRight();
         break;      
      }     
   }
   }

   public static void followPath(Athlete temp){
      while(temp.onABeeper()){
         temp.move();
      }
      checkForBeepers(temp);
   }
   
   public static void followLine(Athlete temp){
      followPath(temp);
   }

   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);//this object allows us to get input from the keyboard
      System.out.println("What robot world would you like to load?");//path1 or 2
      String filename = input.nextLine();
      
      World.readWorld(filename);
      World.setSize(10, 10);
      World.setSpeed(12);
      
      Athlete Bob = new Athlete(2, 2, World.EAST, 0);
      
      if (filename == "path1"){
         for(int i=0; i<2; i++){
            followLine(Bob);
         }
      }
      else{
         for(int i=0; i<11; i++){
            followLine(Bob);
         }
      }    
   }
}
