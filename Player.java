import java.util.*;
import java.io.*;

public class Player{
   private String name;
   private int space;
   
   public Player(String n){
      space = 0;
      name = n;
   }
   
   public void setSpace(int s){
      space = s;
   }
      
   public String getName(){
      return name;
   }
   
   public int getSpace(){
      return space;
   }
   
   public String toString(String name, int space){
      return name + " is on space " + space;
   }
   
   public boolean hasWon(int space){
      if(space != 100){
         return false;
      }
      else{
         return true;
      }
   }
}