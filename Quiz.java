import java.io.*;
import java.util.*;

public class Quiz{

   public static Scanner input = new Scanner(System.in);
   
   public static void quiz(){
      System.out.println("Doom trivia quiz");
      String answer;
      double score = 0;
      
      System.out.println("Question 1: When was Doom 1 released?");
      answer = input.nextLine();
      if (!answer.equals("1993")){
        System.out.println("Worng.");
      }
      if (answer.equals("1993")) {
         System.out.println("Correct.");
         score++;
      }
      
      System.out.println("Question 2: What is the most annoying enemy in Doom 2?");
      answer = input.nextLine();
      answer = answer.toLowerCase();
      if (!answer.equals("arch vile")){
        System.out.println("Worng.");
      }
      if (answer.equals("arch vile")) {
         System.out.println("Correct.");
         score++;
      }
      
      System.out.println("Question 3: Who manufactured the shotgun that was used in the game?");
      answer = input.nextLine();
      answer = answer.toLowerCase();
      if (!answer.equals("tootsie toy")){
        System.out.println("Worng.");
      }
      if (answer.equals("tootsie toy")) {
         System.out.println("Correct.");
         score++;
      }
      
      System.out.println("Question 4: When did Doom 1 get a fourth episode?");
      answer = input.nextLine();
      if (!answer.equals("1995")){
        System.out.println("Worng.");
      }
      if (answer.equals("1995")) {
         System.out.println("Correct.");
         score++;
      }
      System.out.println("Question 3: What developer's head was used in the Icon of Sin?");
      answer = input.nextLine();
      answer = answer.toLowerCase();
      if (!answer.contains("romero")){
        System.out.println("Worng.");
      }
      if (answer.contains("romero")) {
         System.out.println("Correct.");
         score++;
      }
      
      System.out.println("You got " + score + " out of 5 questions right.");
   }
   
   public static void main(String args[]){
      quiz();
   }
}