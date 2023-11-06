import java.util.*;

public class Client{

   private static final String[] PLAYER_NAMES = {"Bob", "Joe", "Bill", "Kevin"};

//   private static final int MAX_MOVES = 1000;

   private static void nextMoveFor(Player player)
   {
      int spin = Board.spin();
      System.out.println(player.getName() + " spins: " + spin);
      player.setSpace(Board.getNewLocation(player.getSpace(), spin));
      System.out.println(player + "\n\n");
   }
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("How many players (2 - 4)?");
      int gamePlayersNumber = input.nextInt();

//      if (gamePlayersNumber>4 || gamePlayersNumber<2)
//      {
//         System.out.println("Number of players must be 2, 3 or 4.");
//         System.out.println("Please, enter a valid number next time you start the game simulator.");
//         return;
//      }

      Player[] players = new Player[gamePlayersNumber];
      for (int i=0; i<gamePlayersNumber; i++)
      { players[i] =  new Player(PLAYER_NAMES[i]); }

      boolean gameEnded = false;
//      int moveCount = 0;

      while(!gameEnded)
      {
//         moveCount++;
         for (int i=0; i<gamePlayersNumber; i++)
         {
            nextMoveFor(players[i]);
            if (players[i].hasWon())
            {
               System.out.println(players[i].getName() + " wins!");
               gameEnded = true;
               break;
            }
         }
//         if (MAX_MOVES <= moveCount && !gameEnded)
//         {
//            gameEnded = true;
//            System.out.println("Everybody got tired. The game is not going anywhere. We go home!");
//         }
      }
   }
}