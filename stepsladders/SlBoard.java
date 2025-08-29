package stepsladders;

public class SlBoard
{
    private final static int WINNING_POSITION = 100;
    private final static int[][] MOVE_ADJUSTMENTS = {
        {1, 38}, {4, 14}, {9, 31}, {21, 42}, {28, 84}, {36, 44}, {51, 67}, {71, 91}, {80, 100},
        {16, 6}, {47, 26}, {49, 11}, {56, 53}, {62, 19}, {64, 60}, {87, 24}, {93, 73}, {95, 73}, {98, 73}};


    public int adjustedMovePosition(int movedToPosition)
    {
        int adjustedPosition = movedToPosition;
        for (int i=0; i<MOVE_ADJUSTMENTS.length; i++)
        {
            if (MOVE_ADJUSTMENTS[i][0] == movedToPosition)
            { adjustedPosition = MOVE_ADJUSTMENTS[i][1]; break; }
        }
        return adjustedPosition;
    }

    public boolean isWinningPosition(int position)
    { return WINNING_POSITION <= position; }
}