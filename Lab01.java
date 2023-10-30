public class Lab01 {
   
   public static void main(String[] arg) {
   
      World.readWorld("school");
      World.setSize(10, 10);
      World.setSpeed(6);
      
      Robot lisa = new Robot();
      Robot pete = new Robot(4, 5, 1, 0);
      lisa.move();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.pickBeeper();
      lisa.turnLeft();
      lisa.turnLeft();
      lisa.move();
      lisa.turnLeft();
      lisa.turnLeft();
      lisa.turnLeft();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.move();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.move();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.move();
      lisa.turnLeft();
      lisa.turnLeft();
      lisa.turnLeft();
      lisa.move();
      lisa.putBeeper();
      pete.pickBeeper();
      pete.move();
      pete.turnLeft();
      pete.move();
      pete.move();
      pete.turnLeft();
      pete.move();
      pete.move();
      pete.turnLeft();
      pete.turnLeft();
      pete.turnLeft();
      pete.move();
      pete.move();
      pete.turnLeft();
      pete.move();
      pete.turnLeft();
      pete.move();
      pete.move();
      pete.turnLeft();
      pete.turnLeft();
      pete.turnLeft();
      pete.move();
      pete.move();
      pete.turnLeft();
      pete.move();
      pete.move();
      pete.putBeeper();

   }   
   
}