//Name______________________________ Date_____________
public class Lab16
{
   public static final int SIZE = 10;		//controls the size of the world and the array sizes

//post: counts and returns the total number of Robots in array a whose fronts are blocked or 
//      whose avenue >= SIZE 
   public static int numDone(Robot[] a)
   {
      int count = 0;
      //***COMPLETE THIS METHOD***
    
      return count;
   }

//post: counts and returns the total number of Robots in array a whose (fronts are blocked or 
//      whose avenue >= SIZE) and that are not facing SOUTH
   public static int numWinners(Robot[] a)
   {
      int count = 0;
     //***COMPLETE THIS METHOD***
     
      return count;
   }

 //post:  advance arg's position if it is not at a wall or the enemy camp (avenue >= SIZE)
 //	    if we collide with an enemy robot, face arg south and move towards the bottom of the field
   public static void advance(Robot arg)
   {
      if(arg.facingWest() && arg.avenue()==1)	//made it to the enemy base, so stop
         return;
      if(arg.facingEast() && arg.avenue()==SIZE)//made it to the enemy base, so stop
         return;
      if(arg.street()==1)								//left the playing field, so stop
         return;
      if(arg.onARobot())					//here, we get kicked off the playing field
      {
         while(!arg.facingSouth())		//make arg face South and move off the field
            arg.turnLeft();
         while(arg.frontIsClear())
            arg.move();
      }
      else										
         if(arg.frontIsClear() && Math.random() < .5)	//flip a coin to see if we move
            arg.move();
         
   }

   public static void main(String[] args)
   {
      World.setSize(SIZE+1, SIZE+1);
      World.setSpeed(20);
   
      Robot [] squad = new Robot[SIZE];
      for(int i=0; i<squad.length; i++)
         squad[i] = new Robot(1, i+2, World.EAST, 0, "pics/knight/karel");
         
      Robot [] army = new Robot[SIZE];
      for(int i=0; i<army.length; i++)
         army[i] = new Robot(SIZE, i+2, World.WEST, 0, "pics/worstFear/karel");
   
      int squadCount = 0;
      int armyCount = 0;
      while((squadCount + armyCount) < (SIZE*2))
      {
         for(int i=0; i<squad.length; i++)
         {
            if(Math.random() < .5)					//to be fair, flip a coin to see who moves first
            {
               advance(squad[i]);
               advance(army[i]);
            }
            else
            {
               advance(army[i]);
               advance(squad[i]);
            }
         }
         squadCount = numDone(squad);
         armyCount = numDone(army);
      }
      squadCount = numWinners(squad);
      armyCount = numWinners(army);
   
      if(squadCount > armyCount)
         System.out.println("Knights wins by " + (squadCount - armyCount));
      else
         if(squadCount < armyCount)
            System.out.println("Elephants wins by " + (armyCount - squadCount));
         else
            System.out.println("It's a TRAP!...I mean...a tie.");
   
   }
}