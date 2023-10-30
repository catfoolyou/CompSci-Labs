import java.io.*;
import java.util.*;

public class Battleship2{   

   public static void main(String args[]){
   
      Scanner input=new Scanner(System.in);
      Random random = new Random();
      
      String [][] map = new String[8][8];
      
      List targetX = new ArrayList();
      List targetY = new ArrayList();
      
      if(random.nextInt(1) > 0){ 
         int x = random.nextInt(4);
         for(int i=0; i<4; i++)
         {
            targetX.add(x);
            x++;
         }
         int y = random.nextInt(4);
         for(int i=0; i<4; i++)
         {
            targetY.add(y);
         }
      }
      else{
         int x = random.nextInt(4);
         for(int i=0; i<4; i++)
         {
            targetX.add(x);
         }
         int y = random.nextInt(4);
         for(int i=0; i<4; i++)
         {
            targetY.add(y);
            y++;
         }
      }
            
      int row = 0;
      int col = 0;
      int hits = 0;
      
      for (int r = 0; r < map.length; r++)
      {
         for(int c = 0; c < map[0].length; c++)
         {
            map[r][c] = "~";
         }
      }
            
      for (int i=0; i<15 && hits<4; i++){
           
         System.out.println("  0 1 2 3 4 5 6 7");
         
         for(int r = 0; r < map.length; r++)
         {  
            System.out.print(r + " ");
            for(int c = 0; c < map[0].length; c++)
            {
               System.out.print(map[r][c] + " ");
            }
            System.out.println();
         }
         
         System.out.println("Pick a row to fire on:");
         row=input.nextInt();
         System.out.println("Pick a column to fire on:");
         col=input.nextInt(); 
         
         map[row][col] = "x";
         if (targetX.contains(row) && targetY.contains(col)){
            map[row][col] = "!";
            hits++;
         }
         
         if(hits==4){
            break;
         }
      }
      if (hits==4){
         System.out.println("You win!");
      }
      else{
         System.out.println("Out of ammo!");
      }
   }
}