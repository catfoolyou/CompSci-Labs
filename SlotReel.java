import java.util.*;
import java.io.*;

public class SlotReel{
   public int value;
      
   public void spin(){
      value = (int)(Math.random() * 6) + 1;
   }
   
   public boolean equals(SlotReel reel){
      return(value == reel.value);
   }
      
   public String toString(){
      String[] num = {"", "Diamond", "Heart", "Spade", "Horseshoe", "Star", "Liberty Bell"};
      return num[value];
   }
}