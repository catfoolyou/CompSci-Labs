   //Name______________________________ Date_____________
   public class Lab20
   {
      public static void main(String[] args)
      {
         World.readWorld("shifty");
         World.setSize(10, 10);
         World.setSpeed(8);
      
         Thread t1 = new Thread( new Shifter(1) );
         Thread t2 = new Thread( new Shifter(2) );
         Thread t3 = new Thread( new Shifter(3) );
         Thread t4 = new Thread( new Shifter(4) );
      
         t1.start();
         t2.start();
         t3.start();
         t4.start();
      }
   }