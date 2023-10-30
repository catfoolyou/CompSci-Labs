public class Lab02 {

   public static void main(String[] arg){
      World.readWorld("maze");
      World.setSize(10, 10);
      World.setSpeed(9);
   
      Athlete bob = new Athlete();
      bob.move();
      bob.turnRight();
      bob.move();
      bob.turnLeft();
      bob.move();
      bob.turnLeft();
      bob.move();
      bob.turnRight();
      bob.move();
      bob.move();
      bob.move();
      bob.turnRight();
      bob.move();
      bob.move();
      bob.move();
      bob.move();
      bob.turnRight();
      bob.move();
      bob.move();
      bob.move();
      bob.turnLeft();
      bob.move();
      bob.turnLeft();
      bob.move();
      bob.move();
      bob.turnRight();
      bob.move();
      bob.move();
   }

}