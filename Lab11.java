public class Lab11{

   public static void main(String[] args){         
      World.setSize(36, 32);
      World.setSpeed(12);
      
      Digit one = new One(1, 9);
      Digit six = new Six(7, 9);
      Digit five = new Five(13, 9);
      Digit siix = new Six(19, 9);
      Digit three = new Three(25, 9);
      Digit four = new Four(31, 9);
      Digit siiix = new Six(37, 9);
      
      one.display();
      six.display();
      five.display();
      siix.display();
      three.display();
      four.display();
      siiix.display();
      
      //Renderer temp = new Renderer(7, 9); move move turnleft move move move move turnright
      
   }
}