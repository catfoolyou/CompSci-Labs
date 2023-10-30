	//Name______________________________ Date_____________
   import java.io.*;				//lets us prepare for an IOException from getting input from the keyboard
   import java.util.*;

   public class Lab21
   {
      public static void escape_the_maze(MazeEscaper arg)
      {
         while(!arg.onABeeper())						//while not out of the maze
         {
            arg.walkDownCurrentSegment();			//make a step to get you closer to finding your way out
         }
      }
      public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);//this object allows us to get input from the keyboard
         String filename;								//this will store the name of the map to load
            
         System.out.println("What robot world would you like to load?");//maze1, maze2 or maze3
         filename = input.nextLine();
         World.readWorld(filename);
         World.setSize(8, 8);
         World.setSpeed(10);
         escape_the_maze( new INSERT_ROBOT_TYPE_HERE() );
      }
   }