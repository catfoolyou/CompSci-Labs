import java.util.*;
import java.io.*;

public class Client{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("How many players (2 - 4)?");
      int plrNum = input.nextInt();
      
      Player p1 = new Player("Bob");
      Player p2 = new Player("Joe");
      Player p3 = new Player("Bill");
      Player p4 = new Player("Kevin");
      
      Board b = new Board();
      
      while(p1.getSpace() < 100 && p2.getSpace() < 100 && p3.getSpace() < 100 && p4.getSpace() < 100){
      
         if(plrNum >= 1){
            int spin = b.spin();
            System.out.println(p1.getName() + " spins: " + spin);
            int newLoc = b.getNewLocation(p1.getSpace(), spin);
            p1.setSpace(newLoc);
            System.out.println(p1.getName() + " is on space " + p1.getSpace());  
            System.out.println("");
            System.out.println("");
         }
         
         if(p1.getSpace() == 100){
            System.out.println(p1.getName() + " wins!");
            break;
         }
         
         if(plrNum >= 2){
            int spin = b.spin();
            System.out.println(p2.getName() + " spins: " + spin);
            int newLoc = b.getNewLocation(p2.getSpace(), spin);
            p2.setSpace(newLoc);
            System.out.println(p2.getName() + " is on space " + p2.getSpace());  
            System.out.println("");
            System.out.println("");
         }
         
         if(p2.getSpace() == 100){
            System.out.println(p2.getName() + " wins!");
            break;
         }
         
         if(plrNum >= 3){
            int spin = b.spin();
            System.out.println(p3.getName() + " spins: " + spin);
            int newLoc = b.getNewLocation(p3.getSpace(), spin);
            p3.setSpace(newLoc);
            System.out.println(p3.getName() + " is on space " + p3.getSpace());  
            System.out.println("");
            System.out.println("");
         }
         
         if(p3.getSpace() == 100){
            System.out.println(p3.getName() + " wins!");
            break;
         }
         
         if(plrNum >= 4){
            int spin = b.spin();
            System.out.println(p4.getName() + " spins: " + spin);
            int newLoc = b.getNewLocation(p4.getSpace(), spin);
            p4.setSpace(newLoc);
            System.out.println(p4.getName() + " is on space " + p4.getSpace());  
            System.out.println("");
            System.out.println("");
         }     
         
         if(p4.getSpace() == 100){
            System.out.println(p4.getName() + " wins!");
            break;
         }  
      }
   }
}