import java.io.*;
import java.util.*;

public class Piglatin{

   public static Scanner input = new Scanner(System.in);

   public static String toPig(String word){
      //String word, output;
      //System.out.println("Enter a word");
      //word = input.nextLine();
      if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u' ){
         return word + "way"; // replace return with output =
      }
      else{
         return word.substring(1) + word.substring(0,1) + "ay";
      }
      //System.out.println(output);
   }
   
   public static void main(String Args[]){
      System.out.println("Enter a word");
      System.out.println(toPig(input.nextLine()));
   }

}
