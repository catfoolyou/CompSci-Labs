package stepsladders;

import java.util.HashMap;
import java.util.Map;

public class SlPlayer
{
    private final String name;
    private final SlSpinner spinner;
    private final SlBoard gameBoard;
    private int position = 0;

    private final Map<Boolean, String> MESSAGES = new HashMap<>();
    {
        this.MESSAGES.put(Boolean.TRUE, "Congratulations, you landed on a ladder taking you from ");
        this.MESSAGES.put(Boolean.FALSE, "Uh oh! You landed on a chute taking you from ");
    }

    public SlPlayer(String name, SlSpinner spinner, SlBoard gameBoard)
    { this.name = name; this.spinner = spinner; this.gameBoard = gameBoard; }

    public String getName() { return name; }

    public int makeAMove()
    {
        int spunNumber = this.spinner.spin();
        System.out.println(this.name + " spins: " + spunNumber + ".");
        int advancePosition = (this.position + spunNumber);
        System.out.println(this.name + " advances from " + this.position + " to " + advancePosition + ".");
        int adjustedPosition = this.gameBoard.adjustedMovePosition(advancePosition);
        if (adjustedPosition != advancePosition)
        { this.printAdjustmentMessageFor(advancePosition, adjustedPosition); }
        this.position = adjustedPosition;
        System.out.println(this);
        return this.position;
    }

    private void printAdjustmentMessageFor(int advancePosition, int adjustedPosition)
    {
        System.out.println(
            this.MESSAGES.get(adjustedPosition > advancePosition) + advancePosition + " to " + adjustedPosition + "!");
    }

    @Override
    public String toString()
    { return this.name + " is on space " + this.position + "."; }
}