package stepsladders;

public class SlPlayerGenerator 
{
    private static final String[] PLAYER_NAMES = {"Bob", "Joe", "Bill", "Kevin"};
    
    public static SlPlayer[] newGamePlayers(SlBoard gameBoard, SlSpinner spinner)
    {
        return fillWithPlayers(newPlayersArray(), gameBoard, spinner);
    }

    private static SlPlayer[] fillWithPlayers(
        SlPlayer[] gamePlayersArray, SlBoard gameBoard, SlSpinner spinner)
    {
        for (int i=0; i<gamePlayersArray.length; i++)
        { gamePlayersArray[i] = new SlPlayer(PLAYER_NAMES[i], spinner, gameBoard); }
        return gamePlayersArray;
    }

    private static SlPlayer[] newPlayersArray()
    { return new SlPlayer[(int)(Math.random()*PLAYER_NAMES.length)]; }
}