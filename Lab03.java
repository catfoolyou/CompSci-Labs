public class Lab03 {
   public static void takeTheField(Athlete arg){
      arg.move();
      arg.move();
      arg.move();
      arg.move();
      arg.turnRight();
      arg.move();
   }

   public static void main(String[] arg){
      World.readWorld("arena");
      World.setSize(10,10);
      World.setSpeed(10);
      
      Athlete one = new Athlete();
      Athlete two = new Athlete();
      Athlete three = new Athlete();
      Athlete four = new Athlete();
      Athlete five = new Athlete();
      Athlete six = new Athlete();
      Athlete coach = new Athlete(2, 5, 0, 0);
   
      takeTheField(one);
      takeTheField(two);
      takeTheField(three);
      takeTheField(four);
      takeTheField(five);
      takeTheField(six);
      
      one.move();
      one.move();
      one.move();
      one.turnRight();
      
      two.move();
      two.move();
      two.move();
      two.move();
      two.turnRight();
      
      three.move();
      three.move();
      three.move();
      three.move();
      three.move();
      three.turnRight();
      
      four.move();
      four.move();
      four.move();
      four.move();
      four.turnLeft();
      four.move();
      four.move();
      four.turnLeft();
      four.turnLeft();
      
      five.move();
      five.move();
      five.move();
      five.move();
      five.move();
      five.move();
      five.turnLeft();
      five.move();
      five.turnLeft();
      five.turnLeft();
      
      six.move();
      six.move();
      six.turnLeft();
      six.move();
      six.turnLeft();
      six.turnLeft();
   }
}
