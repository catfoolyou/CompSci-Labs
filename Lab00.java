public class Lab00 {
   
   public static void main(String[] arg){
   
      World.readWorld("first");
      World.setSize(10, 10);
      World.setSpeed(6);
      
      Robot karel = new Robot();
      karel.move();
      karel.pickBeeper();
      karel.move();
      karel.turnLeft();
      karel.move();
      karel.putBeeper();
      karel.move();
      karel.turnLeft();
      karel.turnLeft();
      
   }
}