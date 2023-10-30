import java.io.*;				//module for getting input from the keyboard
import java.util.*;

public class Lab06
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in); //keyboard input
   
      System.out.println("What world would you like to load?");
      String filename = input.nextLine();						
      World.readWorld(filename);						
      World.setSize(10, 10);								
      World.setSpeed(10);
   
      followBeeperRoad_1();		//go to the end of the row of beepers
      findTheBeeper();				//go to the beeper
      findTheWall(); 				//go to the wall
      findTheWallAndClean_1(); 	//go to the wall, pick up all the beepers (max one per pile)
      findTheWallAndClean_2(); 	//go to the wall, pick up all the beepers
      followBeeperRoad_2();		//go to the end of the row of beepers, there is one gap
   }
   
   public static void followBeeperRoad_1()	
   { //go to the end of the row of beepers
      Robot temp = new Robot(1, 1, World.EAST, 0, "pics/fish/karel");
      while(temp.onABeeper()){
         temp.move();
      }
   }
   
   public static void findTheBeeper()	
   { //go to the beeper
      Robot temp = new Robot(1, 2, World.EAST, 0, "pics/gorilla/karel");
      while(!temp.onABeeper()){
         temp.move();
      }
   }
   
   public static void findTheWall()	
   { //go to the wall
      Robot temp = new Robot(1, 3, World.EAST, 0, "pics/mouse/karel");
      while(temp.frontIsClear()){
         temp.move();
      }
   
   }
   
   public static void findTheWallAndClean_1()	
   { //go to the wall, pick up all the beepers (max one per pile)
      Robot temp = new Robot(1, 4, World.EAST, 0, "pics/shark/karel");
      while(temp.frontIsClear()){
         if(temp.onABeeper()){
            temp.pickBeeper();
         }
      temp.move();
      }
   
   }
   
   public static void findTheWallAndClean_2()	
   { //go to the wall, pick up all the beepers
      Robot temp = new Robot(1, 5, World.EAST, 0, "pics/wolf/karel");
      while(temp.frontIsClear()){
         while(temp.onABeeper()){
            temp.pickBeeper();
         }
      temp.move();
      }   
   }
   
   public static void followBeeperRoad_2()
   { //go to the end of the row of beepers, there is one gap
      Robot temp = new Robot(1, 6, World.EAST, 0, "pics/fish/karel");
      while(temp.onABeeper()){
         temp.move();
      }
      // check for beepers (methods in API docs deprecated, TJ idiots...)
      temp.move();
      boolean nextToBeep = false;
      if(temp.onABeeper()){
         for(int i=0; i<2; i++){
            temp.turnLeft();
         }
         temp.move();
         for(int i=0; i<2; i++){
            temp.turnLeft();
         }
         nextToBeep = true;
      }
      else{
         temp.move();
      }
      // keep going
      if(nextToBeep){
         temp.move();
      }
      while(temp.onABeeper()){
         temp.move();
      }
   }
}