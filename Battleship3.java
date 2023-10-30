/**
* Copyright (c) FCPS Hayfield Secondary, 2023
*/

public class Battleship3
{
   public static void main(String[] args)
   {
      Initialize game board with '~': create game board array. call method to fill it
      Determine if ship will be horizontal or vertical
      Initialize ship coordiantes: create a 2-D array of pairs [x,y]: int[][] ship = new int[][]. call method to fill it
      Initialize maxAmmo (15)
      Initialize hitsCount with 0
      start game shot loop (i from 0 to i < maxAmmo && hitsCount<4)
      for each shot loop execution       
        - Display game board. call method to do that
        - read user shot coords: x, y
        - [future] verify x in 0-7, y in 0-7
        - set board value at the user shot coords to 'x'
        - start hit check loop over ship coordinate (j from 0 to j<4)
        - for each hit check loop execution
          compare ship coordinate#1 (x) with user shot x coord and ship coordinate#2 (y) with user shot y coord
          if matches
            increase hitsCount
            set board value at the user shot coords to '!'
      after shot loop completion
         - display game board
         - if hitsCount == 4 show 'win' message
            else show 'loose/out of ammo' message
            
   }
      
   public static void initGameBoard(String[][] board)
   {}
   
   public static void initVerticalShip(int[][] ship)
   {}
   
   public static void initHorizontalShip(int[][] ship)
   {}
   
   public static void displayGameBoard(String[][] board)
   {}
}