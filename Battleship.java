import java.io.*;
import java.util.*;

public class Battleship{   

   public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      Random random = new Random();
   
      List targetX = new ArrayList();
      List targetY = new ArrayList();
      
      if(random.nextInt(1) > 0){ 
         int x = random.nextInt(4) + 1;
         for(int i=0; i<4; i++)
         {
            targetX.add(x);
            x++;
         }
         int y = random.nextInt(4) + 1;
         for(int i=0; i<4; i++)
         {
            targetY.add(y);
         }
      }
      else{
         int x = random.nextInt(4) + 1;
         for(int i=0; i<4; i++)
         {
            targetX.add(x);
         }
         int y = random.nextInt(4) + 1;
         for(int i=0; i<4; i++)
         {
            targetY.add(y);
            y++;
         }
      }
      
      int row;
      int col;
            
      List shotX = new ArrayList();
      List shotY = new ArrayList();
      
      int shot[][] = new int[15][2];
      
      for (int i=0; i<15; i++){
      
         System.out.println("Pick a row to fire on:");
         row=input.nextInt();
         System.out.println("Pick a column to fire on:");
         col=input.nextInt();
      
         shotX.add(row - 1);
         shotY.add(col);
            
         System.out.println("  1 2 3 4 5 6 7");            
      
         for (int r=0; r<7; r++)
         {
            System.out.print(r + 1);
            for (int c=0; c<7; c++)
            {
               if (shotX.contains(r) && shotY.contains(c+1)){               
                  if (targetX.contains(r) && targetY.contains(c+1)){
                     System.out.print(" s");
                  }
                  else{
                     System.out.print(" x");
                  }
               }
               
               else{
                  System.out.print(" ~");
               }
            }
            System.out.println();
         }
      }
      System.out.println("Out of ammo!");
   }
}