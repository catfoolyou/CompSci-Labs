public class Board
{
   public static int spin(){
      return (int)(Math.random() * 6) + 1;
   }

   private static final int[][] LADDERS = {
     {1, 38}, {4, 14}, {9, 31}, {21, 42}, {28, 84}, {36, 44}, {51, 67}, {71, 91}, {80, 100}};
   private static final int[][] CHUTES = {
     {16, 6}, {47, 26}, {49, 11}, {56, 53}, {62, 19}, {64, 60}, {87, 24}, {93, 73}, {95, 73}, {98, 73}};
   private static String CONGRATS = "Congratulations, you landed on a ladder taking you from ";
   private static String UH_OH = "Uh oh! You landed on a chute taking you from ";
   private static String TO = " to ";

   private static int adjustedNewPositionWith(
      int[][] shortcutsData, int position)
   {
      int newPosition = 0;
      for (int i=0; i<shortcutsData.length; i++)
      {
         if (position == shortcutsData[i][0])
         { newPosition = shortcutsData[i][1]; break; }
      }
      return newPosition;
   }

   public static int getNewLocation(int currentPosition, int spinnerValue)
   {
      int newPositionAfterSpin = currentPosition + spinnerValue;
      int effectiveNewPosition = adjustedNewPositionWith(LADDERS, newPositionAfterSpin);
      if (0 != effectiveNewPosition)
      {
         System.out.println(CONGRATS + newPositionAfterSpin + TO + effectiveNewPosition);
         return effectiveNewPosition;
      }
      effectiveNewPosition = adjustedNewPositionWith(CHUTES, newPositionAfterSpin);
      if (0 != effectiveNewPosition)
      {
         System.out.println(UH_OH + currentPosition + TO + effectiveNewPosition);
         return effectiveNewPosition;
      }
      effectiveNewPosition = Math.min(newPositionAfterSpin, 100);
      System.out.println("You advance from " + currentPosition + " to " + effectiveNewPosition);
      return effectiveNewPosition;
   }
}