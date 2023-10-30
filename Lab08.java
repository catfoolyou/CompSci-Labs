   import java.io.*;				//lets us prepare for an IOException from getting input from the keyboard
   import java.util.*;
    public class Lab08
   {
       public static void race(Racer arg)
      {
         while(!arg.onABeeper())
         {
            if(arg.frontIsClear())
            {
               arg.move();
            }
            else
            {
               arg.jumpRight();
            }
         }
      }
       public static void main(String[] args) 
      {
         Scanner input = new Scanner(System.in);//this object allows us to get input from the keyboard
         String filename, type;						//these will store the name of the map to load and the name of the racer type to use
            
         System.out.println("What robot world would you like to load?");//hurdle1, hurdle2, hurdle3, steeple1, steeple2, steeple3, boxtop1, boxtop2, boxtop3
         filename = input.nextLine();							
      			
         System.out.println("What type of racer do you want to use?");//Racer, BoxRacer or SteepleRacer?
         type = input.nextLine();   
            
         World.readWorld(filename);
         World.setSize(18, 16);
         World.setSpeed(10);
      
         if(type.equals("Racer"))
         {
            race(new Racer(1));
         }
         else 
            if(type.equals("SteepleRacer"))
            {
               race(new SteepleRacer(1));
            }
            else 
               if(type.equals("BoxRacer"))
               {
                  race(new BoxRacer(1));
               }
               else
               {
                  System.out.println("Invalid robot type.");
               }
      }
   }