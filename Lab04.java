public class Lab04 {
   public static void climbRight(Climber arg){
      arg.climbUpRight();
      arg.climbUpRight();
      arg.climbUpRight();
      arg.climbDownRight();
      arg.climbDownRight();
      arg.climbDownRight();
   }
   
   public static void climbLeft(Climber arg){
      arg.climbUpLeft();
      arg.climbUpLeft();
      arg.climbUpLeft();
      arg.climbDownLeft();
      arg.climbDownLeft();
      arg.climbDownLeft();
   }
   
   public static void climbLeftBeep(Climber arg){
      arg.climbUpLeft();
      arg.pickBeeper();
      arg.climbUpLeft();
      arg.climbUpLeft();
      arg.climbDownLeft();
      arg.climbDownLeft();
      arg.climbDownLeft();
   }

   public static void main(String[] arg){
      World.readWorld("mountain");
      World.setSize(10,10);
      World.setSpeed(10);

      Climber Bob = new Climber();
      climbRight(Bob);
      Bob.turnRight();
      Bob.move();
      Bob.move();
      Bob.turnLeft();
      climbRight(Bob);
      climbLeftBeep(Bob);
      Bob.turnLeft();
      Bob.move();
      Bob.move(); 
      Bob.turnRight();
      climbLeft(Bob);

   }
   
}
