public class Climber extends Athlete
{
   public Climber()
   {
      super(1, 1, World.NORTH, World.INFINITY);
   }
   
   public Climber(int x)
   {
      super(x, 1, World.NORTH, World.INFINITY);
   }
   
   public void climbUpRight(){
      turnLeft();
      move();
      move();
      turnRight();
      move();
   }
   
   public void climbDownRight(){
      move();
      turnRight();
      move();
      move();
      turnLeft(); 
   }
   
   public void climbUpLeft(){
      turnRight();
      move();
      move();
      turnLeft();
      move();
   }
   
   public void climbDownLeft(){
      move();
      turnLeft();
      move();
      move();
      turnRight();
   }
}