import java.io.*;
import java.util.*;

public class TicTacToe{   

   public static void main(String args[]){
   
      Scanner input=new Scanner(System.in);
      Random random = new Random();
      
      int choice = 0;
      int choice2 = 0;
            
      boolean end = true;
      
      int[][] win = {
         {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
         {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
         {0, 4, 8}, {2, 4, 6}            
         };
      
      String[] board = new String[9];
      
      for (int i = 0; i < 9; i++) {
         board[i] = " ";
      }
      
      System.out.println("0" + " | " + "1" + " | " + "2");
      System.out.println("---------");
      System.out.println("3" + " | " + "4" + " | " + "5");
      System.out.println("---------");
      System.out.println("6" + " | " + "7" + " | " + "8");
            
      while(end){      
         System.out.println("Choose an space to place an X");
         choice = input.nextInt();
         while(!(choice >= 0 && choice < 9) || !(board[choice] == " ")){
            System.out.println("Invalid spot");
            choice = input.nextInt();
         }
         
         System.out.println("Choose an space to place an O");
         choice2 = input.nextInt();
         while(!(choice2 >= 0 && choice2 < 9) || !(board[choice2] == " ")){
            System.out.println("Invalid spot");
            choice2 = input.nextInt();
         }
               
         if((board[choice] == " ")){
            board[choice] = "X";
         }
         
         if((board[choice2] == " ")){
            board[choice2] = "O";
         }
         
         //System.out.println("You chose " + choice + "\nBot chose " + choice2 + "\n");
         
         System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
         System.out.println("---------");
         System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
         System.out.println("---------");
         System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
         
         for (int i = 0; i < win.length; i++) {
            int a = win[i][0];
            int b = win[i][1];
            int c = win[i][2];
         
            if (board[a].equals("X") && board[b].equals("X") && board[c].equals("X")) {
               System.out.println("Player 1 wins!");
               end = false;
               break;
            }
         }
         
         for (int i = 0; i < win.length; i++) {
            int a = win[i][0];
            int b = win[i][1];
            int c = win[i][2];
         
            if (board[a].equals("O") && board[b].equals("O") && board[c].equals("O")) {
               System.out.println("Player 2 wins!");
               end = false;
               break;
            }
            if(!(Arrays.asList(board).contains(" "))){
               System.out.println("Tie.");
               end = false;
               break;
            }
         }         
      }
   }
}
