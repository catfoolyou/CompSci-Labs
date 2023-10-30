import java.util.*;

public class Char{
   public static void main(String[] args){      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a single letter:");
      char letter = input.next().charAt(0);
      
      letter = Character.toLowerCase(letter);
      
      if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
         System.out.println(letter + " is a vowel letter.");      
      }
      else{
         System.out.println(letter + " is a constant letter.");
      }
      
   }
}