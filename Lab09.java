import java.io.*;				//lets us prepare for an IOException from getting input from the keyboard
import java.util.*;

public class Lab09{

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);//this object allows us to get input from the keyboard
      String filename, type;						//these will store the name of the map to load and the name of the racer type to use
            
      System.out.println("What robot world would you like to load?");
      filename = input.nextLine();
         
      World.readWorld(filename);
      World.setSize(10, 10);
      World.setSpeed(10);
      
      Athlete temp = new Athlete(1, 1, World.EAST, 0);
      int count = 0;
      int buffer = 0;
      
      for(int i=0; i<8; i++){
         while(temp.onABeeper()){
            temp.pickBeeper();
            count ++;
         }
         while(buffer > 0){
            temp.putBeeper();
            buffer --;
         }  
         temp.move();
         buffer = count;
         count = 0;
         
         //pick and count all
         //count = buffer
         //place "buffer" beepers
         //rinse & repeat
      }
      //System.out.println(count);
   }
}