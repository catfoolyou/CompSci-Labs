public class Lab05 {

   public static void getBeepers(Racer arg){
      for (int i=0; i<2; i++){
         arg.sprint(2);
         arg.pickBeeper();
      }
   }
   
   public static void shuttleRun(Racer arg){
      arg.move();
      arg.jumpRight();
      arg.move();
      arg.pickBeeper();
      getBeepers(arg);
      arg.turnAround();
      for (int i=0; i<2; i++){
         arg.turnLeft();
      }
      arg.sprint(6);
      arg.jumpLeft();

   }

   public static void main(String[] arg){
      /*for (int i=0; i<5; i++){
         System.out.println("text");
      }*/
      
      /*int test = 1;

      while(true){
         System.out.println(test);
         test++;         
      }*/

      World.readWorld("shuttle");
      World.setSize(10,10);
      World.setSpeed(10);

      Racer Bob = new Racer(1, 1, 0, 0);
      Racer Bill = new Racer(1, 4, 0, 0);
      Racer Joe = new Racer(1, 7, 0, 0);
      
      shuttleRun(Bob);
      shuttleRun(Bill);
      shuttleRun(Joe);

      }
}