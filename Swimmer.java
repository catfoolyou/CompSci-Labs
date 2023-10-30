	//Name______________________________ Date_____________

    public class Swimmer extends Athlete implements Runnable
   {
       public Swimmer(int x)
      {
         super(x, 1, World.NORTH, 0);
      }
      
       public void run() //must be called run, not swim
      {
      }
   }