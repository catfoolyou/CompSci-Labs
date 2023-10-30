   public class Athlete extends Robot
   {
      public Athlete()
      {
         super(1, 1, World.NORTH, World.INFINITY);
      }
      
      public Athlete(int x, int y, int dir, int beep)
      {
         super(x, y, dir, beep);
      }
      
      public void turnAround()
      {
         turnLeft();
         turnLeft();
      }
      
      public void turnRight()
      {
         turnLeft();
         turnLeft();
         turnLeft();    
      }
   }