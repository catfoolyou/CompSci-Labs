package stepsladders;

public class SlGame
{
    public static void main(String[] args)
    {
        SlBoard gameBoard = new SlBoard();
        SlSpinner spinner = new SlSpinner();
        SlPlayer[] newGamePlayers =
            SlPlayerGenerator.newGamePlayers(gameBoard, spinner);

        boolean gameOn = true;
        int playerIndex;
        while(gameOn)
        {
            for (
                playerIndex=0;
                playerIndex<newGamePlayers.length && gameOn;
                playerIndex++)
            {
                gameOn = !gameBoard.isWinningPosition(
                    newGamePlayers[playerIndex].makeAMove());
                System.out.println("\n");
                if (!gameOn)
                { System.out.println(newGamePlayers[playerIndex].getName() + " wins!"); }
            }
        }
    }
}