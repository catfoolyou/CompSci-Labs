public class StepClimber extends Climber
{
   public StepClimber()
   {
      super(1);
   }
   
   public StepClimber(int x)
   {
      super(x);
   }
   
   public void climbUpRight(){
      turnLeft();
      move();
      turnRight();
      move();
   }
   
   public void climbDownRight(){
      move();
      turnRight();
      move();
      turnLeft(); 
   }
   
   public void climbUpLeft(){
      turnRight();
      move();
      turnLeft();
      move();
   }
   
   public void climbDownLeft(){
      move();
      turnLeft();
      move();
      turnRight();
   }
      
}