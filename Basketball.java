import java.io.*;
import java.util.*;

public class Basketball{

   public static Scanner input = new Scanner(System.in);

   public static void main(String argv[]){
      System.out.println("Enter the name for the home team:");
      String t = input.nextLine();
      System.out.println("Enter the name for the visiting team:");
      String tt = input.nextLine();
      
      int tscore = 0;
      int ttscore = 0;
      
      int tq1score = 0;
      int ttq1score = 0;
      
      int tq2score = 0;
      int ttq2score = 0;
      
      int tq3score = 0;
      int ttq3score = 0;
      
      int tq4score = 0;
      int ttq4score = 0;
      
      int thscore = 0;
      int tthscore = 0;
      
      System.out.println("Enter the " + t + " score for quarter 1:");
      tq1score = input.nextInt();
      System.out.println("Enter the " + tt + " score for quarter 1:");
      ttq1score = input.nextInt();
      System.out.println("Enter the " + t + " score for quarter 2:");
      tq2score = input.nextInt();
      System.out.println("Enter the " + tt + " score for quarter 2:");
      ttq2score = input.nextInt();
      System.out.println("Enter the " + t + " score for quarter 3:");
      tq3score = input.nextInt();
      System.out.println("Enter the " + tt + " score for quarter 3:");
      ttq3score = input.nextInt();
      System.out.println("Enter the " + t + " score for quarter 4:");
      tq4score = input.nextInt();
      System.out.println("Enter the " + tt + " score for quarter 4:");
      ttq4score = input.nextInt();
      
      thscore += (tq1score + tq2score);
      tthscore += (ttq1score + ttq2score);
      
      tscore = thscore + (tq3score + tq4score);
      ttscore = tthscore + (ttq3score + ttq4score);
      
      System.out.println(tq1score + " " + tq2score + " " + tq3score + " " + tq4score + " " + thscore + " " + tscore);
      System.out.println(ttq1score + " " + ttq2score + " " + ttq3score + " " + ttq4score + " " + tthscore + " " + ttscore);
      
      if (tscore > ttscore){
         System.out.println("The " + t + " win by " + (tscore - ttscore));
      }
      else {
         System.out.println("The " + tt + " win by " + (ttscore - tscore));
      }
      
   }

}