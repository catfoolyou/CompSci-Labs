 //Name______________________________ Date_____________
public class Lab18
{
   public static void main(String[] args)
   {
      World.setSize(10, 10);
      World.setSpeed(8);
      
      World.setBackgroundColor(java.awt.Color.cyan); //set new colors for the world
      World.setWallColor(java.awt.Color.white);
      World.setGridColor(java.awt.Color.blue);
      
      Thread t1 = new Thread( new Swimmer(2) );
      Thread t2 = new Thread( new Swimmer(4) );
      Thread t3 = new Thread( new Swimmer(6) );
      Thread t4 = new Thread( new Swimmer(8) );
      
      t1.start();
      t2.start();
      t3.start();
      t4.start();
   }
}