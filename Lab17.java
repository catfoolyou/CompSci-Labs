 //Name______________________________ Date_____________
 //define each of the methods using recursion - no loops allowed
   public class Lab17
   {
      public static void main(String[] args) 
      {
         World.readWorld("tasks99");													
         World.setSize(10, 10);														
         World.setSpeed(10);
         
         Robot temp = new Robot(1, 1, World.EAST, 0, "pics/fish/karel");
         followBeeperRoad(temp);				//go to the end of the row of beepers
         
         temp = new Robot(1, 2, World.EAST, 0, "pics/gorilla/karel");
         findTheBeeper(temp);					//go to the beeper
         
         temp = new Robot(1, 3, World.EAST, 0, "pics/mouse/karel");
         findTheWall(temp); 					//go to the wall
         
         temp = new Robot(1, 4, World.EAST, 0, "pics/shark/karel");
         findTheWallAndClean(temp); 		//go to the wall, pick up all the beepers (max one per pile)
         
         temp = new Robot(1, 5, World.EAST, 0, "pics/fish/karel");
         followBeeperRoadAndReturn(temp);	//go to the end of the row of beepers, then return back to your starting pont
         
         temp = new Robot(1, 6, World.EAST, 0, "pics/gorilla/karel");
         findTheBeeperAndReturn(temp);		//go to the beeper, then return back to your starting point
      	
         temp = new Robot(1, 7, World.EAST, 0, "pics/mouse/karel");
         findTheWallAndReturn(temp); 		//go to the wall, then return back to your starting point
      }
      
   	//**************COMPLETE THE METHODS BELOW**************************************************
      public static void followBeeperRoad(Robot temp)	
      { //go to the end of the row of beepers
        
      }
      
      public static void findTheBeeper(Robot temp)	
      { //go to the beeper
               
      }
      
      public static void findTheWall(Robot temp)	
      { //go to the wall
              
      }
      
      public static void findTheWallAndClean(Robot temp)	
      { //go to the wall, pick up all the beepers (max one per pile)
        
      }
      
      public static void followBeeperRoadAndReturn(Robot temp)	
      { //go to the end of the row of beepers, then return back to your starting point
         
      }
   
      public static void findTheBeeperAndReturn(Robot temp)	
      { //go to the beeper, then return back to your starting point
        
      }
   
   
      public static void findTheWallAndReturn(Robot temp)	
      { //go to the end of the row of beepers, then return back to your starting point
        
      }
   
   }