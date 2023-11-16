package stepsladders;

public class SlPlayer
{
    private String name;
    private final SlSpinner spinner;
    private final SlBoard gameBoard;
    private int position = 0;

    public SlPlayer(String name, SlSpinner spinner, SlBoard gameBoard)
    { this.name = name; this.spinner = spinner; this.gameBoard = gameBoard; }

    public int makeAMove()
    {
        int spinnedNumber = this.spinner.spin();
        this.position = this.gameBoard.adjustedMovePosition(
            this.position + spinnedNumber);
        return this.position;
    }
}