import java.util.*;
import java.util.Scanner;

public class Palindromes{

   public static void getInput(ArrayList<String> w){
      String s = "";
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter an input, or -1 to exit: ");
      s = input.next();
      
      while (! s.equals("-1")) {
         w.add(s);
         System.out.println("Enter an input, or -1 to exit: ");
         s = input.next();
      }
   }
   
   public static void getPalindromes(ArrayList<String> w, ArrayList<String> p){
      for (String word : w) {
         if (isPalindromeRecursive(word)) {
            p.add(word);
         }
      }
   }
   
   public static boolean isPalindromeRecursive(String word){
      if (word.length() <= 1){
         return true;
      }
   
      if (word.charAt(0) != word.charAt(word.length() - 1)){
         return false; 
      }
   
      return isPalindromeRecursive(word.substring(1, word.length() - 1));
   }

   public static void main(String args[]){
      ArrayList<String> words = new ArrayList<String>();
      ArrayList<String> palindromes = new ArrayList<String>();
      
      getInput(words);
      getPalindromes(words, palindromes);
            
      System.out.println("All inputs: ");
      System.out.print(words);
      
      System.out.println("\n");
      
      System.out.println("Palindromes: ");
      System.out.print(palindromes);
   
      
   }

}